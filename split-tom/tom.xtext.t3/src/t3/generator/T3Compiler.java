package t3.generator;

import java.io.PrintStream;
import java.util.ResourceBundle;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

import tom.engine.Tom;

public class T3Compiler {
	
	private MessageConsole out;
	private IConsoleManager manager;
	
	public T3Compiler() {
		out = new MessageConsole("Tom Compilation",null);
		manager = ConsolePlugin.getDefault().getConsoleManager();
		manager.addConsoles(new IConsole[]{out});
	}
	
	/**
	 * arg 0 : pwd
	 * arg 1 : output folder
	 * arg 2 : source file
	 * arg 3 : tom.properties
	 * arg 4 : host code output(j:java, c:C)
	 */
	public void compile(String pwd,String dirName,String fileName,ResourceBundle properties,String host) {
		String share=".";
		try{
			for(String impor : properties.getString("imports").split(" ")){
				share+=":"+pwd+impor;
			}
		}catch(Exception e){}
		PrintStream error = System.err;
		try(PrintStream stream = new PrintStream(out.newMessageStream())){
			String xml = pwd+properties.getString("tom.xml"); 
			String[] arg = new String[]{
					host,"-I",share,"-X",xml,"-d",dirName,"--noStatic",dirName+"/"+fileName
			};
			manager.showConsoleView(out);
			out.clearConsole();
			System.setErr(stream);
			if(properties.getString("compile").equals("true")){
				System.err.println("start Compilation");
				Tom.exec(arg);
				System.err.println("end Compilation");
			}else{
				System.err.println("Compilation disabled");
			}
			System.setErr(error);
		}catch(Exception e){
			System.err.println("Exception raised in compilation");
			System.setErr(error);
		}
		System.setErr(error);
	}
	
	public MessageConsoleStream out(){
		manager.showConsoleView(out);
		return out.newMessageStream();
	}
}
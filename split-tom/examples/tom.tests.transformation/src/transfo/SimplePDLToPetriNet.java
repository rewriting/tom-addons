package transfo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import SimplePDLSemantics.DDMMSimplePDL.DDMMSimplePDLPackage;
import SimplePDLSemantics.DDMMSimplePDL.WorkDefinition;
import SimplePDLSemantics.DDMMSimplePDL.WorkSequence;
import petrinetsemantics.DDMMPetriNet.PetriNet;
import petrinetsemantics.DDMMPetriNet.Place;
import tom.library.emf.EcoreContainmentIntrospector;
import tom.library.sl.Strategy;
import tom.library.sl.VisitFailure;
import tom.library.utils.LinkClass;

public class SimplePDLToPetriNet implements SimplePDLToPetriNetTomi{
	
	private SimplePDLToPetriNetTom tom;
	private Writer writer;
	
	private PetriNet pn = null;
	private LinkClass tom__linkClass;

	private  petrinetsemantics.DDMMPetriNet.Place  tom_make_ResolveWorkDefinitionPlace( SimplePDLSemantics.DDMMSimplePDL.WorkDefinition  tom_resolve_element_attribute_o,  String  tom_resolve_element_attribute_name) { return new ResolveWorkDefinitionPlace(tom_resolve_element_attribute_o, tom_resolve_element_attribute_name);}private boolean tom_is_fun_sym_ResolveWorkDefinitionPlace( petrinetsemantics.DDMMPetriNet.Place  t) {return  ( t instanceof ResolveWorkDefinitionPlace ) ;}private  SimplePDLSemantics.DDMMSimplePDL.WorkDefinition  tom_get_slot_ResolveWorkDefinitionPlace_tom_resolve_element_attribute_o( petrinetsemantics.DDMMPetriNet.Place  t) {return  ((ResolveWorkDefinitionPlace)t).tom_resolve_element_attribute_o ;}private  String  tom_get_slot_ResolveWorkDefinitionPlace_tom_resolve_element_attribute_name( petrinetsemantics.DDMMPetriNet.Place  t) {return  ((ResolveWorkDefinitionPlace)t).tom_resolve_element_attribute_name ;}private static class ResolveWorkDefinitionPlace extends  petrinetsemantics.DDMMPetriNet.impl.PlaceImpl  {
	  public String tom_resolve_element_attribute_name;
	  public  SimplePDLSemantics.DDMMSimplePDL.WorkDefinition  tom_resolve_element_attribute_o;

	  public ResolveWorkDefinitionPlace( SimplePDLSemantics.DDMMSimplePDL.WorkDefinition  o, String name) {
	    this.tom_resolve_element_attribute_name = name;
	    this.tom_resolve_element_attribute_o = o;
	  }
	}
	
	public SimplePDLToPetriNet() {
		tom = new SimplePDLToPetriNetTom(this);
		this.tom__linkClass = new LinkClass();
	}

	 public void run(String[] args){
		    System.out.println("\nStarting...\n");

		    XMIResourceImpl resource = new XMIResourceImpl();
		    SimplePDLSemantics.DDMMSimplePDL.Process p_root;
		    Map opts = new HashMap();
		    opts.put(XMIResource.OPTION_SCHEMA_LOCATION, java.lang.Boolean.TRUE);

		    if (args.length>0) {
		      DDMMSimplePDLPackage packageInstance = DDMMSimplePDLPackage.eINSTANCE;
		      File input = new File(args[0]);
		      try {
		        resource.load(new FileInputStream(input),opts);
		      } catch (Exception e) {
		        e.printStackTrace();
		      }
		      p_root = (SimplePDLSemantics.DDMMSimplePDL.Process) resource.getContents().get(0);
		    } else {
		      System.out.println("No model instance given in argument. Using default hardcoded model.");
		      WorkDefinition wd1 = tom.makeWorkDefinition(null,new BasicEList<WorkSequence>(),new BasicEList<WorkSequence>(),"A",null);
		      WorkDefinition wd2 = tom.makeWorkDefinition(null,new BasicEList<WorkSequence>(),new BasicEList<WorkSequence>(),"B",null);
		      WorkDefinition wd3 = tom.makeWorkDefinition(null,new BasicEList<WorkSequence>(),new BasicEList<WorkSequence>(),"C",null);
		      WorkDefinition wd4 = tom.makeWorkDefinition(null,new BasicEList<WorkSequence>(),new BasicEList<WorkSequence>(),"D",null);
		      //WorkSequence ws1 = WorkSequence(null,WorkSequenceTypestartToStart(),wd1,wd2);
		      //WorkSequence ws2 = WorkSequence(null,WorkSequenceTypestartToFinish(),wd3,wd4);

		      //p_root = Process("root",ProcessElementEList(wd1,wd2,ws1),null);
		      //SimplePDLSemantics.DDMMSimplePDL.Process p_child = Process("child",ProcessElementEList(wd3,wd4,ws2), wd2);

		      //wd1.setParent(p_root);
		      //wd2.setParent(p_root);
		      //wd2.setProcess(p_child);

		      //wd3.setParent(p_child);
		      //wd4.setParent(p_child);

		      //ws1.setParent(p_root);
		      //ws2.setParent(p_child);
		    }

		    try {
		      //this.pn = PetriNet(NodeEList(),ArcEList(),"main");

		      //System.out.println("Initial Petri net");
		      //`Sequence(TopDown(PrintTransition()),TopDown(PrintPlace())).visit(translator.pn, new EcoreContainmentIntrospector());

		      /*//transformer is equivalent to:
		      Strategy transformer = `Sequence(
		          TopDown(Process2PetriNet(translator)),
		          TopDown(WorkDefinition2PetriNet(translator)),
		          TopDown(WorkSequence2PetriNet(translator))
		       );
		       */

		      //NOTE: force the user to give the link as first parameter, and target
		      //model as second one
		      //Strategy transformer = SimplePDLToPetriNet(this.tom__linkClass,this.pn);
		      //transformer.visit(p_root, new EcoreContainmentIntrospector());
		      //tom.TopDown(tom__StratResolve_SimplePDLToPetriNet(this.tom__linkClass,this.pn)).visit(this.pn, new EcoreContainmentIntrospector());


		      //for generation of textual Petri nets usable as input for TINA
		      String outputName = "resultingPetri.net";
		      writer = new BufferedWriter(new OutputStreamWriter(new
		            FileOutputStream(new File(outputName))));

		      System.out.println("\nResult");
		      //Sequence(TopDown(PrintTransition()),TopDown(PrintPlace())).visit(this.pn,
		       //   new EcoreContainmentIntrospector());

		      System.out.println("\nFinish to generate "+outputName+" file, usable as input for TINA");
		      writer.flush();
		      writer.close();
		      System.out.println("done.");

		    //} catch(VisitFailure e) {
		    //  System.out.println("strategy fail!");
		    } catch(java.io.FileNotFoundException e) {
		      System.out.println("Cannot create Petri net output file.");
		    } catch (java.io.IOException e) {
		      System.out.println("Petri net save failed!");
		    }
		  }
	 
	 public static void main(String[] args) {
		 new SimplePDLToPetriNet().run(args);
	 }

	@Override
	public void multiPrint(String s) {
	    System.out.println(s);
	    try {
	      writer.write(s+"\n");
	    } catch (java.io.IOException e) {
	      System.out.println("Petri net save failed!");
	    }
	}

	@Override
	public void println(String s) {
		System.out.println(s);
	}

	@Override
	public void printArc(Place node1, Place node2) {
		 System.out.println(node1.getName() + " -> " + node2.getName());
	}


}

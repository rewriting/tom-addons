package mapping;

import java.util.Arrays;
import java.util.LinkedList;

import mapping.mappingtom.term.types.Term;
import mapping.mappingtom.term.types.term.a;
import mapping.mappingtom.term.types.term.b;
import tom.library.sl.Strategy;
import tom.library.sl.VisitFailure;

public class Mapping implements MappingTomi{
	
	MappingTom tom;
	
	public Mapping() {
		tom = new MappingTom(this);
	}
	
	public void iteration(Object x){
		System.out.println("iterate: " + x);
	}
	
	public void doublon(Object x){
		System.out.println("appears twice: " + x);
	}
	
	
	public void seul(Object x){
		System.out.println("appears only once: " + x);
	}
	
	public void run(){
		LinkedList<Integer> l = new LinkedList<>(Arrays.asList(1,2,3,1,4,3,1,1));
	    System.out.println("list = " + l);
	    
	    tom.match1(l);
	    tom.match2(l, l);
	    Strategy s = tom.new strat();
	    Term terma = a.make();
	    Term termb = b.make(terma);
	    try {
			s.visit(terma);
			System.out.println(s.visit(termb));
		} catch (VisitFailure e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		new Mapping().run();
	  }

	@Override
	public void visitA() {
		System.out.println("a visit");
	}

	@Override
	public Object getTermClass(Object arg3) {
		return arg3.getClass();
	}

	@Override
	public void visitB() {
		
	}
}
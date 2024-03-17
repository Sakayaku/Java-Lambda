package exercices;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main{
	public static <A> t3 <A> f3(){
		return ((Function<A,A> f,A x)-> f.apply(f.apply(x)));
	}
	public static <A,B,C,D> Function<A,D> comp2(Function <A,B> f1, Function<A,C> f2, BiFunction <B,C,D> g){
		return ((var->g.apply(f1.apply(var),f2.apply(var))));
	}
	public static <A,B,C> void main(String args[]) {  
		InterfaceExercice1a <Integer> f1=(var->(var+1));
		System.out.println(f1.traiter(3));
		InterfaceExercice1a <Integer> f2=(var->f1.traiter(var));
		System.out.println(f2.traiter(0));
		System.out.println(f3().apply(var->var+"x","a"));
		
		Function<Integer,Integer> f=(var->var+1);
		Function<Integer,Integer> g=(var->var*2);
		System.out.println(f.andThen(g).apply(3));
		
		Power <Integer> p=((var->(var*var)));
		System.out.println(p.power(2).apply(2));
		
		
		Function <Integer,Integer> cf1=(var->var+1);
		Function <Integer,Integer> cf2=(var->var*2);
		//System.out.println(comp2(var->var+1,var->var*2,Integer.max(0, 0)));
		System.out.println(comp2(cf1, cf2, Integer.max(cf1.apply(2),cf2.apply(2))));
		
	}
}

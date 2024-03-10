package exercices;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ClasseExercice1{
	public static <A> t3 <A> f3(){
		return ((Function<A,A> f,A x)-> f.apply(f.apply(x)));
	}
	public static t4 comp2(){
		return ((Function<A,A> f1,Function<A,A> f2,BiFunction <Function<A,A>,A,A> g, A x)-> g.andThen(f1,f2,x);
	}
	public static void main(String args[]) {  
		InterfaceExercice1a <Integer> f1=(var->(var+1));
		System.out.println(f1.traiter(3));
		InterfaceExercice1a <Integer> f2=(var->f1.traiter(var));
		System.out.println(f2.traiter(0));
		System.out.println(f3().apply(var->var+"x","a"));
		
		Function<Integer,Integer> f=(var->var+1);
		Function<Integer,Integer> g=(var->var*2);
		System.out.println(f.andThen(g).apply(3));
		
		Power<Integer,Integer> r= (var->f3.traiter());
		System.out.println(r.apply(2));
	}
}

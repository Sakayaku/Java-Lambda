package exercices;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main{
	public static <A> t3 <A> f3(){
		return ((Function<A,A> f,A x)-> f.apply(f.apply(x)));
	}
	public static <A,B,C,D> Interfacecomp2 <A,B,C,D> comp2(){
		return ((Function<A,B> cf1,Function<A,C> cf2, BiFunction<B,C,D> cf3) ->
			var -> cf3.apply(cf1.apply(var),cf2.apply(var)));
	}
	
	/*public static <A,B,C,D> Function<A,D> comp2(Function <A,B> f1, Function<A,C> f2, BiFunction <B,C,D> g){
		return ((var->g.apply(f1.apply(var),f2.apply(var))));
	}*/
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
		BiFunction <Integer,Integer,Integer> cf3= (var1,var2)->Integer.max(var1,var2);
		//System.out.println(comp2(cf1, cf2, cf3).apply(2));
		
		Function<String,Integer> cf4=(var->Integer.parseInt(var)+1);
		Function<String,Integer> cf5=(var->Integer.parseInt(var)*2);
		BiFunction<Integer,Integer,Integer> cf6=(var1,var2)->Integer.max(var1, var2);
		//System.out.println(comp2(cf1,cf2,cf3).apply("2"));
		
		Interfacecomp2 <Integer,Integer,Integer,Integer> comp2int = comp2();
		Interfacecomp2 <String,Integer,Integer,Integer> comp2str = comp2();
		
		System.out.println(comp2int.tcomp2(cf1, cf2, cf3).apply(2));
		System.out.println(comp2str.tcomp2(cf4, cf5, cf6).apply("2"));
	}
}

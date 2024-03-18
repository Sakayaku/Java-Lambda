package exercices;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FIter {

	public static <E> Iterable<E> map(Iterable<E> iterable, Function<E,E> instanceFonction) {
		Iterator<E> iterateur=iterable.iterator();
		ArrayList<E> resultat=new ArrayList<E>();
		E element;
		while (iterateur.hasNext()) {
			element=iterateur.next();
			element=instanceFonction.apply(element);
			resultat.add(element);
		}
		return resultat;
	}
	
	public static <E> Iterable<E> filter(Iterable<E> iterable, Predicate<E> instancePredicat) {
		Iterator<E> iterateur=iterable.iterator();
		ArrayList<E> resultat=new ArrayList<E>();
		E element;
		while (iterateur.hasNext()) {
			element=iterateur.next();
			if (instancePredicat.test(element)) {
				resultat.add(element);
			}
		}
		return resultat;
	}
	
	
	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(0);
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		l1.add(7);
		l1.add(8);
		Function<Integer,Integer> f=(var->var+1);
		System.out.println(map(l1,f));
		Predicate<Integer> pi4=(var->var<=4);
		Predicate<Integer> pi10=(var->var<=10);
		Predicate<Integer> ps4=(var->var>=4);
		Predicate<Integer> ps10=(var->var>=10);
		System.out.println(filter(l1,pi4));
		System.out.println(filter(l1,pi10));
		System.out.println(filter(l1,ps4));
		System.out.println(filter(l1,ps10));
	}

}

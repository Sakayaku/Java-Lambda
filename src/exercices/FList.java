package exercices;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class FList {
	
	public static <E> ArrayList<E> map(ArrayList<E> liste, Function<E,E> instanceFonction) {
		for (int i=0;i<liste.size();i++) {
			System.out.println(liste.get(i));
			liste.set(i, instanceFonction.apply(liste.get(i)));
		}
		return liste;
	}
	
	public static <E> ArrayList<E> filter(ArrayList<E> liste, Predicate<E> instancePredicat) {
		ArrayList<E> resultat=new ArrayList<>();
		for (int i=0;i<liste.size();i++) {
			if (instancePredicat.test(liste.get(i))){
				resultat.add(liste.get(i));
			}
		}
		return resultat;
	}
	
	public static <E> Boolean for_all(ArrayList<E> liste, Predicate<E> instancePredicat) {
		int somme=0;
		for (int i=0;i<liste.size();i++) {
			if (instancePredicat.test(liste.get(i))){
				somme+=0;
			}else {
				somme+=1;
			}
		}
		return somme==0;
	}
	
	public static <E> Boolean exist(ArrayList<E> liste, Predicate<E> instancePredicat) {
		for (int i=0;i<liste.size();i++) {
			if (instancePredicat.test(liste.get(i))){
				return true;
			}
		}
		return false;
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
		System.out.println(for_all(l1,pi4));
		System.out.println(for_all(l1,pi10));
		System.out.println(exist(l1,pi4));
		System.out.println(exist(l1,ps10));
	}

}

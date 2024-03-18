package exercices;

import java.util.function.BiFunction;
import java.util.function.Function;

public interface Interfacecomp2 <A,B,C,D>{
	Function<A,D> tcomp2(Function<A,B> cf1,Function<A,C> cf2, BiFunction<B,C,D> cf3);
}

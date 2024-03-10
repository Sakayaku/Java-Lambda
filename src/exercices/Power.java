package exercices;

import java.util.function.Function;

public interface Power <T,U> extends Function<T,U>{
	public abstract T power(T element1);
}

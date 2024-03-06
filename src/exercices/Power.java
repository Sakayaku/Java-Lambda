package exercices;

import java.util.function.Function;

public interface Power <T,U> extends Function<T,U>{
	@Override
	static <T> Function<T,T> identity() {
	}
}

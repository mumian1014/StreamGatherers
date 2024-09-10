import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Gatherer;

public class MyGatherers {

    public static <T, M> Gatherer<T, T, M> mapNotNull(Function<T, M> mapper) {
        return new MapNotNullGatherer<>(mapper);
    }
}
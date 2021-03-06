package zxf.java.functional;

import zxf.java.functional.checked.CheckedBiFunction;
import zxf.java.functional.checked.CheckedFunction;
import zxf.java.functional.checked.CheckedTriFunction;
import zxf.java.functional.tree.Mapped2LTree;
import zxf.java.functional.tree.Mapped3LTree;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Caching {
    public static <T, R> CheckedFunction<T, R> cachedFunction(CheckedFunction<T, R> realFunction) {
        final Map<T, R> cache = new HashMap<>();
        return cachedFunction(cache, realFunction);
    }

    public static <T, R> CheckedFunction<T, R> cachedFunction(Map<T, R> cache, CheckedFunction<T, R> realFunction) {
        return (t) -> {
            if (cache.containsKey(t)) {
                return cache.get(t);
            }
            R r = realFunction.apply(t);
            cache.put(t, r);
            return r;
        };
    }

    public static <T, U, R> CheckedBiFunction<T, U, R> cachedFunction(CheckedBiFunction<T, U, R> realFunction) {
        final Mapped2LTree<T, U, R> cache = new Mapped2LTree();
        return cachedFunction(cache, realFunction);
    }

    public static <T, U, R> CheckedBiFunction<T, U, R> cachedFunction(Mapped2LTree<T, U, R> cache, CheckedBiFunction<T, U, R> realFunction) {
        return (t, u) -> {
            if (cache.contains(t, u)) {
                return cache.get(t, u);
            }

            R r = realFunction.apply(t, u);
            cache.put(t, u, r);
            return r;
        };
    }

    public static <T, U, P, R> CheckedTriFunction<T, U, P, R> cachedFunction(CheckedTriFunction<T, U, P, R> realFunction) {
        final Mapped3LTree<T, U, P, R> cache = new Mapped3LTree();
        return cachedFunction(cache, realFunction);
    }

    public static <T, U, P, R> CheckedTriFunction<T, U, P, R> cachedFunction(Mapped3LTree<T, U, P, R> cache, CheckedTriFunction<T, U, P, R> realFunction) {
        return (t, u, p) -> {
            if (cache.contains(t, u, p)) {
                return cache.get(t, u, p);
            }

            R r = realFunction.apply(t, u, p);
            cache.put(t, u, p, r);
            return r;
        };
    }

    public static <T> Predicate<T> cachedPredicate(Predicate<T> realPredicate) {
        final Map<T, Boolean> cache = new HashMap<>();
        return cachedPredicate(cache, realPredicate);
    }

    public static <T, R> Predicate<T> cachedPredicate(Map<T, Boolean> cache, Predicate<T> realPredicate) {
        return (t) -> {
            if (cache.containsKey(t)) {
                return cache.get(t);
            }
            Boolean r = realPredicate.test(t);
            cache.put(t, r);
            return r;
        };
    }

    public static <T, U> BiPredicate<T, U> cachedPredicate(BiPredicate<T, U> realPredicate) {
        final Mapped2LTree<T, U, Boolean> cache = new Mapped2LTree();
        return cachedPredicate(cache, realPredicate);
    }

    public static <T, U> BiPredicate<T, U> cachedPredicate(Mapped2LTree<T, U, Boolean> cache, BiPredicate<T, U> realPredicate) {
        return (t, u) -> {
            if (cache.contains(t, u)) {
                return cache.get(t, u);
            }
            Boolean r = realPredicate.test(t, u);
            cache.put(t, u, r);
            return r;
        };
    }

    public static <T, U, P> TriPredicate<T, U, P> cachedPredicate(TriPredicate<T, U, P> realPredicate) {
        final Mapped3LTree<T, U, P, Boolean> cache = new Mapped3LTree();
        return cachedPredicate(cache, realPredicate);
    }

    public static <T, U, P> TriPredicate<T, U, P> cachedPredicate(Mapped3LTree<T, U, P, Boolean> cache, TriPredicate<T, U, P> realPredicate) {
        return (t, u, p) -> {
            if (cache.contains(t, u, p)) {
                return cache.get(t, u, p);
            }

            Boolean r = realPredicate.test(t, u, p);
            cache.put(t, u, p, r);
            return r;
        };
    }
}

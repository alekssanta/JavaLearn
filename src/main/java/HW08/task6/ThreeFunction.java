package HW08.task6;

@FunctionalInterface
interface ThreeFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}

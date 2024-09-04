package den.lesson_three;

public class Pair<K, V> {
    private final K first;
    private final V second;

    public Pair(K key,V value){
        first = key;
        second = value;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return  "Pair(first=" + first + ", second=" + second + ')';
    }
}

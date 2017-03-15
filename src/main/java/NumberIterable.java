import java.util.Iterator;

/**
 * Created by gol on 15.03.2017.
 */
public class NumberIterable implements Iterable<Integer> {

    private int from;
    private int to;

    NumberIterable(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new NumberIterator(from, to);
    }
}

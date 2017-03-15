import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by gol on 14.03.2017.
 */
public class NumberIterator implements Iterator<Integer> {

    private int last;
    private int next;

    NumberIterator(int from, int to) {
        next = from;
        last = to;
    }

    @Override
    public boolean hasNext() {
        return next <= last;
    }

    @Override
    public Integer next() {

        if (!hasNext()) {
            throw new NoSuchElementException();
        }
//        int next = next;
//        next++;
//        return next;

        return next++;
    }
}

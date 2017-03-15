import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by gol on 14.03.2017.
 */
public class NumberIterator implements Iterator {

    private Set<Integer> numbers = new TreeSet<>();
    Integer first;
    Integer second;
    Integer x = first;

    NumberIterator(Iterator iterator) {

    }

    NumberIterator(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean hasNext() {
        if (x <= second) {
            x++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        return x;
    }
}

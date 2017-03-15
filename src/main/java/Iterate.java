import java.util.ArrayList;
import java.util.List;

/**
 * Created by gol on 14.03.2017.
 */
public class Iterate {


    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);

        NumberIterator iterator = new NumberIterator(1, 10);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

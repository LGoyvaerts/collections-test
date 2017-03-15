/**
 * Created by gol on 14.03.2017.
 */
public class Iterate {


    public static void main(String[] args) {

        NumberIterator iterator = new NumberIterator(-111111, 1000000);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        for (int i : new NumberIterable(1, 10)) {
            System.out.println(i);
        }

        for (int i : Numbers.range(1, 10)) {
            System.out.println(i);
        }

    }
}

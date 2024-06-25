import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursion {
    public static void main(String[] args) {
        List<Integer> x = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> n = new ArrayList<>(x);
        print(n);
        System.out.println(n);
    }

    public static void print(List<Integer> n) {
        List<Integer> x = new ArrayList<>(n);
        if (x.size() > 0) {
            System.out.println("i: " + x.get(0));
            x.remove(0);
            print(x);
        } else {
            System.out.print("Done: ");
        }
    }
}

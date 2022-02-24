import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ConvertData {
    public int[] convertIntegers(List<Integer> integers) {
        int[] ret = new int[integers.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }

    public static void main(String[] args) {
        ConvertData cd = new ConvertData();
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.forEach(
        s -> System.out.println(s));
        System.out.println(Arrays.toString(cd.convertIntegers(l)));
    }

}

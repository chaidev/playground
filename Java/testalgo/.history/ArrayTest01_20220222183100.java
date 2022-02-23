import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class ArrayTest01 {
    public static void main(String[] args) {
        int result = 1; 
        int[] inta = new int[]{-2,3,4,2,5};
        Integer[] aInt = new Integer[inta.length];
        Arrays.setAll(aInt, i -> inta[i]);
        List<Integer> myArrayList = new ArrayList<Integer>(aInt);
        for (Integer a : myArrayList) {
            if (a < 0) {
                System.out.println("A < 0.........." + result);
                continue;
            } else {
                if (a == result) {
                    System.out.println("A == Result");
                    result++;
                } else {
                    break;
                }
            }
            // if (result == a) {
            // //System.out.println("testing: " + result + " vs " + a);
            // result++;

            // if (!myArrayList.contains(result)) {
            // System.out.println(result);
            // break;
            // }
            // }
        }
        System.out.println("Result: ============" + result);
    }
}

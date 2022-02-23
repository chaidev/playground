import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ArrayTest01 {
    public static void main(String[] args) {
        int result = 1; 
        int[] inta = new int[]{-2,3,1,1,2,5};
        Integer[] aInt = new Integer[inta.length];
        Arrays.setAll(aInt, i -> inta[i]);
        List<Integer> myArrayList = new ArrayList<Integer>(Arrays.asList(aInt));
        Collections.sort(myArrayList);
        Set<Integer> myArraySet = new HashSet<Integer>(myArrayList);
        for (Integer a : myArraySet) {
            System.out.println(a);
            if (a < 0) {
                //System.out.println("A < 0.........." + result);
                continue;
            } else {
                if (a == result) {
                    System.out.println("A == Result");
                    result++;
                } else {
                    break;
                }
            }
        
        }
        return result;
    }

    int findMaxInt()
}

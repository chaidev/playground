import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ArrayTest01 {
    public static void main(String[] args) {
        int[] inta = new int[]{-2,3,1,1,2,5};
        System.out.println(findMaxInt(inta));
    }

    //55%
    static int findMaxInt(int[] A) {
        int result = 1; 
        
        Integer[] aInt = new Integer[A.length];
        Arrays.setAll(aInt, i -> A[i]);
        List<Integer> myArrayList = new ArrayList<Integer>(Arrays.asList(aInt));
        Collections.sort(myArrayList);
        Set<Integer> myArraySet = new HashSet<Integer>(myArrayList);
        for (Integer a : myArraySet) {
            if (a < 0) {
                continue;
            } else {
                if (a == result) {
                    result++;
                } else {
                    break;
                }
            }
        
        }
        return result;
    }

    static int findMaxIntV2(int[] A) {
        int result = 1; 
        
        Integer[] aInt = new Integer[A.length];
        Arrays.setAll(aInt, i -> A[i]);
        List<Integer> myArrayList = new ArrayList<Integer>(Arrays.asList(aInt));
        Collections.sort(myArrayList);
        Set<Integer> myArraySet = new HashSet<Integer>(myArrayList);
        
        Arrays.stream(intArr).boxed().collect(Collectors.toList());  
        
        for (Integer a : myArraySet) {
            if (a < 0) {
                continue;
            } else {
                if (a == result) {
                    result++;
                } else {
                    break;
                }
            }
        
        }
        return result;
    }
}

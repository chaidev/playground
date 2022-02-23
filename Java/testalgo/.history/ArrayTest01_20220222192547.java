import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class ArrayTest01 {
    public static void main(String[] args) {
        int[] inta = new int[] { -2, 3, 1, 1, 2, 5 };
        System.out.println(findMaxIntV3(inta));
    }

    // 55%
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

    // 55%
    static int findMaxIntV2(int[] A) {
        int result = 1;

        Set<Integer> myArraySet = Arrays.stream(A).boxed().sorted().collect(Collectors.toSet());

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

    // 66%
    static int findMaxIntV3(int[] A) {

        Set<Integer> myArraySet = Arrays.stream(A).boxed().sorted().filter(i -> i > 0).collect(Collectors.toSet());

        int[] result = { 1 };
        myArraySet.stream().forEach(a -> {
            if (a == result[0]) {
                result[0]++;
            } else {
                
            }
        });
        return result[0];
    }
}

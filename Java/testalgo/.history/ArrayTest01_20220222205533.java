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
        System.out.println(findMaxIntV6(inta));
    }

    /*
     * that, given an array A of N integers, returns the smallest positive integer
     * (greater than 0) that does not occur in A.
     * 
     * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
     * 
     * Given A = [1, 2, 3], the function should return 4.
     * 
     * Given A = [−1, −3], the function should return 1.
     * 
     * Write an efficient algorithm for the following assumptions:
     * 
     * N is an integer within the range [1..100,000];
     * each element of array A is an integer within the range
     * [−1,000,000..1,000,000].
     * 
     * 
     */
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
            } else if (a == result) {
                result++;
            } else {
                break;
            }

        }
        return result;
    }

    // 66%
    static int findMaxIntV3(int[] A) {
        int result = 1;

        Set<Integer> myArraySet = Arrays.stream(A).boxed().sorted().filter(i -> i > 0).collect(Collectors.toSet());

        for (Integer a : myArraySet) {
            if (a == result) {
                System.out.println(a);
                result++;
            } else {
                System.out.println("break");
                break;
            }
        }
        return result;
    }

    // 55%
    static int findMaxIntV4(int[] A) {
        Set<Integer> myArraySet = Arrays.stream(A).boxed().sorted().filter(i -> i > 0).collect(Collectors.toSet());

        int[] result = new int[] { 1 };
        myArraySet.forEach(a -> {
            if (a == result[0]) {
                result[0]++;
            } else {
                return;
            }
        });
        return result[0];
    }

    // 44%
    static int findMaxIntV5(int[] A) {
        int[] myArray = Arrays.stream(A).filter(i -> i > 0).sorted().distinct().toArray();

        int result = 1;
        for (int a : myArray) {
            result = a + 1;

            int index = Arrays.binarySearch(myArray, result);
            if (index < 0) {
                result = Math.abs(index);
            }
        }
        return result;
    }

    //100%
    static int findMaxIntV6(int[] A) {
        int N = A.length;
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            if (a > 0) {
                set.add(a);
            }
        }
        for (int i = 1; i <= N + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return 0;
    }

    static int findMaxIntV7(int[] A) {
        int[] myArray = Arrays.stream(A).filter(i -> i > 0).sorted().distinct().t();


    }
}

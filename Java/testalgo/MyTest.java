import java.util.HashSet;
import java.util.Set;

public class MyTest {
    public static void main(String[] args) {
        //int[] solders = { 3, 4, 3, 0, 2, 2, 3, 0, 0 };
        //int[] solders = { 4,2,0 };
        int[] solders = { 4,4,3,3,1,0 };
        Set<Integer> rankSet = new HashSet<>();
        // number of solders who can report to some superior
        for (int i = 0; i < solders.length; i++) {
            rankSet.add(solders[i]);
        }

        int result = 0;
        for (int i = 0; i < solders.length; i++) {
            if (rankSet.contains(solders[i] + 1)) {
                result++;
            }
        }

        System.out.println(result);
        // set.forEach(
        //     s -> System.out.println(s));
    }

    public static int solution(int[] ranks) {
        int[] testInputs = { 3, 4, 3, 0, 2, 2, 3, 0, 0 };
        Set<Integer> set = new HashSet<>();

        return 0;
    }
}

import java.util.HashSet;
import java.util.Set;


public class Solution {
    public int solution(int[] A){
        Set<Integer> integerSet = new HashSet<>();
        for(int a:A)
            integerSet.add(a);

        int min = 1;

        while(integerSet.contains(min)) {
            min++
        }
        return min;
    }
}

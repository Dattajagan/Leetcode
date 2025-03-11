import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int m) {
        List<Boolean> temp = new ArrayList<>();
        int max = 0;

        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        for (int candy : candies) {
            temp.add(candy + m >= max);
        }

        return temp;
    }
}
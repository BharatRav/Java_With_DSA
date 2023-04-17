package Arrays.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxi =Integer.MIN_VALUE;

        for (int data:candies) {
            maxi = Math.max(maxi, data);
        }

        ArrayList<Boolean> result = new ArrayList<>(candies.length);

        for (int candy: candies) {

            result.add(candy+extraCandies >=maxi);

        }

        return result;

    }
}

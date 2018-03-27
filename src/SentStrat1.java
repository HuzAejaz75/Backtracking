import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by huzaifa.aejaz on 3/17/18.
 */
public class SentStrat1 {
    public List<List<Integer>> permute(int[] nums, int target) {
        // in this case we have to do the following,
        //first go and do the backtracking and within te backtracking figure out to proceed or to skip
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length==0 )return result;
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        permuteHelper(result, temp, nums, target,used);
        return result;
    }
    private void permuteHelper(List<List<Integer>> res, List<Integer> temp, int[] nums, int target, boolean[] used){
        //base case
        if(target==0){
            res.add(new ArrayList<>(temp));
        }
        else {
            for (int i = 0; i < nums.length; i++) {
                if (target > 0 && target - nums[i] < 0 ) continue;
                if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
                temp.add(nums[i]);
                used[i] = true;
                permuteHelper(res, temp, nums, target - nums[i], used);
                temp.remove(temp.size() - 1);
                used[i] = false;
            }
        }
    }
}

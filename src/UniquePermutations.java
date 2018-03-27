import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by huzaifa.aejaz on 3/12/18.
 */
public class UniquePermutations {
    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        permutationHelper(nums,result, list);

        return result;
    }
//this beautiful peice of code works perfectly for all results.all possible permutated combinations possible
    private void permutationHelper(int[] nums, List<List<Integer>> result, List<Integer> temp){
        // base case
        if(nums.length==temp.size()){
            if(!result.contains(new ArrayList<>(temp)))
                 result.add(new ArrayList<>(temp));
        }
        else{
            for(int i = 0; i < nums.length; i++){
                if(!temp.contains(nums[i]))
                  temp.add(nums[i]);//select
                //int[] hold = nums;
                //nums = Arrays.copyOfRange(nums,i+1,nums.length);
                permutationHelper(nums,result,temp);
                //unchoose
                temp.remove(temp.size()-1);
              //  nums = hold;
            }
        }
    }
}

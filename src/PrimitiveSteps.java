import java.util.ArrayList;
import java.util.List;

/**
 * Created by huzaifa.aejaz on 3/17/18.
 */
public class PrimitiveSteps {
    public List<List<Integer>> allPerms(int n, int k){
        List<List<Integer>> res = new ArrayList<>();
        if(n==0 || k==0) return res;
        List<Integer> temp = new ArrayList<>();
        //primitivity arises because of a for loop that shall be used to populate the array untill it is filled,
        //with values from 1 to n...a possible way to overcome this, is by adding a 1 upto n.
        //A possible soluyion could be to generate it within the helper based on n-1, by reducing from the highest value..
        //a solution we shall explore next, but for now, we shall do the primitive solution of the early man.
        int[] nums = new int[k];
        boolean[] used = new boolean[n-1];
       /* for(int i = 1; i <= k; i++){
            nums[i-1] = i;
        }*/// at this point we develop the nums array and then we proceed ahead. with the regular solution.
        permuteHelper(nums, n, temp, res,used);
        return res;

    }
    private void permuteHelper(int[] nums, int target, List<Integer> temp, List<List<Integer>>res, boolean[] used){

        //base case
        if(target==0){
            res.add(new ArrayList<>(temp));
        }
        else{
            for(int i = 0; i < nums.length; i++){
                //choose
                if( target-nums[i]<0) continue;
                if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
                temp.add(nums[i]);
                used[i] = true;
                permuteHelper(nums,target-nums[i], temp,res, used);
                used[i] = false;
                temp.remove(temp.size()-1);
            }
        }
    }

}

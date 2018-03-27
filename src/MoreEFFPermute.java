import java.util.ArrayList;
import java.util.List;

/**
 * Created by huzaifa.aejaz on 3/16/18.
 */
public class MoreEFFPermute {


    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        if (nums.length == 0) {
            return permutations;
        }

        collectPermutations(nums, 0, new ArrayList<>(), permutations);
        return permutations;
    }

    private void collectPermutations(int[] nums, int start, List<Integer> permutation,
                                     List<List<Integer>>  permutations) {

        if (permutation.size() == nums.length) {
            permutations.add(permutation);
            return;
        }

        for (int i = 0; i <= permutation.size(); i++) {
            List<Integer> newPermutation = new ArrayList<>(permutation);
            newPermutation.add(i, nums[start]);
            collectPermutations(nums, start + 1, newPermutation, permutations);
        }
    }






















    public List<List<Integer>> permute2(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        helper2(result,nums,0);
        return result;
    }
    public static void helper2(List<List<Integer>> result, int[] nums, int start){
        if(start==nums.length-1){
            List<Integer> toadd = new ArrayList<Integer>(nums.length);
            for (int i: nums) toadd.add(i);
            result.add(toadd);
        }
        else{
            for(int i=start; i<nums.length; i++){
                int temp = nums[start];//make a selection based on the index,
                nums[start] = nums[i];//and swap it right here
                nums[i] = temp;

                helper2(result, nums, start+1);

                temp = nums[start];
                nums[start] = nums[i];//swap back right here//
                nums[i] = temp;
            }
        }
    }
}

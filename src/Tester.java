import org.junit.Test;

/**
 * Created by huzaifa.aejaz on 3/12/18.
 */
public class Tester {
    @Test
    public void testPermutations(){
        Permutations perm = new Permutations();
        perm.permuteMany("Xip");
    }

    @Test
    public void testUniquePerms(){
        UniquePermutations UP = new UniquePermutations();
        int[] nums = {1,2,3};
        UP.permuteUnique(nums);
    }
    @Test
    public void moreff(){
        MoreEFFPermute mf = new MoreEFFPermute();
        int[] nums = {1,2,3};
        mf.permute(nums);
    }
    @Test
    public void topCount(){
        TopN TN = new TopN();
        int[] arr = {1,1,1,2,2,2,2,2,2,3,3,3,3};
        TN.printTopN(arr,2);
    }

    @Test
    public void test8(){
        comparatorUnderstanding CU = new comparatorUnderstanding();
        CU.check();
    }
    @Test
    public void test9(){
        bounded bdn = new bounded();
        int[] nums = {2,2,2,1,1,1,4,3};
        bdn.countSub(nums, 2,3);
    }
}

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
}

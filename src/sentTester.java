import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by huzaifa.aejaz on 3/17/18.
 */
public class sentTester {
    @Test
    public void test1(){
        SentStrat1 ss = new SentStrat1();
        int[] nums = {1,2};
        List<List<Integer>>res = ss.permute(nums,4);
        Assert.assertEquals(res.size(),0);
    }
    @Test
    public void test2(){
        SentStrat1 ss = new SentStrat1();
        int[] nums = {1};
        List<List<Integer>>res = ss.permute(nums,1);
        Assert.assertEquals(res.size(),1);
    }
    @Test
    public void test3(){
        SentStrat1 ss = new SentStrat1();
        int[] nums = {};
        List<List<Integer>>res = ss.permute(nums,10);
        Assert.assertEquals(res.size(),0);
    }
    @Test
    public void test4(){
        PrimitiveSteps ss = new PrimitiveSteps();
        int[] nums = {1,2,3,4};
        List<List<Integer>>res = ss.allPerms(7,3);
        Assert.assertEquals(res.size(),0);
    }
    @Test
    public void test5(){
        wordSearch WS = new wordSearch();
        char[][] ch = {{'a','a','a'},{'a','b','b'},{'a','b','b'},{'b','b','b'},{'b','b','b'},{'a','a','a'},{'b','b','b'},{'a','b','b'},{'a','a','b'},{'a','b','a'}};

        WS.exist(ch,"aabaaaabbb");
    }

    @Test
    public void test6(){
        LetterCombinations LC = new LetterCombinations();
        LC.letterCombinations("22");
    }
    @Test
    public void test7(){
        perm3  prm = new perm3();
        prm.getPermutation(2,2);
    }
    @Test
    public void test8(){
        backtrackCombinations BC = new backtrackCombinations();
        int[] digits = {1,2,3};
        BC.letterCombinations(digits);

    }

}

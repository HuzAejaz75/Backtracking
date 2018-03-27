import java.util.ArrayList;
import java.util.List;

/**
 * Created by huzaifa.aejaz on 3/21/18.
 */
public class backtrackCombinations {
    public void letterCombinations(int[] digits) {
        /*

        Take the digits and they have to be turned around into different combinations.

         */
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> list2 = new ArrayList<>();
        boolean[] used = new boolean[digits.length];
        for(int size = 0; size <= digits.length; size++){
            combiHelper(list, list2, size, digits,0);
        }

       for(List<Integer> list1 : list2){
            for(int j = 0; j < list1.size(); j++){
                System.out.print(list1.get(j));
            }
           System.out.println(" ");

       }



    }
    public void combiHelper(List<Integer> list,List<List<Integer>> result,  int size,int[] digits, int index ){//return all the combinations of various sizes.
        //base case
        if(list.size()==size)//r is provided by the upper solution.
        {
            result.add(new ArrayList<Integer>(list));
        }
        else{
            for(int i  = index; i < digits.length; i++){
                //what should this do, it should take the i from the digits

                list.add(digits[i]);

                combiHelper(list,result, size, digits, i+1);

                list.remove(list.size()-1);
            }
        }
    }
}

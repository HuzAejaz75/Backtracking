import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.*;

/**
 * Created by huzaifa.aejaz on 3/27/18.
 */
public class TopN {
    public void printTopN(int[] array, int k){
        if(array.length==0|| k<=0 || k > array.length) System.out.println("invalid input");
        if(array.length==1) System.out.println(array[0]);

        Arrays.sort(array);
        int count = 1;
        ArrayList<Integer> countsize = new ArrayList<>();
        TreeMap<Integer,ArrayList<Integer>> countMap = new TreeMap<>();
        for(int i  = 1; i <= array.length; i++){

            if(i==array.length ||array[i-1] != array[i]) {
                if(!countsize.contains(count)) countsize.add(count);
                if (countMap.get(count) != null) {
                    ArrayList<Integer> arr = countMap.get(count);
                    arr.add(array[i - 1]);
                    countMap.put(count, arr);

                } else {
                    ArrayList<Integer> arr = new ArrayList<>();
                    arr.add(array[i - 1]);
                    countMap.put(count, arr);
                }
                count=0;
            }
            count++;
        }


        Collections.sort(countsize);
        for(int i = countsize.size()-1, j=0; i >=0 && j<k; i--){
            if(countMap.get(countsize.get(i))!= null){
                ArrayList<Integer> numbersInside = countMap.get(countsize.get(i));
                for(int num : numbersInside){
                    System.out.println( num);
                    j++;
                }
            }
        }








    }
}

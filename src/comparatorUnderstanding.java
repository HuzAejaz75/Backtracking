import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by huzaifa.aejaz on 3/27/18.
 */
public class comparatorUnderstanding {
    public int check() {
        int[][] envelopes = {{4,3},{3,4},{5,6},{1,2},{2,3}};

            if(envelopes==null||envelopes.length==0)
                return 0;

            Arrays.sort(envelopes, new Comparator<int[]>(){
                public int compare(int[] a, int[] b){
                    if(a[0]!=b[0]){
                        System.out.println(a[0]+"-"+b[0]+"="+(a[0]-b[0]));
                        return a[0]-b[0];
                    }else{
                        System.out.println(a[1]+"-"+b[1]+"="+(a[1]-b[1]));
                        return a[1]-b[1];
                    }
                }
            });

            return 6;
    }
}

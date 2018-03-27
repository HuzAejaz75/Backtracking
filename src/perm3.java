import java.util.ArrayList;
import java.util.List;

/**
 * Created by huzaifa.aejaz on 3/19/18.
 */
public class perm3 {
    String result = "";
    int count = 0;
    public String getPermutation(int n, int k) {
        //a crude solution by early man would be
        if(n==0 || k ==0) return result;
        int count = 0;
        String[] vals = new String[n];
        for(int i = 1; i <=n;i++){
            vals[i-1]=Integer.toString(i);
        }
        boolean[] used = new boolean[n];
        List<String> temp = new ArrayList<>();
        permuteHelper(vals,n, k, used,temp);
        return result;
    }
    private void permuteHelper(String[] values,int n, int k, boolean[] used, List<String> temp){
        if(temp.size() ==  values.length)
        {
            count++;
            if(count == k){
                for(String s: temp){
                    result+=s;
                }
            }

        }
        else{
            for(int i = 0; i < n && result.equals(""); i++){
                if(used[i]) continue;
                if(i > 0 && values[i]==values[i-1] && !used[i]) continue;
                temp.add(values[i]);
                used[i]= true;

                permuteHelper(values,n, k, used, temp);
                used[i]= false;
                temp.remove(temp.size()-1);
            }

        }
    }
}

/**
 * Created by huzaifa.aejaz on 3/12/18.
 */
public class Permutations {
    public void permuteMany(String S){
        permuteHelper(S,"");
    }
    private void permuteHelper(String str, String chosen)
    {
        if(str.equals("")){
            System.out.println(chosen);
        }
        else{
            for(int i =  0; i < str.length(); i++){
                char ch = str.charAt(i);//choose a char
                String temp = str;
                chosen+=ch;

                StringBuilder sb = new StringBuilder(str);
                sb.deleteCharAt(i);
                str= sb.toString();
                permuteHelper(str,chosen);

                str = temp;
                chosen=chosen.substring(0, chosen.length()-1);
            }
        }
    }
}

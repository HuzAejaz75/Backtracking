import java.util.ArrayList;
import java.util.List;

/**
 * Created by huzaifa.aejaz on 3/18/18.
 */
public class LetterCombinations {
    public List<String> letterCombinations(String digits) {
    List<String> list = new ArrayList<>();
    if(digits.length()==0) return list;
    String temp = "";
    char[][] mapping = new char[][] {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},
            {'t','u','v'},{'w','x','y','z'}};
    backtracking(mapping,temp,list,0,digits);
    return list;
    }
    private void backtracking(char[][] numpad,String temp, List<String> list,int index, String digits){

        //base case

        if(index==digits.length()&& temp.length()==digits.length()){
            list.add(temp);
        }
        else{
            //recursive case

            for(int i  = 0; i < numpad[digits.charAt(index)-'0'].length;i++){
                String h = temp;
                temp+=(Character.toString(numpad[digits.charAt(index)-'0'][i]));
                backtracking(numpad,temp,list,index+1,digits);
               temp = h;

            }
        }
    }
}

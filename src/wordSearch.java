import java.util.ArrayList;
import java.util.List;

/**
 * Created by huzaifa.aejaz on 3/18/18.
 */
public class wordSearch {
    public boolean exist(char[][] board, String word) {
        if(board.length==0 || word==null ||word=="") return false;
        List<List<Character>> res = new ArrayList<>();
        List<Character> temp = new ArrayList<>();
        return existHelper(res,temp,board, word,0 ,0,0, word.length());
       // if(res.size()>0)return true;
       // else return false;

    }
    private boolean existHelper(List<List<Character>> result, List<Character> temp,char[][] board, String S, int startRow, int startCol, int idx, int origLen)
    {
        if(S.length()==0 && temp.size()==origLen){
            result.add(new ArrayList<Character>(temp));
            return true;
        }
        else{

            for(int r = startRow; r < board.length; r++){
                for(int c = startCol; c < board[r].length && result.isEmpty(); c++){
                    //choose
                    if(board[r][c]==S.charAt(idx))//if the character mathces
                    {
                        //choose
                        temp.add(board[r][c]);
                        board[r][c]='0';
                        String hold = S;
                        StringBuilder sb = new StringBuilder(S);
                        char comp = S.charAt(idx);
                        sb.deleteCharAt(idx);
                        S= sb.toString();
                          if(S.length()==0 && temp.size()==origLen){
                            result.add(new ArrayList<Character>(temp));
                        }
                        if( c-1 >= 0 &&( idx < S.length() ) && board[r][c-1]==S.charAt(idx))//horizontally scan
                        {
                            existHelper(result, temp, board,S , r, c -1, idx,origLen);
                        }
                        else
                        if(c+1 < board[r].length && idx< S.length() && board[r][c+1]==S.charAt(idx))
                        {
                            existHelper(result, temp,board, S , r, c +1, idx,origLen);
                        }

                        if(r-1>=0 && idx < S.length() && board[r-1][c]==S.charAt(idx)){
                            existHelper(result, temp,board, S , r-1, c, idx ,origLen);
                        }
                        else
                        if(r+1< board.length && idx < S.length() && board[r+1][c]==S.charAt(idx))
                        {
                            existHelper(result, temp,board, S , r+1, c, idx ,origLen);

                        }
                        S = hold;
                        board[r][c]=temp.get(temp.size()-1);
                        temp.remove(temp.size()-1);

                    }




                }
            }
            return false;
        }

    }
}

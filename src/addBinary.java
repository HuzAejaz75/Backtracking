/**
 * Created by huzaifa.aejaz on 6/21/18.
 */
public class addBinary {
    public String addBin(String[] str) {
        if(str.length == 0) return "";
        if(str.length==1) return str[0];
        int a = 0; int b = 1;
        String result = str[a];
        while(b<str.length){
            result = helper(result, str[b]);
            b++;
        }
        return result;
    }

    public String helper(String a, String b){
        int aLen = a.length()-1;
        int bLen = b.length()-1;
        int sum = 0;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(aLen>=0 && bLen>=0){
            sum = carry;
            if(aLen >= 0) sum+= a.charAt(aLen--)-'0';
            if(bLen >= 0) sum+= b.charAt(bLen--)-'0';
            sb.append(sum%2);
            carry = sum/2;
        }
        if(carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
/*


only one

two

and more than two
a b c d e
p p
 */
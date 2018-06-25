/**
 * Created by huzaifa.aejaz on 6/21/18.
 */
public class SimpleFundementals {
    public void fundementals(){
        int a = 16;
        int b = 17;
        System.out.println(a+b/2);
        System.out.println((a+b)/2);
        System.out.println(a+b-6+5-3+2*4);

        String s = "123 132 sdas d&*^  ";
        s = s.replaceAll("\\s","");
        System.out.println(s);

        char[] sch = s.toCharArray();
        for(char c: sch){
            if(Character.isDigit(c)){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
    }
}

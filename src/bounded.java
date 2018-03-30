/**
 * Created by huzaifa.aejaz on 3/27/18.
 */
public class bounded {

    public int countSub(int[] A, int L, int R) {
        int j=0,count=0,res=0;

        for(int i=0;i<A.length;i++){
            if(A[i]>=L && A[i]<=R){
                res+=i-j+1;count=i-j+1;
            }
            else if(A[i]<L){
                res+=count;
            }
            else{
                j=i+1;
                count=0;
            }
        }
        return res;
    }
}


























          /*
            int count=0;

            int currentMax=Integer.MIN_VALUE;

            for (int st=0,end=0; end<nums.length && st<nums.length;){
                currentMax=Math.max(currentMax, nums[end]);
              //  System.out.println("nums[end] :" + nums[end]);
                System.out.println("Current Max :" + currentMax);
                if(currentMax<=u && currentMax>=l) {
                    count++;
                    System.out.println("count incremented to :" + count);
                    end++;
                    System.out.println("end incremented to :" + end);
                    System.out.println("start is :" + st);
                }
                else if(currentMax<l || currentMax>u) {
                    st++;
                    System.out.println("start incremented to : " + st);
                    end=st;
                    System.out.println("end updated to : " + end);
                    currentMax=nums[end];
                    System.out.println("Current Max :" + currentMax);
                }
            }
            return count;
        }



}*/

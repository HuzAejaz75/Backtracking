/**
 * Created by huzaifa.aejaz on 6/21/18.
 */
public class isBadVersion {
    int bad = 3;
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right-left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    public boolean isBadVersion(int num){
        if(num>=bad) return true;
        else return false;
    }
}
/*
1 2 3 4 5 6
p

 */

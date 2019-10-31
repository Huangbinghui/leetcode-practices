package practise;
/*******************************************************************
 *判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读
 * 都是一样的整数。
 *
 *
 *******************************************************************/
//2019-10-18 author：黄丙辉

public class isPalindrome {
    public boolean isPalindrome9(int x) {
        int y = x;
        int mode = 0;
        while(y>9||y<-9){
            y /= 10;
            mode++;
        }
        y = 0;
        for (int i = 0;i<=mode;i++){
            y = y*10 + x%10;
            x /= 10;
        }
        return x==y;
    }
}

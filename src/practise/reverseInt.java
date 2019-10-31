package practise;

import java.util.Scanner;
/*********************************************************
输入一个整数，输出此整数的翻转数，
 此问题涉及到判溢问题，int类型的最大值为Integer.MAXVALUE=2147483647
 最小值Integer.MIN_VALUE=-2147483648,当遇到临界将要溢出之时return 0；
 思路：每次从X中pop出个位数的值加到Y的后面，产生逆序数。
/*********************************************************/
//2019-10-18 @author：黄丙辉
public class reverseInt {
    //题解方法reverse，题号为7
    public static int reverse7(int x){
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
    //本人写出的方法
    public static int reverse(int x) {
        int y = x;
        int mode = 0;
        while(y>9||y<-9){
            y /= 10;
            mode++;
        }
        y = 0;
        for (int i = 0;i<=mode;i++){
            if (y>Integer.MAX_VALUE/10||(y==Integer.MAX_VALUE&&x==7))return 0;
            if (y<Integer.MIN_VALUE/10||(y==Integer.MIN_VALUE&&x==8))return 0;
            y = y*10 + x%10;
            x /= 10;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(reverse7(x));
    }
}

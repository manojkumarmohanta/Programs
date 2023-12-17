import java.lang.*;

public class assignment{
    public static void main(String[] args) {
        //Integer bitcount()
        int t=15;
        int t2=12;
        System.out.println(Integer.bitCount(t));
        //sum()
        System.out.println(Integer.sum(t,t2));
        //reverse()
        System.out.println(Integer.reverse(t));
        //rotateLeft()
        int r1=2;
        int r2=0;
        while(r2<6){
            System.out.println(Integer.rotateLeft(r1,r2));
            r2++;
        }
        //reverseByte()
        System.out.println(Integer.reverseBytes(t));
        //signum
        System.out.println(Integer.signum(t));
        //rotateRight()
        System.out.println(Integer.rotateRight(t2, t));
        //max()
        System.out.println(Integer.max(t,t2));
        //min()
        System.out.println(Integer.min(t2,t));
        //tohasString()
        System.out.println(Integer.toHexString(t));
        //tooctaString()
        System.out.println(Integer.toOctalString(t));
        //toBinaryString()
        System.out.println(Integer.toBinaryString(t));
    }
}
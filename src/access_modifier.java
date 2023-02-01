import java.lang.System;
import java.util.*;

class C1 {


    public String x="HI";
    protected int y=9;
    int z=10;
    private int a=23;

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void meth1(){
        System.out.printf(x);
        System.out.printf(String.valueOf(y));
        System.out.printf(String.valueOf(z));
        System.out.printf(String.valueOf(a));

    }
}
public class access_modifier {

    public static void main(String[] args) {
        C1 c1=new C1();
        c1.meth1();
        System.out.print(c1.x);
        System.out.println("c1.a = " );
    }

}

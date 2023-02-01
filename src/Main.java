import package_one.class1;
import package_name.class2;

public class Main{
    public static void main(String[] args){
        class2 a;
        a = new class2();
        class1 b;
        b = new class1();
        b.methodClassTwo();
        a.methodClassOne();
    }
}

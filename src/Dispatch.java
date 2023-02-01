
class phone{
    public void on(){
        System.out.println("In the class mobile Dispatch");
    }

    public void move(){
        System.out.println("In parent move..");
    }
}
class smartPhone extends phone{
    public void on(){
        System.out.println("Smart phone on..");

    }
    public void move(){
        System.out.println("in Smartphone move..");
    }

    public void music(){
        System.out.println("Music on..");
    }


}

public class Dispatch {
    public static void main(String[] args) {
        phone Obj1=new smartPhone();
        Obj1.move();

    }
}




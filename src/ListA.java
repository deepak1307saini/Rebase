import java.util.*;

public class ListA {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<Integer>();

        System.out.println(l1);
        l1.add(1);
        l1.add(2);

        List<Integer> l2=new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(1,3);
        l2.add(1,2);

        l1.addAll(1,l2);
        System.out.println(l1);
        System.out.println(l1.get(3));
        l1.remove(2);
        System.out.println(l1);
        l1.set(2,0);            // To update the value
        System.out.println(l1);

        l2.remove(Integer.valueOf(3));// To remove a value from list
        System.out.println(l2);

        l2.clear();
        System.out.println(l2);
        System.out.println(l2.contains(2));//To find element

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i)+"  ");
        }
        System.out.println("\n");
        for(int x:l1)
        {
            System.out.print(x+" ");
        }
        Iterator<Integer> it=l1.iterator();

        System.out.println("\n");
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}

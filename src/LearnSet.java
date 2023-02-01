import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();

        set.add(23);
        set.add(34);
        set.add(12);
        set.add(34);

        System.out.println(set);
        set.remove(34);
        System.out.println(set);

        System.out.println(set.contains(21));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);


        //LinkedHashSet --> Order maintained
        Set<Integer> setLink=new LinkedHashSet<>();

        setLink.add(23);
        setLink.add(34);
        setLink.add(12);
        setLink.add(34);

        System.out.println(setLink);
        setLink.remove(34);
        System.out.println(setLink);

        System.out.println(setLink.contains(21));
        System.out.println(setLink.isEmpty());
        System.out.println(setLink.size());
        setLink.clear();
        System.out.println(setLink);

        //TreeHashSet --> Sorted
        Set<Integer> setTree=new TreeSet<>();

        setTree.add(23);
        setTree.add(34);
        setTree.add(12);
        setTree.add(34);

        System.out.println(setTree);
        setTree.remove(34);
        System.out.println(setTree);

        System.out.println(setTree.contains(21));
        System.out.println(setTree.isEmpty());
        System.out.println(setTree.size());
        setTree.clear();
        System.out.println(setTree);
    }
}

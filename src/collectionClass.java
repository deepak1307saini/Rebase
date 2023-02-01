import java.util.*;

public class collectionClass {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        list.add(23);
        list.add(34);
        list.add(23);
        list.add(12);
        list.add(34);

        System.out.println("Min : "+ Collections.min(list));
        System.out.println("Min : "+ Collections.max(list));
        System.out.println("Min : "+ Collections.frequency(list,23));

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);


        List<Student> list1=new ArrayList<>();

        list1.add(new Student("Deepak",23));
        list1.add(new Student("Rahul",20));
        list1.add(new Student("Monu",21));
        list1.add(new Student("Monu",20));

        Student s1=new Student("Deepak",23);
        Student s2=new Student("Rahul",12);

        System.out.println("\n\n"+s1.compareTo(s2));

        Collections.sort(list1);
        System.out.println(list1);

        Collections.sort(list1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(list1);

        //Collections.sort(list1, ((o1, o2) -> o1.name.compareTo(o2.name)));
        //Using lambda
        Collections.sort(list1, ((o1, o2) -> {
            if (o1.name != o2.name) {
                return o1.name.compareTo(o2.name);
            }
            else
                return o2.rollNo- o1.rollNo;
        }));

        System.out.println(list1);
    }
}

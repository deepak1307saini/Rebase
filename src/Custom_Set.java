import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Custom_Set {
    String name;
    int rollNo;

    public Custom_Set(String name,int rollNo)
    {
        this.name=name;
        this.rollNo=rollNo;
    }

    @Override
    public String toString() {
        return "Custom_Set{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Custom_Set customSet = (Custom_Set) o;
        return rollNo == customSet.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    public static void main(String[] args) {

        Set<Custom_Set> student_set=new HashSet<>();

        student_set.add(new Custom_Set("Deepak",22));
        student_set.add(new Custom_Set("Rahul",23));
        student_set.add(new Custom_Set("Hello",22));
        student_set.add(new Custom_Set("Hello",22));

        System.out.println(student_set);
    }
}

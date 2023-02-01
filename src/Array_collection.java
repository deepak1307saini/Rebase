import java.util.Arrays;

public class Array_collection {

    public static void main(String[] args) {

//        int a[]={1,2,3,4,5,5};
//        int index= Arrays.binarySearch(a,4);
//        System.out.println("The index of element 4 : "+index);

        int num[]={1,2,3,4,1,2,3,1};
        Arrays.sort(num);

        for (int i: num){
            System.out.print(i+" ");
        }

        Arrays.fill(num,12);
        for (int i:num)
        System.out.println(i);
    }
}

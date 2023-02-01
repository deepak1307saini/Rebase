import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class map_Learn {
    public static void main(String[] args) {

        Map<String,Integer> numbers=new HashMap<>();

        numbers.put("Three",3);
        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Four",4);
        numbers.put("Two",3);

        if (!numbers.containsKey("Three")){
            numbers.put("Three",4);
        }

        numbers.putIfAbsent("Two",5);

        System.out.println(numbers);

        for (Map.Entry<String,Integer> e: numbers.entrySet())
        {
            System.out.println(e);

            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for (String key: numbers.keySet())
            System.out.println(key);
        for (Integer val: numbers.values())
            System.out.println(val);

        System.out.println(numbers.containsValue(3));
        System.out.println(numbers.isEmpty());
        
        
        //Likewise TreeMap
        Map<String,Integer> mpt=new TreeMap<>();

        mpt.put("Three",3);
        mpt.put("One",1);
        mpt.put("Two",2);
        mpt.put("Four",4);
        mpt.put("Two",3);

        if (!mpt.containsKey("Three")){
            mpt.put("Three",4);
        }

        mpt.putIfAbsent("Two",5);

        System.out.println(mpt);

        for (Map.Entry<String,Integer> e: mpt.entrySet())
        {
            System.out.println(e);

            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for (String key: mpt.keySet())
            System.out.println(key);
        for (Integer val: mpt.values())
            System.out.println(val);

    }
}

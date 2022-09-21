import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

public class Converter {

    private static final TreeMap<Integer, String> ArNumber = new TreeMap<>();

    static {
        ArNumber.put(100, "C");
        ArNumber.put(90, "XC");
        ArNumber.put(50, "L");
        ArNumber.put(40, "XL");
        ArNumber.put(10, "X");
        ArNumber.put(9, "IX");
        ArNumber.put(5, "V");
        ArNumber.put(4, "IV");
        ArNumber.put(1, "I");
    }
    private static final Map<String, Integer> RomeNumber = new HashMap<>();

    static {
        RomeNumber.put("I",1);
        RomeNumber.put("II",2);
        RomeNumber.put("III",3);
        RomeNumber.put("IV",4);
        RomeNumber.put("V",5);
        RomeNumber.put("VI",6);
        RomeNumber.put("VII",7);
        RomeNumber.put("VIII",8);
        RomeNumber.put("IX",9);
        RomeNumber.put("X",10);
    }
    public String toRomeNumber(int number) {
        int n = ArNumber.floorKey(number);
        return number == n ? ArNumber.get(number) : ArNumber.get(n) + toRomeNumber(number - n);
    }

    public int toArNumber(String number) {
        return RomeNumber.get(number);
    }

}
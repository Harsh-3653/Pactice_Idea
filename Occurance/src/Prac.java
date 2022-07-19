import java.util.HashSet;

public class Prac {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("str1");
        set.add("str2");
        set.add("str3");
        set.add("str4");
        set.add("str1");
        System.out.println(set);
    }
}

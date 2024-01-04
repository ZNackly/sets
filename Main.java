import java.util.TreeSet;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Вася");
        hs.add("Дима");
        hs.add("Ваня");
        hs.add("Петя");
        hs.add("Дима");
        hs.add("Игорь");
        System.out.println(hs);
        System.out.println(hs.contains("Ваня"));
        hs.remove("Дима");
        System.out.println(hs.contains("Дима"));
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(901);
        ts.add(-78);
        ts.add(5);
        ts.add(1382);
        ts.add(34);
        ts.add(901);
        ts.add(-7);
        System.out.println(ts);
        }
    }
}


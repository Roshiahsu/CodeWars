import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName App
 * @Version 1.0
 * @Description TODO
 * @Date 2022/8/2、下午12:46
 */
public class App {
    static int a=10;
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        int xx = 10;
        set.add("main");
        insertSetData(set, xx);
        System.out.println("set.size():" + set.size());
        System.out.println("xx=" + xx);
    }

    private static void insertSetData(Set<String> set, int xx) {
        set.add("insertSetData");
        xx = 20;
        System.out.println("insertSetData XX =" + xx);
    }


}

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Demo2
 * @Version 1.0
 * @Description TODO
 * @Date 2022/8/3、下午2:38
 */
public class Demo2 {
    /*
     * 方法名稱    返回類型        作用
     * filter     Stream        過濾
     * foreach    void          逐一處理
     * sorted     Stream        排序
     * limit      Stream        最前幾條紀錄
     */
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("張三",99));
        list.add(new Student("李三",88));
        list.add(new Student("趙三",77));
        list.add(new Student("王三",66));
        list.add(new Student("張三豐",55));

        //大到小排序
        list.stream().sorted((s1,s2)->s2.getScore()-s1.getScore())
                .limit(1)
                .forEach(student -> System.out.println(student));
    }
}

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Demo3
 * @Version 1.0
 * @Description
 * @Date 2022/8/3、下午2:44
 */
public class Demo3 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("張三",99));
        list.add(new Student("李三",88));
        list.add(new Student("趙三",77));
        list.add(new Student("王三",66));
        list.add(new Student("張三豐",55));

        //分數最小的三個人
//        list.stream().sorted((s1,s2)->s1.getScore()-s2.getScore())
//                .limit(3).forEach(student -> System.out.println(student));


    }
}

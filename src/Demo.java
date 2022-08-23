import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName Demo
 * @Version 1.0
 * @Description TODO
 * @Date 2022/8/3、下午2:15
 */

/*
 * 方法名稱    返回類型        作用
 * filter     Stream        過濾
 * foreach    void          逐一處理
 */
public class Demo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("張三",99));
        list.add(new Student("李三",88));
        list.add(new Student("趙三",77));
        list.add(new Student("王三",66));
        list.add(new Student("張三豐",55));
//        ArrayList<Student> zhang = new ArrayList<>();
//        for (Student student : list) {
//            if (student.getName().startsWith("張")) {
//                zhang.add(student);
//            }
//        }
//        for (Student student : zhang) {
//            if (student.getName().length()==3) {
//                System.out.println(student);
//            }
//        }
        /*
         * list.stream() 獲取stream
         * filter(s->s.getName().startsWith("張")) 搜尋張開頭
         * filter(s->s.getName().length()==3) 搜尋長度為3
         * Collectors.toList() 轉換list
         */
        //大到小
        list.stream().sorted((s1,s2)->s2.getScore()-s1.getScore())
                .limit(3)
                .forEach(student -> System.out.println("排序小到大"+student));
        //小到大
        list.stream().sorted((s1,s2)->s1.getScore()-s2.getScore())
                .limit(3)
                .forEach(student -> System.out.println("排序大到小"+student));
        list=list.stream()
                .filter(s->s.getName().startsWith("張"))
                .filter(s->s.getName().length()==3)
                .collect(Collectors.toList());
        System.out.println(list);

    }
}

import java.util.Arrays;

/**
 * @ClassName Test
 * @Version 1.0
 * @Description TODO
 * @Date 2022/8/11、下午10:02
 */
public class Test {

    public static double findUniq(double arr[]) {
        for (int i = 0; i < arr.length/2; i++) {
            if(arr[i]!=arr[arr.length-1-i]){
                if(arr[i]!=arr[0]){
                    return arr[i];
                }else{
                    return arr[i+1];
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        double[] a={ 1, 1, 1, 2, 1, 1 };
        System.out.println(findUniq(a));
    }
}

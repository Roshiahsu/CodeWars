import javax.swing.*;
import java.io.*;

/**
 * @ClassName Demo04
 * @Version 1.0
 * @Description TODO
 * @Date 2022/8/6、上午10:45
 */
public class Demo04 {

    public static void main(String[] args) {
        Demo04 demo04 = new Demo04();
        demo04.JFrameByBadApple();

    }
    public void JFrameByBadApple() {
        //建立一個會畫框
        JFrame ck = new JFrame();
        //畫框大小，跟你的圖案大小一致
        ck.setBounds(0, 0, 800, 714);
        //建立一個顯示文本的區域
        JTextArea are = new JTextArea();
        //are嵌入ck中
        ck.add(are);
        are.setBounds(200, 720, 400, 720);
        //設定字型
        are.setFont(new java.awt.Font("Andale Mono", 2, 6));
        //宣告路徑
        File file = new File("/Users/roshia/Downloads/");
        File[] list = file.listFiles(
                (f)->f.getName().endsWith(".txt")
        );
        ck.setVisible(true);
        for (File file1 : list) {
            try(
                    FileReader fr = new FileReader(file1);
                    BufferedReader br = new BufferedReader(fr);
                    ) {
                StringBuffer sb = new StringBuffer();
                int a = 0;
                int b = 0;
                int line=56;
                int index = 0;
                //讀幾行
                while (b < line) {
                    index++;
                    b++;
                    a++;
                    String str = br.readLine();
                    sb.append(str + "\n");
                    if (a % line == 0) {
                        try {
                            String str1 = sb.toString();
                            sb = new StringBuffer("");
                            are.setText(str1);
                            Thread.sleep(300);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                System.out.println("結束了");

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}


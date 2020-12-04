import java.io.*;
import java.util.Objects;


public class FileIO {


    public static BufferedReader ReadTxt(String classtxt) {/* 读班级TXT文件 */
        try {
            String pathname = Objects.requireNonNull(cin_txt.class.getClassLoader().getResource(classtxt)).getPath();// 相对路径
            File filename = new File(pathname); // 要读取以上路径的input。txt文件
            InputStreamReader reader = new InputStreamReader(
                    new FileInputStream(filename)); // 建立一个输入流对象reader
            return new BufferedReader(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void WriteTxt() throws IOException {
        /* 写入Txt文件 */
        try {
            File writeName = new File(".\\src\\output.txt"); // 相对路径，如果没有则要建立一个新的output.txt文件
            writeName.createNewFile(); // 创建新文件,有同名的文件的话直接覆盖
            try (FileWriter writer = new FileWriter(writeName);
                 BufferedWriter out = new BufferedWriter(writer)
            ) {
                out.write("我会写入文件啦1\r\n"); // \r\n即为换行
                out.write("我会写入文件啦2\r\n"); // \r\n即为换行
                out.flush(); // 把缓存区内容压入文件
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String[] SpiltString(String ok) {
        return ok.split(",");
    }

    public static String[] SpiltString2(String ok) {
        return ok.split("\\.");
    }

}

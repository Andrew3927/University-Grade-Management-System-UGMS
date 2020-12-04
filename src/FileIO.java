import edu.princeton.cs.algs4.StdOut;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;


public class FileIO {

    /**
     * @param classPath  access to the read file.
     * @param allStudent place to store read info.
     * @throws IOException
     */
    public static void deal(String classPath, AllStudent allStudent) throws IOException {//处理班级文件
        BufferedReader br = FileIO.ReadTxt(classPath);
        assert br != null;
        String line = br.readLine();
        String[] buffer_course = FileIO.SpiltString(line);
        line = br.readLine();
        Course course1 = new Course(buffer_course[0], buffer_course[1], line);
        int number = course1.getClassSize();
        StdOut.println("Please choose the sorting field:");
        StdOut.println("(1) Surname; (2) ID; (3) Score; (4) Grade");
        StdOut.println("Course Code:" + course1.getCourseCode());
        StdOut.println("Credit:" + course1.getCredit());
        StdOut.println("Number of Students:" + course1.getClassSize());
        StdOut.println("Name:               Id:                 Score:              Grade:");


        allStudent.nowClassStudent = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            line = br.readLine();
            String[] student = FileIO.SpiltString(line);
            allStudent.nowClassStudent.add(new Student(student[0], student[1], student[2], student[3], 0));

            //space(line);
            //StdOut.println();
        }
        //sort!!!
        //Sort.quickSortScore(allStudent, allStudent.nowClassStudent.size());
        Sort.quickSortSurnName(allStudent, allStudent.nowClassStudent.size());
        //Collections.reverse(allStudent.nowClassStudent);

        for (Student student : allStudent.nowClassStudent) {
            space(student);
            StdOut.println("");
        }

    }

    private static void space(Student student) {

        System.out.printf("%-20s", student.getName());

        System.out.printf("%-20s", student.getID());

        System.out.printf("%-20s", student.getScore(0));

        System.out.print(Student.Grade(student.getScore(0)));

    }


    @SuppressFBWarnings("DM_DEFAULT_ENCODING")
    public static BufferedReader ReadTxt(String classPath) {/* 读班级TXT文件 */
        try {
            String pathname = Objects.requireNonNull(cin_txt.class.getClassLoader().getResource(classPath)).getPath();// 相对路径
            File filename = new File(pathname); // 要读取以上路径的input。txt文件
            InputStreamReader reader = new InputStreamReader(
                    new FileInputStream(filename)); // 建立一个输入流对象reader
            return new BufferedReader(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @SuppressFBWarnings("DM_DEFAULT_ENCODING")
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

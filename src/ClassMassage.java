import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class ClassMassage {

    public static void deal(String classPath, AllStudent allStudent) throws IOException {//处理班级文件
//        BufferedReader br = tool.ReadTxt(classPath);classPath
//        assert br != null;
//        String line = br.readLine();
//        String[] course = tool.SpiltString(line);
//        line = br.readLine();
//        Course course1 = new Course(course[0], course[1], line);

        String pathname = Objects.requireNonNull(_2.class.getClassLoader().getResource(classPath)).getPath();
        BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(new File(pathname))));

        String[] buf_info = new String[2];
        for (int i = 0; i < 2; i++) {
            buf_info[i] = bf.readLine();
        }
        Course temp_course = new Course(buf_info);

//        int number = course1.getNumber();
        StdOut.println("Please choose the sorting field:");
        StdOut.println("(1) Surname; (2) ID; (3) Score; (4) Grade");
        String read1 = StdIn.readLine();
        StdOut.println("Please choose the sorting ways:");
        StdOut.println("(A)scending order; (D)escending order");
        String read2 = StdIn.readLine();
//        allStudent.getNowClassStudentList() = new ArrayList<>();
        allStudent.setNowClassStudentList(new ArrayList<>());
        StdOut.println("Course Code:" + temp_course.getCourseCode());
        StdOut.println("Credit:" + temp_course.getCredit());
        StdOut.println("Number of Students:" + temp_course.getClassSize());
        StdOut.println("Name:               Id:                 Score:              Grade:");

        String buf_string = bf.readLine();
        while (buf_string != null && !buf_string.equals("")) {
            allStudent.addNowClassStudentList(buf_string);
            buf_string = bf.readLine();
        }


        if (read1.equals("1")) Sort.quickSortSurnName(allStudent, allStudent.getSizeOfNowClassStudents());
        else if (read1.equals("2")) {
            Sort.quickSortID(allStudent, allStudent.getNowClassStudentList().size());
        } else Sort.quickSortScore(allStudent, allStudent.getNowClassStudentList().size());

        if (!read2.equals("A")) Collections.reverse(allStudent.getNowClassStudentList());


        for (Student student : allStudent.getNowClassStudentList()) {
            space(student);
            StdOut.println("");
        }

    }

    private static void space(Student student) {

        System.out.printf("%-20s", student.getName());

        System.out.printf("%-20s", student.getStudentID());

        System.out.printf("%-20s", student.getScore(0));

        System.out.print(student.Grade(0));

    }


}

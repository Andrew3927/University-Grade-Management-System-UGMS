import edu.princeton.cs.algs4.StdOut;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class ClassMessage {

    public static void deal(String classtxt, AllStudent allStudent) throws IOException {//处理班级文件
        BufferedReader br = FileIO.ReadTxt(classtxt);
        assert br != null;
        String line = br.readLine();
        String[] course = FileIO.SpiltString(line);
        line = br.readLine();
        Course course1 = new Course(course[0], course[1], line);
        int number = course1.getNumber();
        StdOut.println("Please choose the sorting field:");
        StdOut.println("(1) Surname; (2) ID; (3) Score; (4) Grade");
        allStudent.nowClassStudent = new ArrayList<>();
        StdOut.println("Course Code:" + course1.getName());
        StdOut.println("Credit:" + course1.getCredit());
        StdOut.println("Number of Students:" + course1.getNumber());
        StdOut.println("Name:               Id:                 Score:              Grade:");


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

        System.out.print(FileIO.Grade(student.getScore(0)));

    }


}

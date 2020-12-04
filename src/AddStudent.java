import edu.princeton.cs.algs4.StdOut;

import java.io.BufferedReader;
import java.io.IOException;

public class AddStudent {

    public static void ChooseStudent(String classPath, int readClassAmount, AllStudent allStudent) throws IOException {//处理班级文件
        BufferedReader br = FileIO.ReadTxt(classPath);
        assert br != null;
        String line = br.readLine();
        String[] name = FileIO.SpiltString(line);
        line = br.readLine();
        allStudent.courses.add(new Course(name[0], name[1], line));
        int number = Integer.parseInt(line);
        for (int i = 0; i < number; i++) {
            line = br.readLine();
            String[] student = FileIO.SpiltString(line);
            int ok = FindStudent(student[2], allStudent);
            if (ok != -1) {
                UpdateStudent(allStudent.AllStudent.get(ok), Double.parseDouble(student[3]), readClassAmount);

            } else {
                addStudent(allStudent, student[0], student[1], student[2], Double.parseDouble(student[3]), readClassAmount);
            }

            StdOut.println();
        }
    }


    public static int FindStudent(String id, AllStudent allStudent) {
        for (int i = 0; i < allStudent.AllStudent.size(); i++) {
            if (id.equals(allStudent.AllStudent.get(i).getID())) {
                return i;
            }
        }
        return -1;
    }


    public static void UpdateStudent(Student student, double score, int index) {
        student.setScore(score, index);
    }

    public static void addStudent(AllStudent allStudent, String surnName, String givenName, String ID, double score, int index) {
        allStudent.AllStudent.add(new Student(surnName, givenName, ID, score, index));
    }


}

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.io.IOException;

public class cin_txt {


    public static void main(String[] args) throws IOException {

        int readClassAmount = 0;
        StdOut.println("Please enter the database filename:");


        AllStudent allStudent = new AllStudent();
        String classPath = StdIn.readLine();
        FileIO.deal(classPath, allStudent); // 传入路径，传出解析后信息所存储的地方。然后（读取文件，解析文件信息，放信息进容器）
        //StatisticsReports.statisticsReports(input);
        AddStudent.ChooseStudent(classPath, readClassAmount, allStudent);
        //StdOut.println(allStudent.AllStudent.toString());
        readClassAmount++;

        StdOut.println("Do you have another score report?\n" +
                "Press \"Y\" for Yes and \"N\" for No.");
        if (StdIn.readLine().equals("Y")) {
            StdOut.println("Please enter the database filename:");
            FileIO.deal(classPath, allStudent);
            classPath = StdIn.readLine();
            AddStudent.ChooseStudent(classPath, readClassAmount, allStudent);
            //StdOut.println(allStudent.AllStudent.toString());
        }

        Methods.SortingOnGPA(allStudent);


        //StdOut.println("Please input the student ID:");
        //ScoreInquiry.scoreInquirybyid(StdIn.readLine(), allStudent);

        StdOut.println("Please input the surname:");
        ScoreInquiry.scoreInquirybysurname(StdIn.readLine(), allStudent);


    }


}

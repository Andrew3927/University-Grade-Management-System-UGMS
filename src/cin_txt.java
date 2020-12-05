//import edu.princeton.cs.algs4.StdIn;
//import edu.princeton.cs.algs4.StdOut;
//
//import java.io.IOException;
//
//public class cin_txt {
//
//
//    public static void main(String[] args) throws IOException {
//
//        int readClassAmount = 0;
//        StdOut.println("Please enter the database filename:");
//
//        AllStudent allStudent = new AllStudent(); // initialize the global container to store the whole read info.
//        String classPath = StdIn.readLine(); // get the txt's path from client
//
//        StudentFileIO.readFile(classPath, allStudent); // 传入路径，传出解析后信息所存储的地方。然后（读取文件，解析文件信息，放信息进容器）
//        allStudent.showInfo();
////        AddCourse_studentsList.ChooseStudent(classPath, readClassAmount, allStudent);
//
//        readClassAmount++;
//
//        StdOut.println("Do you have another score report?\n" +
//                "Press \"Y\" for Yes and \"N\" for No.");
//        if (StdIn.readLine().equals("Y")) {
//            StdOut.println("Please enter the database filename:");
//            StudentFileIO.readFile(classPath, allStudent);
//            classPath = StdIn.readLine();
////            AddCourse_studentsList.ChooseStudent(classPath, readClassAmount, allStudent);
//            StudentFileIO.readFile(classPath, allStudent);
//        }
//
////        Methods.SortingOnGPA(allStudent);
//
//
//        //StdOut.println("Please input the student ID:");
//        //ScoreInquiry.scoreInquirybyid(StdIn.readLine(), allStudent);
//
//        StdOut.println("Please input the surname:");
////        ScoreInquiry.scoreInquirybysurname(StdIn.readLine(), allStudent); Haven't modified yet
//
//
//    }
//
//
//}

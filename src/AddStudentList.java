public class AddStudentList {

//    public static void ChooseStudent(String classPath, int readClassAmount, AllStudent allStudent) throws IOException {//处理班级文件
//        BufferedReader br = FileIO.ReadTxt(classPath);
//        assert br != null;
//        String line = br.readLine();
//        String[] name = FileIO.spiltString(line);
//        line = br.readLine();
//        allStudent.globalCoursesList.add(new Course(name[0], name[1], line));
//        int number = Integer.parseInt(line);
//        for (int i = 0; i < number; i++) {
//            line = br.readLine();
//            String[] student = FileIO.spiltString(line);
//            int ok = FindStudent(student[2], allStudent);
//            if (ok != -1) {
//                UpdateStudent(allStudent.globalStudentList.get(ok), Double.parseDouble(student[3]), readClassAmount);
//
//            } else {
//                addStudent(allStudent, student[0], student[1], student[2], Double.parseDouble(student[3]), readClassAmount);
//            }
//
//            StdOut.println();
//        }
//    }


//    public static int FindStudent(String id, AllStudent allStudent) {
//        for (int i = 0; i < allStudent.globalStudentList.size(); i++) {
//            if (id.equals(allStudent.globalStudentList.get(i).getStudentID())) {
//                return i;
//            }
//        }
//        return -1;
//    }

//    public static void UpdateStudent(Student student, double score, int index) {
//        student.setScore(score, index);
//    }

//    public static void addStudent(AllStudent allStudent, String surnName, String givenName, String ID, double score, int index) {
//        allStudent.globalStudentList.add(new Student(surnName, givenName, ID, score, index));
//    }


}

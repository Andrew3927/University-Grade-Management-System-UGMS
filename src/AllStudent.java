import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;

public class AllStudent {
    private static ArrayList<Student> globalStudentList = new ArrayList<>();
    private static ArrayList<Course> globalCoursesList = new ArrayList<>();
    private static ArrayList<Student> nowClassStudent = new ArrayList<>();

    // ouput: just for text if it works
    public void showInfo() {
        StdOut.println("**Students Name**");
        for (Student s : globalStudentList)
            StdOut.println("s");

        StdOut.println("**Course List**");
        for (Course c : globalCoursesList)
            StdOut.println("c");

        StdOut.println("**now Class Students**");
        for (Student s : nowClassStudent)
            StdOut.println("s");
    }

    public void addNowClassStudentList(String buf_info, int index) {
        // 对文件的解析工作放在这一层（中间层）进行  IO层-> 容器层-> 定义类层
        String[] analysis_string = buf_info.split(",");
        String firstName = analysis_string[0];
        String lastName = analysis_string[1];
        String studentID = analysis_string[2];
        String score = analysis_string[3];

        // checking if the student is exist before adding
        // The same function as class (muted): AddStudentList
        int temp_index = isExist(studentID);
        if (temp_index != -1) {
//            updatecorrespondingScore(getSelectedStudent(temp_index), score, readClassAmount); 分数和课程平行的功能还要再思考后设计过
            updatecorrespondingScore(getSelectedStudent(temp_index), score, 0);
        } else {
            nowClassStudent.add(new Student(buf_info, index));
//            addStudent(allStudent, student[0], student[1], student[2], Double.parseDouble(student[3]), readClassAmount);
        }
    }

    public void addGlobalCoursesList(Course course) {
        globalCoursesList.add(course);
    }

    public void addGlobalStudentsList(Student stu) {
        globalStudentList.add(stu);
    }

    public int isExist(String id) {
        for (int i = 0; i < globalStudentList.size(); i++) {
            if (id.equals(globalStudentList.get(i).getStudentID())) {
                return i;
            }
        }
        return -1;
    }

    public static void updatecorrespondingScore(Student student, String score, int index) {
        student.setScore(Double.parseDouble(score), index);
    }

    public Student getSelectedStudent(int index) {
        return globalStudentList.get(index);
    }

    public ArrayList<Student> getGlobalStudentList() {
        return globalStudentList;
    }

    public ArrayList<Student> getNowClassStudentList() {
        return nowClassStudent;
    }

    public String getGrade(Double score) {
        return GPA.Grade(score);
    }

    public void sortNowClassStudent() {
        Sort.quickSortGPA(nowClassStudent.size());
    }

    private static class Sort {

        // 快速排序，a是数组，n表示数组的大小

        // 排globalStudentList的序
//        public static void quickSortGPA(AllStudent allStudent, int length) {
//            ArrayList<Student> all = allStudent.globalStudentList;
//            quickSortInternally(allStudent, 0, length - 1);
//        }


        // 快速排序递归函数，p,r为下标
//        private static void quickSortInternally(AllStudent allStudent, int p, int r) {
//
//            if (p >= r) return;
//            StdRandom.shuffle(allStudent.globalStudentList.toArray());
//
//            int q = partition(allStudent, p, r); // 获取分区点
//            quickSortInternally(allStudent, p, q - 1);
//            quickSortInternally(allStudent, q + 1, r);
//        }

        // update version
        public static void quickSortGPA(int length) {
            quickSortInternally(0, length - 1);
        }

        //update version
        private static void quickSortInternally(int start, int end) {
            if (start >= end) return;
//            StdRandom.shuffle(allStudent.globalStudentList.toArray()); seems doens't work

            int q = partition(start, end); // 获取分区点
            quickSortInternally(start, q - 1);
            quickSortInternally(q + 1, end);
        }

        //update version
        private static int partition(int start, int end) {
            double pivot = GPA.getGPA(globalStudentList.get(end).getScores());
            int i = start;
            for (int j = start; j < end; ++j) {
                if (GPA.getGPA(globalStudentList.get(j).getScores()) < pivot) {
                    if (i == j) {
                        ++i;
                    } else {
                        Student mid = globalStudentList.get(i);
                        globalStudentList.set(i++, globalStudentList.get(j));
                        globalStudentList.set(j, mid);
                    }
                }
            }
            Student mid = globalStudentList.get(i);
            globalStudentList.set(i, globalStudentList.get(end));
            globalStudentList.set(end, mid);
            return i;
        }
    }

    // update version
    private static class GPA {
        public static double getGPA(Double[] scores) {//算gpa

            double gradePointTotal = 0;
            double gradeOfEachCourseTotal = 0;
            for (int i = 0; i < globalCoursesList.size(); i++) {
                if (scores[i] == null) continue;
                gradePointTotal += pointOfEachCourse(scores[i]) * globalCoursesList.get(i).getCredit();
                gradeOfEachCourseTotal += globalCoursesList.get(i).getCredit();
            }

            return Double.parseDouble(new java.text.DecimalFormat("#.00").format(gradePointTotal / gradeOfEachCourseTotal));
        }

        public static double pointOfEachCourse(double grade) {//根据实际成绩判断学分方法
            double point = 0.0;
            if (grade >= 93) point = 4.0;
            else if (grade >= 88) point = 3.7;
            else if (grade >= 83) point = 3.3;
            else if (grade >= 78) point = 3.0;
            else if (grade >= 72) point = 2.7;
            else if (grade >= 68) point = 2.3;
            else if (grade >= 63) point = 2.0;
            else if (grade >= 58) point = 1.7;
            else if (grade >= 53) point = 1.3;
            else if (grade >= 50) point = 1.0;
            else point = 0.0;

            return point;
        }

        public static String Grade(double score) {
            if (score >= 93) return "A+";
            else if (score >= 88) return "A";
            else if (score >= 83) return "A-";
            else if (score >= 78) return "B+";
            else if (score >= 72) return "B";
            else if (score >= 68) return "B-";
            else if (score >= 63) return "C+";
            else if (score >= 58) return "C";
            else if (score >= 53) return "C-";
            else if (score >= 50) return "D";
            else if (score >= 40) return "F";
            else return "O";
        }
    }

}

















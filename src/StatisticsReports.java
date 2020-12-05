import edu.princeton.cs.algs4.StdOut;

import java.io.*;
import java.util.Objects;

public class StatisticsReports {

    public static void statisticsReports(String classPath) throws IOException {
//        BufferedReader br = tool.ReadTxt(classtxt);
//        assert br != null;
//        String line = br.readLine();
//        String[] course = tool.SpiltString(line);
//        line = br.readLine();
//        Course course1 = new Course(course[0], course[1], line);
//        StdOut.println("Course Code:" + course1.getName());
//        StdOut.println("Credit:" + course1.getCredit());

        String pathname = Objects.requireNonNull(_2.class.getClassLoader().getResource(classPath)).getPath();
        BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(new File(pathname))));

        String[] buf_info = new String[2];
        for (int i = 0; i < 2; i++) {
            buf_info[i] = bf.readLine();
        }
        Course temp_course = new Course(buf_info);
        int number = temp_course.getClassSize();

        StdOut.println("Course Code:" + temp_course.getCourseCode());
        StdOut.println("Credit:" + temp_course.getCredit());

        double totalScore = 0;
        double averagescore = 0;
        double highestscore = 0;
        double lowestscore = 100;
        int Aplus = 0;
        int A = 0;
        int negativeA = 0;
        int Bplus = 0;
        int B = 0;
        int negativeB = 0;
        int Cplus = 0;
        int C = 0;
        int negativeC = 0;
        int D = 0;
        int F = 0;

        String line = null;
        for (int i = 0; i < number; i++) {
            line = bf.readLine();
            String[] student = line.split(",");
            double score = Double.parseDouble(student[3]);
            totalScore += score;
            if (highestscore < score) highestscore = score;
            if (lowestscore > score) lowestscore = score;
            if (score >= 93) Aplus++;
            else if (score >= 88) A++;
            else if (score >= 83) negativeA++;
            else if (score >= 78) Bplus++;
            else if (score >= 72) B++;
            else if (score >= 68) negativeB++;
            else if (score >= 63) Cplus++;
            else if (score >= 58) C++;
            else if (score >= 53) negativeC++;
            else if (score >= 50) D++;
            else if (score >= 40) F++;
        }
        averagescore = totalScore / number;

        StdOut.println("The average score:" + averagescore);
        StdOut.println("The highest score:" + highestscore);
        StdOut.println("The lowest score:" + lowestscore);
        StdOut.println("Course Grade Statistics:");
        StdOut.println("A+:" + Aplus);
        StdOut.println("A: " + A);
        StdOut.println("A-:" + negativeA);
        StdOut.println("B+:" + Bplus);
        StdOut.println("B: " + B);
        StdOut.println("B-:" + negativeB);
        StdOut.println("C+:" + Cplus);
        StdOut.println("C: " + C);
        StdOut.println("C-:" + negativeC);
        StdOut.println("D: " + D);
        StdOut.println("F: " + F);


    }
}

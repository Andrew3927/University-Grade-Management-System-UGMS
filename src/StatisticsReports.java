import edu.princeton.cs.algs4.StdOut;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.io.BufferedReader;
import java.io.IOException;

public class StatisticsReports {

    @SuppressFBWarnings("NP_DEREFERENCE_OF_READLINE_VALUE")
    public static void statisticsReports(String classPath) throws IOException {
        BufferedReader br = FileIO.ReadTxt(classPath);
        assert br != null;
        String line = br.readLine();
        String[] course = FileIO.SpiltString(line);
        line = br.readLine();
        Course course1 = new Course(course[0], course[1], line);
        int number = course1.getClassSize();
        StdOut.println("Course Code:" + course1.getCourseCode());
        StdOut.println("Credit:" + course1.getCredit());

        double allscore = 0;
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


        for (int i = 0; i < number; i++) {
            line = br.readLine();
            String[] student = FileIO.SpiltString(line);
            double score = Double.parseDouble(student[3]);
            allscore += score;
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
        averagescore = allscore / number;

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

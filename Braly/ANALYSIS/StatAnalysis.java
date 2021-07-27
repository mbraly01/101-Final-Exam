package Braly.ANALYSIS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class StatAnalysis {

    public static final String DIR = "/Users/mattbraly/Documents/CS-101/Lecture18IOExercise/src/Braly/MAIN/";

    public static int countValues(String fp) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fp));
        //A little more efficient than Scanner
        String v;
        int count = 0;
        while((v = br.readLine()) != null) {
            String[] vArray = v.split(" ");
            count += vArray.length;
        }

        return count;
    }
}

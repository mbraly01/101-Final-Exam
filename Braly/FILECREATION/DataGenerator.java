package Braly.FILECREATION;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;
import java.io.IOException;
import java.text.DecimalFormat;

public class DataGenerator {

    public static final String DIR = "/Users/mattbraly/Documents/CS-101/Lecture18IOExercise/src/Braly/MAIN/";

    public static void buildIntegerFile(String fp, int count) throws IOException{

        BufferedWriter bw = new BufferedWriter(new FileWriter(fp));
        Random R = new Random();
        for (int i = 0; i < count; i++) {
            int v = R.nextInt(101);
            if(i % 10 == 0 && i !=0){
                bw.write("\n");
            }
            //to write an int to a file you need to use
            //the following code
            bw.write(String.valueOf(v) + " ");
        }
        bw.close();

    }

    public static void buildDecimalFile(String fp, int count) throws IOException{

        BufferedWriter bw = new BufferedWriter(new FileWriter(fp));
        Random R = new Random();
        DecimalFormat df = new DecimalFormat("#.##");
        for (int i = 0; i < count; i++) {
            double v = R.nextDouble() * 100;
            if(i % 10 == 0 && i !=0){
                bw.write("\n");
            }
            //to write an int to a file you need to use
            //the following code
            bw.write(df.format(v) + " ");
        }
        bw.close();
    }

    public static void buildCharacterFile(String fp, int count) throws IOException{

        BufferedWriter bw = new BufferedWriter(new FileWriter(fp));
        Random upperCase = new Random();
        Random lowerCase = new Random();
        Random choice = new Random();

        for(int i = 0; i < count; i ++) {
            int U = upperCase.nextInt(26) + 65;
            int L = lowerCase.nextInt(26) + 97;
            int C = choice.nextInt(2);
            if(i % 10 == 0 && i != 0){
                bw.write("\n");
            }
            if(C == 0) {
                bw.write((char)U + " ");
            }
            else {
                bw.write((char)L + " ");
            }
        }
        bw.close();
    }

    public static void buildAlphaNumericFIle(String fp, int count) {

    }
}

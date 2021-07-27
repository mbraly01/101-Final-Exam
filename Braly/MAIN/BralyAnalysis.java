package Braly.MAIN;

import Braly.ANALYSIS.StatAnalysis;
import Braly.FILECREATION.DataGenerator;
import java.io.IOException;

public class BralyAnalysis {

    public static void main(String[] args) throws IOException{

        DataGenerator.buildIntegerFile(DataGenerator.DIR + "File1", 100);
        DataGenerator.buildDecimalFile(DataGenerator.DIR + "File2", 100);
        DataGenerator.buildCharacterFile(DataGenerator.DIR + "File3", 100);
        System.out.println(StatAnalysis.countValues(DataGenerator.DIR + "File1"));
    }
}

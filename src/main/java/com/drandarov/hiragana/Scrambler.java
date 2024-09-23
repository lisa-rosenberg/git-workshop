package com.drandarov.hiragana;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

import static com.drandarov.hiragana.HiraganaDataSet.*;

/**
 * @author dmitrij-drandarov
 * @since 10 Apr 17
 */
public class Scrambler {

    /**
     * Run this method to print randomly generated syllable concatenations to the console.
     * Choose any amount of datasets from {@link HiraganaDataSet} in the first line.
     * </br>
     * If you want to use hiragana data, line 22+23 need to be commented in and line 26+27 need to be commented out.
     * If you want to use romaji data, line 22+23 need to be commented out and line 26+27 need to be commented in.
     */
    public static void main(String[] args) {
        // Use hiragana data
        String[][] dataSet = Stream.of(temp, hiraganaData, hiraganaExtraData)
                .flatMap(Stream::of).toArray(String[][]::new);

        // Use romaji data
//        String[][] dataSet = Stream.of(temp, romajiData, romajiExtraData)
//                .flatMap(Stream::of).toArray(String[][]::new);

        int minSyllableCount = 2; // e.g. "ba.ka"
        int maxSyllableCount = 5; // e.g. "ha.hi.fu.he.ho"
        int wordCount = 20;       // Amount of generated words
        int set;

        ThreadLocalRandom random = ThreadLocalRandom.current();

        for (int i = 0; i < wordCount; i++) {
            for (int j = 0; j < random.nextInt(minSyllableCount, maxSyllableCount + 1); j++) {
                System.out.print(dataSet[set = random.nextInt(0, dataSet.length)]
                                              [random.nextInt(0, dataSet[set].length)]);
            }
            System.out.println(/*"\n"*/); // Uncomment if you want empty lines between words
        }
    }

}

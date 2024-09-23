package com.drandarov.hiragana;

import static com.drandarov.hiragana.HiraganaDataSet.hiraganaData;
import static com.drandarov.hiragana.HiraganaDataSet.hiraganaExtraData;
import static com.drandarov.hiragana.HiraganaDataSet.temp;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

/**
 * @author dmitrij-drandarov
 * @since 10 Apr 17
 */
public class Scrambler {

    /**
     * Run this method to print randomly generated syllable concatenations to the console.
     * Choose any amount of datasets from {@link HiraganaDataSet} in the first line.
     */
    public static void main(final String[] args) {
        final String[][] dataSet =
                Stream.of(temp, hiraganaData, hiraganaExtraData).flatMap(Stream::of).toArray(String[][]::new);

        final int minSyllableCount = 2; // e.g. "ba.ka"
        final int maxSyllableCount = 5; // e.g. "ha.hi.fu.he.ho"
        final int wordCount = 20;       // Amount of generated words
        int set;

        final ThreadLocalRandom random = ThreadLocalRandom.current();

        for (int i = 0; i < wordCount; i++) {
            for (int j = 0; j < random.nextInt(minSyllableCount, maxSyllableCount + 1); j++) {
                System.out.print(
                        dataSet[set = random.nextInt(0, dataSet.length)][random.nextInt(0, dataSet[set].length)]);
            }
            System.out.println(/*"\n"*/); // Uncomment if you want empty lines between words
        }
    }

}

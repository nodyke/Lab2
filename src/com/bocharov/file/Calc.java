package com.bocharov.file;

import java.io.*;

/**
 * Created by Nodyke on 31.03.2016.
 */
public class Calc {
    File file;


    public Calc(ReaderFile a) {
        this.file = a.getFile();
    }

    public int calcWords(int length) {
        try( BufferedReader in = new BufferedReader(new FileReader(file))) {


            int sum = 0;
            String s = in.readLine();
            String[] words;
            while (s != null) {
                words = s.split("\\.|\\ |\\,|\\-");
                for (String i : words
                        ) {
                    if (i.length() == length) sum++;

                }
                s = in.readLine();
            }
            return sum;

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }


        return 0;
    }
}

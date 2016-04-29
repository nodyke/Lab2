package com.bocharov.file;

import com.bocharov.menu.Input;

import java.io.*;

/**
 * Created by Nodyke on 24.03.2016.
 */
public class ReaderFile {
    String filename;

    public ReaderFile(String filename) {
        this.filename = filename;
    }

    public File getFile() {
        Input in = new Input();
        File a;
        while (true) {
            try {
                a = new File(filename);
                if (a.exists()) return a;
                System.out.println("Файл не существует!");
                filename = in.getFilename();
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
    }


}

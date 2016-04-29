package com.bocharov.menu;

import com.bocharov.file.Calc;
import com.bocharov.file.ReaderFile;

/**
 * Created by Nodyke on 31.03.2016.
 */
public class Start {
    public void begin ()
    {
        Input con=new Input();
        Calc temp=new Calc(new ReaderFile(con.getFilename()));
        lenghtPrint(temp.calcWords(con.getLength()));


    }
    private void lenghtPrint(int sum)
    {
        if (sum>0) System.out.println("Количество слов заданной длины: "+sum);
        else System.out.println("Слова с указанной длинной не были найдены");
    }
}

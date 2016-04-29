package com.bocharov.main;

import com.bocharov.menu.Start;

/**
 * Created by Nodyke on 24.03.2016.
 */
public class Main {
    public static void main(String[] args)
    {
        try {
            Start st = new Start();
            st.begin();
        }
        catch (Exception ex) {System.err.println(ex.getMessage());}
    }
}

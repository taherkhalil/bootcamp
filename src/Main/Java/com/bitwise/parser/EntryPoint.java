package com.bitwise.parser;

import java.util.ArrayList;

/**
 * Created by taherk on 7/13/2016.
 */
public class EntryPoint {
    public void takeArgs() {
    }

    public  static String[] argument;

    public static String[] getArgument() {
        return argument;
    }

    public static void setArgument(String[] argument) {
        EntryPoint.argument = argument;
    }

    public static void main(String[] args)
    {
        argument =args;
        for(int i=0;i<argument.length;i++) {
          //  System.out.println(argument[i]+" ooo");


        }
        Schema s = new Schema();
        s.checkIfSymbolIsPresent();
    }
}

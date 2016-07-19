package com.bitwise.parser;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.*;

/**
 * Created by taherk on 7/13/2016.
 */
public class Schema {
    public static final String[] flag ={"-l","-p","-d","-a"};

    Map port = new HashMap<String, Object>();
    //Map dir = new HashMap<String, String>();
    //Map logging = new HashMap<String, Boolean>();

    public Schema()
    {


    }


    void add() {
        port.put("-p", 8080);
       // dir.put("-d", "/");
        //logging.put("-l", false);
    }

    void checkIfSymbolIsPresent() {
        EntryPoint entry = new EntryPoint();
        String[] str = null;
        for (int i = 0; i < entry.getArgument().length; i++) {
            //System.out.println(entry.getArgument()[i]);

            str = entry.getArgument();

        }
        StringTokenizer token =new StringTokenizer(Arrays.toString(str));
        while(token.hasMoreTokens())
        {
            System.out .println(token.nextToken());

        }


        System.out.println(Arrays.toString(str));


    }


}

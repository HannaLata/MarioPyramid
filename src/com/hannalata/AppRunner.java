package com.hannalata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class AppRunner {

    private static final Logger LOGGER = Logger.getLogger(AppRunner.class.getName());

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int height = 0;
        do {
            LOGGER.info("Input height of pyramid from 1 to 23");
            height = Integer.parseInt(reader.readLine());
            break;
        }
        while (height > 0 && height < 24);

        int i = height;
        int x;
        for ( ; height>0; height-- ){
            int count = 0;
            for (x = height - 1 ; x > 0; x-- ){
                System.out.print(" ");
                count++;
            }
            for ( ; count<=i; count++ ){
                System.out.print("#");
            }
            System.out.println();
        }
    }


        }



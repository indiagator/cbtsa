package com.cbt;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)  //ENTRY POINT
    {

        while(true)
        {

            System.out.println("Welcome to the CBT APP Dear Buyer with arguments :"+args[0]);

            System.out.println("Do you want to BROWSE(1) or SEARCH(2) ?");
            Scanner bors_scanner = new Scanner(System.in);
            Integer bors_input =   bors_scanner.nextInt();



            if( bors_input == 1)
            {
                //BROWSE LOGIC
            }
            else if (bors_input == 2)
            {
                //SEARCH LOGIC
            }
            else
            {
                //INVALID INPUT LOGIC
            }

        }
        // HAVING ACCESS TO THE MAIN METHOD MEANS HAVING CONTROL



    }
}
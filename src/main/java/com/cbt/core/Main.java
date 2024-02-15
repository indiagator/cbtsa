package com.cbt.core;

import com.cbt.implementation.Buyer;
import com.cbt.implementation.User;

import java.util.Random;
import java.util.Scanner;

public class Main // THIS ALSO EXTENDS THE OBJECT CLASS
{
    public static void main(String[] args)  //ENTRY POINT
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

            User.getPi(); //STATIC METHOD

            User user_1;  // DECLARATION

            user_1 = new User((new Integer((new Random()).nextInt())).toString(),
                    "test user2"); //INSTANTIATION


            user_1.setCompany("test company"); // INITIALIZATION | INSTANCE METHOD
            user_1.setEmail("test@gmail.com"); // INITIALIZATION | INSTANCE METHOD
            user_1.setPhone("78797685"); // INITIALIZATION | INSTANCE METHOD

            System.out.println(user_1.getUserHash());
            System.out.println(user_1.getUserHash("overloaded"));

            Buyer buyer_1 = new Buyer((new Integer((new Random()).nextInt())).toString(),
                    "test buyer1");

            Buyer buyer_2 = new Buyer((new Integer((new Random()).nextInt())).toString(),
                    "test buyer2");
            buyer_2.remove();


        // HAVING ACCESS TO THE MAIN METHOD MEANS HAVING CONTROL



    }
}
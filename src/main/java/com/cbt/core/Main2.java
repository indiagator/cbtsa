package com.cbt.core;

import com.cbt.api.Communicable;
import com.cbt.api.Editable;
import com.cbt.implementation.*;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) //ALTERNATE ENTRY POINT
    {
        System.out.println("This is the other main method");

        MyNumber num_1 = new MyNumber();
        num_1.setValue(45);

        MyNumber num_2 = new MyNumber();
        num_2.setValue(76);

        System.out.println(num_1.incrementValue());
        //num_2=num_1; //OLD REFERENCE VALUE IN NUM_2 IS NOW LOST AND THAT OBJECT IS MARKET FOR GC
        System.out.println(num_2.incrementValue());
        System.out.println(num_2.incrementOtherValue(num_1));
        System.out.println(num_2.getValue());
        System.out.println(num_1.getValue());

        Buyer user_1 = new Buyer("hfd67","harshit mehra");
        user_1.setEmail("harshit@gmail.com");
        System.out.println(((Buyer) user_1).placeOrder());

        Editable user_2 =  new Buyer("","");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to create a BUYER(1) or SELLER(2)");
        int user_input = scanner.nextInt();

        Communicable user_3=null;

        if(user_input == 1)
        {
            user_3 = new Buyer("jsdfwf","manoj kumar");
        }
        else if (user_input == 2)
        {
            user_3 = new Seller("fwefwf","ramesh kumar");
        }
        else
        {
            System.out.println("invalid input");
        }

        System.out.println(user_3.introduce());
    }
}

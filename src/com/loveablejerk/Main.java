package com.loveablejerk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//    System.out.println("MyFootPrints is a Java based Program (Future Android Application) \n" +
//            "that gives you a glimpse of tracks that you leave behind while surfing the Internet....");

        System.out.println("Choose The Devices that you  Use:\n"+ "1) " +
                "Computers \n2) Mobile Devices" + "\n \n Press 1 For Computers 2 for Mobile Devices and 3 For Both" );

                int userDevices = new Scanner(System.in).nextInt();
                devices(userDevices);

    }


    private static void devices(int userDevices){

        if(userDevices == 1){
            System.out.println("Choose Your Computer's Operating System. From the List Below");
            System.out.println("\n1) GNU/Linux \n2) Mac OS \n3) Windows");
            int computerDevice = new Scanner(System.in).nextInt();
            computer(computerDevice);
        }

        else if (userDevices == 2){
            System.out.println("Choose Your Mobile's Operating System. From the List Below");
            System.out.println("\n 1) Android \n2) iOS \n3) Black Berry \n4) Windows");
            int mobileDevice = new Scanner(System.in).nextInt();
            mobile(mobileDevice);
        }

//        else if(userDevices == 3){
//            System.out.println("Choose Your Mobile's Operating System. From the List Below");
//            System.out.println("\n 1) Android \n2) iOS \n3) Black Berry \n4) Windows");
//        }

        else{  System.out.println("Your Provided the Wrong Input. Plz Restart the Program"); }
    }


          private static void computer(int computerDevice){
         if(computerDevice ==1){

             System.out.println("-------------------LOCAL FOOT PRINTS-------------------");
             System.out.println("+Operating system updates\n" +
                     "+MAC Address\n" +
                     "+Browser History\n" +
                     "+Operating system version number\n" +
                     "+Language\n" +
                     "+Computer specification (Hardware)\n" +
                     "+Browser Fingerprint");

             System.out.println("\n-------------------NETWORK FOOT PRINTS-------------------");
             System.out.println("You Don't have any Network FOOT PRINTS");

             System.out.println("\n-------------------INTERNET FOOT PRINTS-------------------");
             System.out.println("+Email address\n" +
                     "+Date and Time\n" +
                     "+Credit Card / Debit Card / Cash\n");

             System.out.println("\nYOU HAVE TOTAL OF 11 FOOT PRINTS ON THE INTERNET");

         }

             }


         private static void mobile(int mobileDevice){

         }


}

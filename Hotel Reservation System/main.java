import Hotel.Hotel;

import java.util.Scanner;

public class main {








    public static class HotelSystem {

        public static void main(String... args)
        {

            Scanner input = new Scanner(System.in);

            Hotel[]h= new Hotel[10];



                for (int i = 0; i<1; i++)
                {

                    System.out.println("Enter the name:");
                    String name = input.next();
                    System.out.println("Enter the address:");
                    String address = input.next();
                    System.out.println("Enter the city:");
                    String city = input.next();
                    System.out.println("Enter the country");
                    String country = input.next();
                    System.out.println("Enter the phone number:");
                    double phoneNum = input.nextDouble();
                    System.out.println("Enter the destination:");
                    String destination = input.next();
                    System.out.println("Enter the postcode");
                    int pc = input.nextInt();
                    System.out.println("Enter the date:");
                    double d = input.nextInt();
                    System.out.println("Enter the room type: A- Single Room, B- Double Room, C- Queen Room ");
                   String rType = input.next();

                    var s = "Hotel name: " + name + "\n" + "Address: " + address + "\n" + "City: " + city + "\n" + "Country: " + country + "\n" + "Phone Number: "
                            + phoneNum + "\n" + "Destination: " + destination + "\n" + "Postcode: " + pc + "\n" + "Date: " + d + "\n" + "Room Type: " + rType;

                }


}}}

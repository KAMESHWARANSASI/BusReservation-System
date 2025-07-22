package busReservaction;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {

	public static void main(String[] args)
	{
	 
		
//	Buss object	
	ArrayList<Bus> buses= new ArrayList<Bus>();
		
	     buses.add(new Bus(1,true,1));
	     buses.add(new Bus(2,true,45));
	     buses.add(new Bus(3,true,45));
	    	
	     
		for(Bus b:buses)
		{
			b.display();
		}
		
		
//Booking object details
		
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		
//	---------------------------	
		   int userOpction=1;
		   Scanner sc=new Scanner(System.in);
		   
          	while(userOpction==1)
          	{	
          		System.out.println("Enter 1 to Book 2 to exit");
          		userOpction=sc.nextInt();
          		if(userOpction==1)
          		{
          			Booking booking=new Booking();
          			if(booking.isAvailable(bookings,buses))
          			{
          				bookings.add(booking);
          				System.out.println("Your bokking is conformed");
          			}
          			else {
          				System.out.println("Sorry, Bus is full.Try another bus or date");
          			}
          		}
          		
          	}	
           
	}

}

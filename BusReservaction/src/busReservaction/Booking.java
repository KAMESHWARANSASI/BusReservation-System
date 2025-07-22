package busReservaction;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking 
{
	String PassengerName;
	int BusNo;
	Date Date;
	
	Booking()
	{
	Scanner sc=new Scanner(System.in);	
	     System.out.println("Enter Passenger name");
	     PassengerName=sc.next();
	     System.out.println("Enter Bus Number");
	     BusNo=sc.nextInt();
	     System.out.println("Enter the Date dd-mm-yyyy");
	     String dateinput=sc.next();
	     SimpleDateFormat dataFormet=new SimpleDateFormat("dd-MM-yyyy");
	     
	    try {
			Date = dataFormet.parse(dateinput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
		 int capacity=0;
		    for(Bus bus: buses)
		    {
		         if(bus.getBusNo()==BusNo)
		         {
		        	 capacity=bus.getCapacity();
		         }
		    }
		    
		    int booked=0;
		    for(Booking book:bookings)
		    {
		    	if(book.BusNo == BusNo && book.Date.equals(Date))
		    	{
		    		booked++;
		    	}
		    }
		    
		    return booked<=capacity?true:false;
	}
}

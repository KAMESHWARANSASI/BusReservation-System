package busReservaction;

public class Bus 
{

	
	private int BusNo;
	private boolean Ac;
	private int Capacity;
	
	public Bus(int i, boolean b, int j) 
	{
		BusNo=i;
		Ac=b;
		Capacity=j;
	}

	public int getBusNo() {
		return BusNo;
	}


	public boolean isAc() {
		return Ac;
	}

	public void setAc(boolean ac) {
		Ac = ac;
	}

	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}
	
	public void display()
	{
		System.out.println("Bus no : "+getBusNo() +" Ac : "+isAc()+" capacity : "+getCapacity());
	}
	
}

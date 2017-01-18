package gimWillson.classobject;

public class Classobject {
	int passengers;
	private int seats ;
	public Classobject(int passengers) {
		// TODO Auto-generated constructor stub
	this .passengers=passengers;
	 
	
	}

	
	

 
	public Classobject() {
		// TODO Auto-generated constructor stub
	}


	public void addPassenger()
	{
		passengers++;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	
	
}

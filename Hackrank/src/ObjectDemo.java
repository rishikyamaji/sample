import java.util.GregorianCalendar;
/*object class methods 
//obj.toString() for object string implementation we can override this meyhod
//obj.equals()  to know that the present object same or not
//obj.finalize() to clear the unreferenced objects
//obj.clone()   to create the same object again
//obj.getClass() to know the present object class
//void notify()
//This method wakes up a single thread that is waiting on this object's monitor.
//void wait()

//This method causes the current thread to wait until another thread invokes the notify() method or the notifyAll() method for this object.*/
public class  ObjectDemo {

	public static void main(String[] args) {

		// create a gregorian calendar, which is an object
		GregorianCalendar cal = new GregorianCalendar();

		// clone object cal into object y
		GregorianCalendar y = (GregorianCalendar) cal.clone();

		// print both cal and y
		System.out.println(y.equals(cal));
		System.out.println("" + cal.getTime());
		System.out.println(cal.getClass());
		System.out.println("" + y.getTime());
	
	}
}



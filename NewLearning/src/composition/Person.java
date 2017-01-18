package composition;

public class Person {

    //composition has-a relationship
    private Job j;
    
    
   
    public Person(){
        this.j=new Job();
        j.setSalary(1000);
    }
    public long getSalary() {
        return j.getSalary();
    }
    public static void main(String args[])
    {
    	Job j=new Job();
    	System.out.println(j.k);
    	
    }

}

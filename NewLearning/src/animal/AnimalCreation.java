package animal;

public class AnimalCreation {
	public static void main(String args[]){
		Cat cat = new Cat(false, 3);
		Animal an = new Animal(4);
		
	     Dog dog = new Dog(4);
	     Domasticanimal doma =new Domasticanimal(true,3);
	     Animal ann =new Dog(6);
	     Animal kkk = new Dog(7);
		
		an.describe();
		cat.describe(9);
		dog.describe();
		dog.nature();
		cat.tale(1);
		doma.describe("animals maintain diversity ");
		doma.describe();
		ann.describe();
	}
}

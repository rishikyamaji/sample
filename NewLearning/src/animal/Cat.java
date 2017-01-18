package animal;

public class Cat extends Animal {

	private boolean twistedTale;
		
	Cat(boolean twistedTale, int legs){
		super(legs);
		this.twistedTale = twistedTale;
	}
	
	
	public void describe(){
		System.out.println("This is Cat: with "+super.getLegs()+" Legs and " + (this.twistedTale ? " Twisted tale" : " No twisted tale"));
		System.out.println(i);
		System.out.println(m);
	}
	public void describe(int k){
		System.out.println("iam a cat with 4 legs" +k+"i am happy");
	}
}

	
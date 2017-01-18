package animal;

public class Animal {
	private int legs;
	public int tale;
	public int i=10;
	protected int m=10;
	
	Animal(int legs){
		this.legs = legs;
	}
	
	public int getLegs(){
		return this.legs;
	}
	
	public void nature()
	{
		System.out.println("all animals are not same kind");
	}
	public void tale(int tale)
	{
		System.out.println("every animal has"+"\t"+tale+"tale");
	}
	
	public void describe() {
		System.out.println("This is Animal: with "+ legs + " Legs");
	}
	public void describe(String s) {
		System.out.println(s);
	}
}

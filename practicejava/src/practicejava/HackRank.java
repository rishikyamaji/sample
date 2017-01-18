package practicejava;

public class HackRank {
	public static void main(String args[]){
		
		HackRank t = new HackRank();
		int x = 0;
		t.printType( x);
		
			
	}
	void printType(byte x) {
        System.out.println(x + " is an byte");
    }
    void printType(int x) {
        System.out.println(x + " is an int");
    }
    void printType(float x) {
        System.out.println(x + " is an float");
    }
    void printType(double x) {
        System.out.println(x + " is an double");
    }
    void printType(char x) {
        System.out.println(x + " is an char");
    }
}

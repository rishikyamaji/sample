import variable.VariableScope;



public class OperatersUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(2<1);
		System.out.println(3>1);
		System.out.println(1==1);
		
		VariableScope big= new VariableScope();
		big.mybro="rahul";
		big.mybroage=28;
		System.out.println(big.mybro+  "\t" +big.mybroage);
		
		VariableScope younger= new VariableScope();
		
		younger.mybro="nikhil";
		younger.mybroage=22;
		System.out.println(younger.mybro+  "\t" +younger.mybroage);
		big.family();
		younger.family();
		big.family("my family wonderfull");
	
		
		
		

	}

}

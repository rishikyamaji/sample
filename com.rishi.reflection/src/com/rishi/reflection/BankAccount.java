package com.rishi.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BankAccount {
  int account_Id;
  int  balance;
  public BankAccount(int account_Id)
  {
	this.account_Id=account_Id;  
  }
  public BankAccount(int account_Id, int balance)
  {
	  this.account_Id=account_Id;
	  this.balance=balance;
	  
  }
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

		BankAccount b1= new BankAccount(123);
		BankAccount b2= new BankAccount(123,500);
		dowork(b1);
		System.out.println(b1.account_Id );
	}
	//Class<?> c1=Class.forName("com.rishi.reflection.BankAccount");
//	Class<?> c1=BankAccount.class;
//      showname(c1);
	static void dowork(Object b1) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException
	{
		Class<?> c= b1.getClass();
		showname(c);
		Method m= c.getMethod("account_Id");
		Object result =m.invoke(b1);
		System.out.println(result);
		
	}
	static  void showname(Class<?> theclass)
	{
		
	   Field[] field= theclass.getDeclaredFields();
	   accessfields(field);
	}
	//fields accessing
	 static void accessfields(Field[] arr)
	{
		for(Field f : arr)
		{
			System.out.println(f.getName() +"  " + f.getType());
		}
	}
	

}

package MyProjects;

import java.util.Scanner;

public class CalculatorProg {
	static int total=0;
	public static void main(String[] args) {
		System.out.println("Calculator Application V1.0");
		System.out.println(" Developed By : SM.SUNDAR ");
		System.out.println("---------------------------");
		System.out.print("> Enter First Value : ");
		Scanner First = new Scanner(System.in);
		int F=First.nextInt();
		System.out.print("> Enter Second Value : ");
		Scanner Second = new Scanner(System.in);
		int S=Second.nextInt();
		System.out.println("---------------------------");
		System.out.println("Select Options");
		System.out.println("---------------------------");
		System.out.println("Addtion Press 1");
		System.out.println("Subraction Press 2");
		System.out.println("Multiplication Press 3");
		System.out.println("Division Press 4");
		//System.out.println("Modular Press 5");
		
		Scanner Ipt=new Scanner(System.in);
		int Select=Ipt.nextInt();
		
		switch(Select)
		{
			case 1:
				Add(F,S);
				System.out.println("---------------------------");
				System.out.println("Result : "+total);
				System.out.println("---------------------------");
			break;
			case 2:
				Sub(F,S);
				System.out.println("---------------------------");
				System.out.println("Result : "+total);
				System.out.println("---------------------------");
			break;
			case 3:
				Multi(F,S);
				System.out.println("---------------------------");
				System.out.println("Result : "+total);
				System.out.println("---------------------------");
			break;
			case 4:
				Div(F,S);
				System.out.println("---------------------------");
				System.out.println("Result : "+total);
				System.out.println("---------------------------");
			break;
			/*case 5:
				Modu(F,S);
				System.out.println("---------------------------");
				System.out.print("Result : "+total);
			break;*/
		}
	}
	public static int Add(int val1,int val2){
		total=val1+val2;
		return total;
	}
	public static int Sub(int val1,int val2){
		total=val1-val2;
		return total;
	}
	public static int Multi(int val1,int val2){
		total=val1*val2;
		return total;
	}
	public static int Div(int val1,int val2){
		try{
			total=val1/val2;
			return total;
		}
		catch(Exception e)
		{
			System.out.println("Check Your Inputs");
		}
		return total;
	}
	/*public static int Modu(int val1,int val2){
		total=val1%val2;
		return total;
	}*/
}

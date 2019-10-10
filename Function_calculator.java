import java.util.Scanner;
public class Function_calculator {
	public static void main(String [] args)
	{
		int option,answer,num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Select from the given menu to perform calculation :"+"\n"+ "1 for addition" + "\n" + "2 for subtraction" + "\n" + "3 for multiplication" + "\n" + "4 for division" + "\n" + "5 for remainder");
		option = sc.nextInt();
		System.out.println("Enter first number :");
		num1 = sc.nextInt();
		System.out.println("Enter the second number :");
		num2 = sc.nextInt();
		
		switch(option)
		{
		case(1):
			answer=add(num1,num2);
		    System.out.println("The answer is "+ answer);
		    break;
		case(2):
			answer=subtract(num1,num2);
		 System.out.println("The answer is "+ answer);
		    break;
		case(3):
		    answer=multiplication(num1,num2);
		 System.out.println("The answer is "+ answer);
		    break;
		case(4):
		    answer=divide(num1,num2);
		 System.out.println("The answer is "+ answer);
			break;
		case(5):
			answer=remainder(num1,num2);
		 System.out.println("The answer is "+ answer);
			break;
		
			
		}
	}
	
	static int add(int a, int b)
	{
		return a+b;
	}
	static int subtract(int a, int b)
	{
		return a-b;
	}
	static int multiplication(int a,int b)
	{
		return a*b;
	}
	static int divide(int a,int b)
	{
		if(a>b)
		{
			return a/b;
		}
		else
		{
			return b/a;
		}
	}
	static int remainder(int a,int b)
	{
		if(a>b)
		{
			return a%b;
			
		}
		else
		{
			return b%a;
		}
	}

}

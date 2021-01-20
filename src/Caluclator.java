import java.util.Scanner;

public class Caluclator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Double num1;
		Double num2;
		Double answer;
		char op;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		num1=sc.nextDouble();
		num2=sc.nextDouble();
		System.out.println("Enter an operator(+,-,*,/)");
		op=sc.next().charAt(0);
		switch(op) {
		
		case '+':answer=num1+num2;
		break;
		case '-':answer=num1-num2;
		break;
		case '*':answer=num1*num2;
		break;
		case '/':answer=num1/num2;
		break;
		default:System.out.printf("Enter correct operator");
		return;
		
		}
		System.out.println("The result is given as follows:\n");
		System.out.println(num1+" "+op+ " " +num2+ " = " +answer);
		
		

	}

}

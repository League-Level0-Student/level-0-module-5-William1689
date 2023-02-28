package _01_algorithms._2_fibonacci;

public class Fibonacci {
	public static void main(String[] args) {
		int repeat = 0;
		int num1 = 0;
		int num2 = 1;
		int sum = 1;
		System.out.println(num1);
		System.out.println(num2);
		while (repeat < 90) {
			System.out.println(sum);
			num1=num2;
			num2=sum;
			sum = num1+num2;
			repeat+=1;
		}

	}
}
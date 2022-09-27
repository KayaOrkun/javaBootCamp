package javaBootCamp_Classes;

public class Main {

	public static void main(String[] args) {
		CustomerMenager customerMenager = new CustomerMenager();
		customerMenager.add();
		customerMenager.remove();
		customerMenager.update();  
		//value 
		int number1 = 10;
		int number2 = 20;
		number1 = number2;
		System.out.println(number1);
		
		
		int[] numbers1 = new int[] {1,2,3};
		int[] numbers2 = new int[] {4,5,6};
		numbers2 = numbers1;
		numbers1[0] = 10;
		System.out.println(numbers2[0]);
		
	} 

}

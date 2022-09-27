package javaBootCamp_Methods2;

public class Main {

	public static void main(String[] args) {
		String message = "Bugün hava çok güzel.";
		String newMessage = from();
		System.out.println(newMessage);
		int number = gather(5, 7);
		System.out.println(number);
		int generalGather = gather2(10, 10, 10, 10, 10);
		System.out.println(generalGather);

	}

	public static void add() {
		System.out.println("Eklendi");
	}

	public static void delete() {
		System.out.println("Silindi");
	}

	public static void update() {
		System.out.println("Güncellendi");
	}

	public static int gather(int number1, int number2) {
		return number1 + number2;
	}

	// arguments study
	public static int gather2(int... numbers) {
		int generalGather = 0;
		for (int number : numbers) {
			generalGather += number;
		}
		return generalGather;
	}

	public static String from() {
		return "İstanbul";
	}

}


public class PracticalWork2 {

	public static void main(String[] args) {
		int x = 51;
		boolean answer = doesItDivides(x);
		System.out.println("The number " + x + " divides with number 10 without the reminder: " + answer + ".");

	}

	static boolean doesItDivides(int x) {
		if (x % 10 == 0) {
			return true;
		} else {
			return false;
		}
	}

}

//Izveidot metodi, kam padod skaitli. Atgriež true, ja skaitlis dalās ar 10 bez atlikuma.
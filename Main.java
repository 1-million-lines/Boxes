import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> box1 = new ArrayList<>();;
		List<Integer> box2 = new ArrayList<>();;
		int sum1 = 0, sum2 = 0;

		for (String token: scanner.nextLine().split(" ")) {
			int number = Integer.parseInt(token);
			box1.add(number);
			sum1 += number;
		}

		for (String token: scanner.nextLine().split(" ")) {
			int number = Integer.parseInt(token);
			box2.add(number);
			sum2 += number;
		}

		if (sum1 == sum2) {
			Collections.sort(box1);
			Collections.sort(box2);
			boolean isIncomparable = false;
			for (int i = 0; i < box1.size(); i++) {
				if (box1.get(i) != box2.get(i)) {
					isIncomparable = true;
					break;
				}
			}
			if (isIncomparable) System.out.println("Boxes are incomparable.");
			else System.out.print("Boxes are equal. ");

		} else if (sum1 > sum2) {

			System.out.println("The first box is larger than the second one.");
		} else {

			System.out.println("The first box is smaller than the second one.");
		}
		scanner.close();
	}
}

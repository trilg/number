import java.util.Scanner;


public class Persha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N=");
		int n = sc.nextInt();

		if (n <= 100) {
			System.out.println("Ê³ëüê³ñòü öèôð= " + String.valueOf(n).length());
		}

		else
			System.out.println("N á³ëüøå â³ä 100");
		int c1, c2;
		c1 = n % 10;
		n = n / 10;
		c2 = n % 10;
		n = n / 10;
		int c = c1 + c2;
		System.out.println("Ïåðøà öèôðà= "+c2);
		System.out.println("Îñòàííÿ öèôðà= "+c1);
		
		System.out.println("Ñóìà öèôð = " + c);
	}

}

import java.util.Scanner;


public class Persha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N=");
		int n = sc.nextInt();

		if (n <= 100) {
			System.out.println("ʳ������ ����= " + String.valueOf(n).length());
		}

		else
			System.out.println("N ����� �� 100");
		int c1, c2;
		c1 = n % 10;
		n = n / 10;
		c2 = n % 10;
		n = n / 10;
		int c = c1 + c2;
		System.out.println("����� �����= "+c2);
		System.out.println("������� �����= "+c1);
		
		System.out.println("���� ���� = " + c);
	}

}

package �ݺ���;

import java.util.Scanner;

public class Ex_plus {
	public static void main(String[] args) {
		int a;
		int b;
		int choice;
		Scanner sc = new Scanner(System.in);
		String c;
		
		do {
			System.out.println("ù��° ���� �Է� : ");
			a = sc.nextInt();
			
			System.out.println("�ι�° ���� �Է� : ");
			b = sc.nextInt();
			
			System.out.println("[1]���ϱ� , [2]����");
			choice = sc.nextInt();
			if(choice == 1) {
				System.out.println(a +" ���ϱ� "+ b +" �� "+ (a+b) );
			}else if(choice == 2) {
				System.out.println(a +" ���� "+ b +" �� "+ (a-b) );
			}else {
			  System.out.println("�Ҽ� ����");
			}
			System.out.println("��� �Ͻðڽ��ϱ�? y/n");
			c = sc.next();
			
		} while (!c.equals("n"));
		System.out.println("����");
		sc.close();
	}
}

package �ݺ���;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int week = 1;
		System.out.print("���� ������ : ");
		int pWeight = sc.nextInt();
		System.out.print("��ǥ ������ : ");
		int fWeight = sc.nextInt();
		
		/*
		while(true) {
			System.out.print(week++ +"���� ���� ������ : ");
			int minusWeight = sc.nextInt();
			pWeight -= minusWeight;
			if(pWeight<=fWeight) {
				System.out.println(pWeight + "kg �޼� ! �����մϴ�.");
				break;
			}
			
		}*/
		
		while(pWeight > fWeight) {
			System.out.print(week++ +"���� ���� ������ : ");
			int minusWeight = sc.nextInt();
			pWeight -= minusWeight;
		}
		System.out.println(pWeight + "kg �޼� ! �����մϴ�.");
		
		sc.close();
	}
}

package 반복문;

import java.util.Random;
import java.util.Scanner;

public class Ex_Random {

	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		System.out.println("====더하기 게임 ====");
		
		String s = "y";
		int num = random.nextInt(100)+1;
		int num2 = random.nextInt(100)+1;
		do {
			
			
			if(!s.equals("y")){
				System.out.println("다시 입력하세요 ");
			}else {
				System.out.print(num + " + " + num2 +" = ");
				int answer = sc.nextInt();
				
				if(answer == (num + num2)) {
					System.out.println("성공");
					 num = random.nextInt(100)+1;
					 num2 = random.nextInt(100)+1;
				}else {
					System.out.println("실패");
				}
		
			}
			System.out.println("계속 ㄱ?");
			s = sc.next();
		
		} while (!s.equals("n"));
		System.out.println("종료");
		
		
			sc.close();
			
		
		}
	}


package vendingmachine;
import java.util.Scanner;

public class first {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        int money, choice, change = 0; // 넣은 금액, 메뉴 선택, 잔돈
        int water = 400; // 물
        int Cola = 500; // 콜라
        int Cider = 600; // 사이다
        int Fanta = 700; //환타
        int oneThousandWon, fiveHundredWon, oneHundredWon = 0; // 천원, 오백원, 백원
        
        // 금액 입력
        System.out.println("금액을 입력하세요.");
        money = scanner.nextInt();
        
        // 메뉴 입력
        System.out.println("메뉴를 고르세요");
        System.out.print("1.물(400) 2.콜라(500원) 3.사이다(600원) 4.환타(700원)");
        choice = scanner.nextInt();
 
        // 메뉴 선택 후 잔돈 구하기, 돈이 부족한지 확인
        if (choice==1 && money>water) {
            change = money - water;
        } else if (choice==2 && money>Cola) {
            change = money - Cola;
        } else if (choice==3 && money>Cider) {
            change = money - Cider;
        } else if (choice==4 && money>Fanta) {
            change = money - Fanta;
        } else {
            change = money;
            System.out.println("돈이 부족합니다");
        }
        
        System.out.println("잔돈 : " + change + "원");
        
        oneThousandWon = change/1000;
        fiveHundredWon = change%1000/500;
        oneHundredWon = change%1000%500/100;
        System.out.print("1000원 : " + oneThousandWon + "개, " );
        System.out.print("500원 : " + fiveHundredWon + "개, ");
        System.out.println("100원 : " + oneHundredWon + "개");
        
    }
}

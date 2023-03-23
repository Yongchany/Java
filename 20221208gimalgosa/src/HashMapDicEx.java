import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx {
	public static void main(String[] args) {
		HashMap<String, String> dic =
				new HashMap<String, String>();
		
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		//메뉴
		while(true)
		{
		int menu;
		System.out.println("1.재생 2.정지 3.단어찾기 4.종료");
		Scanner sc = new Scanner(System.in);
		menu = sc.nextInt();
		
		if(menu == 4)
		{
			System.out.println("종료되었습니다.");
			
		}
		switch (menu)
		{
			case 1:
				System.out.println("노래가 재생됩니다.");
				break;
				
			case 2:
				System.out.println("노래가 정지됩니다.");
				break;
				
			case 3:
				System.out.println("단어를 찾습니다.");
				
				//사전
				Scanner scanner = new Scanner(System.in);
				while(true) {
					System.out.print("찾고 싶은 단어는?");
					String eng = scanner.next();
					if(eng.equals("exit")) {
						System.out.println("종료합니다...");
						break;
					}
					String kor = dic.get(eng);
					if(kor == null)
						System.out.println(eng + "는 없는 단어입니다.");
					else
						System.out.println(kor);
				}
				scanner.close();
				
				break;
				
			case 4:
				System.out.println("종료");
				break;
				
			default:
				System.out.println("입력오류");
				break;
		}
		
		

	}
}
}
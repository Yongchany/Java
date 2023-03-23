
public class Menu {
    void MainMenu() {
        System.out.println("======== 슈팅 게임 ========");
        System.out.println("::  [1] 게임 시작    ");
        System.out.println("::  [2] 게임 종료    ");
        System.out.println("=========================");
        System.out.print(" 숫자[1-2]를 입력하세요.  >>> ");
    }

    void BattleMenu() {
        System.out.println("========== 전투 메뉴 ===========");
        System.out.println("::  [1]딱총      [2]권총    "); 
        System.out.println("::  [3]라이플    [4]대포   ");
        System.out.println("::  [5]플레이어 교체         ");            
        System.out.println("==============================");
        System.out.print("숫자[1-5]를 입력하세요.  >>> ");
    }

    void EnemyKillText() {
        System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
        System.out.println("★★  적 처치 !    ★★");
        System.out.println("☆★★★★★★★★★★★★★★★★★★★★★★★★★★★");
        System.out.println("메인 메뉴로 돌아갑니다.");
    }
}

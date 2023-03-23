import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

    public static void main(String args[]) 
    {
        Menu menu = new Menu();
        Player p1 = new Player();
        Enemy enemy = new Enemy();   
        Scanner sc = new Scanner(System.in);
        int EnemyKillCnt = 0;
        int inputNum = 0;
        int ammo = 50;

            try {
                    while(true) 
                    {
                            System.out.println("현재 적 처치 횟수 : \"" + EnemyKillCnt + "\" 회 입니다.");
                            menu.MainMenu();
                            inputNum = sc.nextInt();
                            sc.nextLine();
                            if(inputNum == 1) 
                            {
                                System.out.println("게임 시작!");
                                System.out.println(p1.showName()+" : 연결되었습니다.");
                                
                                System.out.println("적의 현재 체력이 \"" +enemy.enemyHP+ "\" 입니다." );
                                System.out.println("현재 남은 탄약은 \"" + ammo + "\" 입니다.");

                                    while(true)
                                    {
                                        if(enemy.enemyHP >= 0)
                                        {
                                            int selNum = 0;   
                                            menu.BattleMenu();
                                            selNum = sc.nextInt();
                                            sc.nextLine();
                                            switch(selNum)
                                            {
                                                case 1:
                                                    System.out.println("[딱총] 발사!");
                                                    ammo -= p1.Attack();
                                                    enemy.enemyHP -= p1.Attack();
                                                    System.out.println("적의 현재 체력이 \"" +enemy.enemyHP+ "\" 입니다." );
                                                    System.out.println("현재 남은 탄약은 \"" + ammo + "\" 입니다.");
                                                    break;
                                                case 2:
                                                    p1.myGun = new Pistol();
                                                    System.out.println("[권총] 발사!");
                                                    ammo -= 1;
                                                    enemy.enemyHP -= p1.Attack();
                                                    System.out.println("적의 현재 체력이 \"" +enemy.enemyHP+ "\" 입니다." );
                                                    System.out.println("현재 남은 탄약은 \"" + ammo + "\" 입니다.");
                                                    break;
                                                case 3:
                                                    p1.myGun = new Rifle();
                                                    System.out.println("[라이플] 발사!");
                                                    ammo -= 1;
                                                    enemy.enemyHP -= p1.Attack();
                                                    System.out.println("적의 현재 체력이 \"" +enemy.enemyHP+ "\" 입니다." );
                                                    System.out.println("현재 남은 탄약은 \"" + ammo + "\" 입니다.");
                                                    break;
                                                case 4:
                                                    p1.myGun = new Cannon();
                                                    System.out.println("[대포] 발사!");
                                                    ammo -= p1.Attack();
                                                    enemy.enemyHP -= p1.Attack();
                                                    System.out.println("적의 현재 체력이 \"" +enemy.enemyHP+ "\" 입니다." );
                                                    System.out.println("현재 남은 탄약은 \"" + ammo + "\" 입니다.");
                                                    break;
                                                case 5:                                                    
                                                    if(p1 instanceof Player2){
                                                        p1 = new Player();
                                                        System.out.println(p1.showName() + ": 로 바뀌었습니다.");
                                                        break;
                                                    }
                                                    if(p1 instanceof Player){
                                                        p1 = new Player2();
                                                        System.out.println(p1.showName() + ": 로 바뀌었습니다.");
                                                        break;
                                                    }
                                                default:
                                                    System.out.println("숫자 [1-5] 만 입력하세요.");
                                                    sc.nextLine();
                                                    break;
                                            }
                                        }

                                        else if (enemy.enemyHP <= 0) {
                                            EnemyKillCnt += 1; // 적 처치 회수 1 증가
                                            menu.EnemyKillText();
                                            enemy.enemyHP = 200;
                                            break;
                                        }
                                    }      
                            }

                            else if (inputNum == 2)
                                System.out.println("게임을 종료합니다.");
                            
                            else
                                System.out.println("숫자 [1 - 2] 만 입력하세요.");
                                    
                        }
                    } catch(InputMismatchException e) {
                            System.out.println("숫자만 입력하세요.");
                            System.out.println("프로그램을 종료합니다.");
                        }
    }
}

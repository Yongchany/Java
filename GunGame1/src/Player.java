
public class Player {
    Weapon myGun;
    public String pName = "플레이어1";
    public String showName(){
        return pName;
    }
    
    public Player() {
        myGun = new Weapon();
    }

    int Attack() {
        return myGun.Shoot();
    }
}

class Player2 extends Player {
    public Player2(){
        super.pName = "플레이어2";
    }
}

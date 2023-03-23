
public class Weapon {
    protected int Shoot() {
        return 1;
    }
}

class Pistol extends Weapon {
    @Override
    protected int Shoot() {
        return 2;
    }
}

class Rifle extends Weapon {
    @Override
    protected int Shoot() {
        return 5;
    }
}

class Cannon extends Weapon {
    @Override
    protected int Shoot() {
        return 20;
    }
}
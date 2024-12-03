public class Gun {
    private int bullets;
    private String check;

    public Gun(int bullets, String check) {
        if (check.isEmpty()){
            this.bullets = 5;
        }
        else {
            this.bullets = Integer.parseInt(check);
        }
    }

    public void shoot() {
        if (bullets > 0) {
            System.out.println("Бах!");
            bullets--;
        } else {
            System.out.println("Клац!");
        }
    }

}


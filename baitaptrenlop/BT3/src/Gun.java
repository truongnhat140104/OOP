public class Gun {
    private String nameGun;
    private int caliber;
    private int round;
    public Gun(String name,int  ca, int round){
        this.nameGun = name;
        this.caliber = ca;
        this.round = round;
    }

    public int getRound() {
        return round;
    }

    public int getCaliber() {
        return caliber;
    }

    public String getNameGun() {
        return nameGun;
    }

    public void FireControlSystem(){
        System.out.println("He thong hoat dong tot");
    }
}

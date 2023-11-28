public class GunFirst {
    private int APDS;
    private int caliber;
    private String name;
    private static int round_Loader=20;

    public int getAPDS() {
        return APDS;
    }

    public int getCaliber() {
        return caliber;
    }

    public String getName() {
        return name;
    }
    public boolean RL(int round){
        if (round == round_Loader) return true;
        return false;
    }
    public void FireControlSystem(){
        System.out.println("He thong hoat dong tot");
    }
}

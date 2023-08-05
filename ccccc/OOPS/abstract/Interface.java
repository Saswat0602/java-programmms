
interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    int x = 50;
    void blowHornk();
    void blowHornmhn();
}

class Avon implements Bicycle,HornBicycle{
    void blowHorn(){
        System.out.println("ppp oooo ppp");
    }
    public void applyBrake(int decrement){
        System.out.println("appply the brake");
    }
    public void speedUp(int increment)
{
    System.out.println("increseing speed");
}
public void blowHornk(){
    System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
}

public void blowHornmhn(){
    System.out.println("faded");
}

}
public class Interface {
    
    public static void main(String[] args) {
        Avon myAvon= new Avon();
        myAvon.applyBrake(1);

        System.out.println(myAvon.a);
        System.out.println(myAvon.x);
        myAvon.blowHornk();
        myAvon.blowHornmhn();

    }
}

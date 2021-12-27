import java.util.Random;
public class Dice {
    int a;

    Dice(){
       roll();
    }

    Dice(int a){
        this.a=a;
    }

    void roll (){
        Random rand = new Random();
        this.a = rand.nextInt(1,7);
    }

    void printInfo(){
        System.out.println("liczba oczek na kostce to: " + a);
    }
}

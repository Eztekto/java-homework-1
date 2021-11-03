package main.java.animals;
import java.util.Scanner;
import java.util.Random;

public class Kotik {
   private int prettiness;
    private int weight;
    private String name;
    private String meow;
    private static int full;
    private static int count;
    private String loveFood;
    public Kotik(int prettiness,int weight, String name, String meow, String loveFood){
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
        this.loveFood = loveFood;
        this.full = 23;
        this.count = 0;
    }
    public void liveAnotherDay(){
        count++;
        Random r = new Random();
        while (true) {
            if (full <= 0) {
                System.out.println(name + " прожил " + count + " мгновений");
                System.out.println(name + " проголодался, что ты ему дашь?");
                eat();

            } else {
                int num = r.nextInt(5);
                switch (num) {
                    case 0:
                        sleep();
                        break;
                    case 1:
                        play();
                        break;
                    case 2:
                        chaseMouse();
                        break;
                    case 3:
                        fight();
                        break;
                    case 4:
                        sayMeow();
                        break;
                }
            }
        }


    }
     void eat(){
         Scanner scanner = new Scanner(System.in);
         String foodName = scanner.nextLine();
         count++;
        if (foodName.equals(loveFood)) {
            eat(5, loveFood);
        }else{
            eat(1);}

    }
    void eat(int food){
        System.out.println(name + " кушает бяку");
        full += food;
        count++;

    }
    void eat(int food, String foodName){

        System.out.println(name + " кушает " + foodName);
        System.out.println("Как вкусно!");
        full += food;
        count++;

    }

    boolean sleep(){
        System.out.println(name + " спит");
        full --;
        count++;
        return true;
    }
    boolean play(){
        System.out.println(name + " играет с клубком");
        full --;
        count++;
        return true;
    }
    boolean chaseMouse(){
        System.out.println(name + " гоняет мышь");
        full --;
        count++;
        return true;
    }
    boolean fight(){
        System.out.println(name + " дерётся");
        full --;
        count++;
        return true;
    }

    boolean sayMeow(){
        System.out.println(name + " говорит: " + meow);
        full --;
        count++;
        return true;
    }

}

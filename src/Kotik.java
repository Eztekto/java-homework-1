import java.util.Random;

public class Kotik {
    int prettiness;
    int weight;
    String name;
    String meow;
    public Kotik(int prettiness,int weight, String name, String meow){
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
    }
    void liveAnotherDay(){
        Kotik kotik1 = new Kotik(9999, 6327, "Рыжий", "Мау");
        Random r = new Random();
        int num = r.nextInt(5);
        for (int i = 24; i !=0; i--) {
            switch (num) {
                case 0:
                    kotik1.sleep();
                    break;
                case 1:
                    kotik1.play();
                    break;
                case 2:
                    kotik1.chaseMouse();
                    break;
                case 3:
                    kotik1.fight();
                    break;
                case 4:
                    kotik1.sayMeow();
                    break;
            }
        }
    }

    void eat(){
        System.out.println(name + " кушает");
    }
    void sleep(){
        System.out.println(name + " спит");
    }
    void play(){
        System.out.println(name + " играет с клубком");
    }
    void chaseMouse(){
        System.out.println(name + " гоняет мышь");
    }
    void fight(){
        System.out.println(name + " дерётся");
    }

    void sayMeow(){
        System.out.println(name + " говорит: " + meow);
    }
}

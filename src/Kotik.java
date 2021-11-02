import java.util.Random;

public class Kotik {
    int prettiness;
    int weight;
    String name;
    String meow;
    static int full;
    public Kotik(int prettiness,int weight, String name, String meow){
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
        this.full = full;
    }
    static void liveAnotherDay(){
        Kotik kotik1 = new Kotik(9999, 6327, "Рыжий", "Мау");
        Random r = new Random();
        for (full = 24; full !=0; full--) {
            int num = r.nextInt(5);
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

                kotik1.eat();


                }



    }
    int eat(){
        System.out.println(name + " проголодался");
        System.out.println(name + " кушает");
        return full++;
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

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
        this.full = 24;
    }
    static void liveAnotherDay(){
        Kotik kotik1 = new Kotik(9999, 6327, "Рыжий", "Мау");
        Random r = new Random();
        while (full !=0) {
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
    int sleep(){
        System.out.println(name + " спит");
        return full--;
    }
    int play(){
        System.out.println(name + " играет с клубком");
        return full--;
    }
    int chaseMouse(){
        System.out.println(name + " гоняет мышь");
        return full--;
    }
    int fight(){
        System.out.println(name + " дерётся");
        return full--;
    }

    int sayMeow(){
        System.out.println(name + " говорит: " + meow);
        return full--;
    }

}

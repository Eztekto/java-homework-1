public class Kotik {
    int prettiness;
    int weight;
    String name;
    String meow;
    int i = 10;
    public Kotik(int prettiness,int weight, String name, String meow){
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
    }
    void liveAnotherDay(){}

    void eat(){
        System.out.println(name + " кушает");
    }
    void sleep(){
        System.out.println(name + " спит");
    }
    void play(){
        System.out.println(name + "играет с клубком");
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

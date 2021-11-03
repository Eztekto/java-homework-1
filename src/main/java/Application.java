package main.java;
import main.java.animal.Kotik;

public class Application {
    public static void main(String args[]) {
        int kotostropha = 0;
        Kotik kotik1 = new Kotik(9999, 6327, "Рыжий", "Мау", "Хлебушек");
        kotostropha++;
        Kotik kotik2 = new Kotik(9999, 5217, "Сметанка", "Ауф", "Молоко");
        kotostropha++;
        System.out.println(kotik1.getName() + " красив на: " + kotik1.getPrettiness());
        System.out.println(kotik1.getName() + " весит " + kotik1.getWeight());
        System.out.println(kotik2.getName() + " красив на: " + kotik2.getPrettiness());
        System.out.println(kotik2.getName() + " весит " + kotik2.getWeight());
        if (kotik1.getMeow() == kotik2.getMeow()){
            System.out.println("Котитики разговаривают одинаково");
        }
        else{
            System.out.println("Котики разговаривают по-разному");
        }
        kotik1.liveAnotherDay();
        kotik2.liveAnotherDay();
        System.out.println("Существует " + kotostropha + " котика");



    }
}

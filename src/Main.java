import main.java.animal.Kotik;

class Main {
    public static void main(String args[]) {
        Kotik kotik1 = new Kotik(9999, 6327, "Рыжий", "Мау", "Хлебушек");
        Kotik kotik2 = new Kotik(9999, 6327, "Сметанка", "Ауф", "Молоко");
        kotik1.liveAnotherDay();
        kotik2.liveAnotherDay();


    }
}
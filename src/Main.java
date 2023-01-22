public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Phone xiaomi = new Phone();
        Phone iPhone = new Phone();
        Phone   samsung = new Phone();
        System.out.println(xiaomi.number);
        System.out.println(xiaomi.model);
        System.out.println(xiaomi.weight);
        xiaomi.receiveCall("adam", 8789789);
        Person Nurulla = new Person();
        Person Nurtore = new Person("Nurtore", 17);

    }
}


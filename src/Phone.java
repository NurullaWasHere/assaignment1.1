public class Phone {
    long number;
    String model;
    double weight;
    public Phone(){
        this.number = Math.round(Math.random() * 100);
        this.model = "Model of phone";
        this.weight = Math.random() * 100;
    }
    public Phone(long number, String model){
        this.number = number;
        this.model = model;
    }
    public Phone(long number, String model, double weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    static void receiveCall(String name){
        System.out.println(name + " is ringing");
    }
    static void receiveCall(String name, long number)
    {
        System.out.println(name + " " + number + " is ringing");
    }
    static void sendMessage(long number[]){
        for (int i = 0; i < number.length; i++){
            System.out.println(number[i] + " ");
        }
    }
    public long getNumber(){
        return this.number;
    }
    public void setNumber(long value){
        this.number = value;
    }
}

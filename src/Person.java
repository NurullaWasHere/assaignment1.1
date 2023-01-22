public class Person {
    String fullName;
    int age;
    public Person(){
        this.fullName = null;
    }
    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }
    public void move(String direction){
        System.out.println(this.fullName + "moved to" + direction + "direction");
    }
    public void talk(String name){
        System.out.println(this.fullName +  " and " +  name + " talking");
    }
}

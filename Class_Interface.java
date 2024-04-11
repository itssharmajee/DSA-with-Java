public class Class_Interface {
    public static void main(String[] args) {
        Car toyota = new Car();
        toyota.print();
        toyota.specification("BMW", "uxv2");
        toyota.print();
    }
}
class Car{
    String model, name;
    void run(){
        System.out.println("running");
    }

    void work(){
        System.out.println("working perfectly");
    }

    void specification(String name, String model){
        this.name = name;
        this.model = model;
    }

    void print(){
        System.out.println(name);
        System.out.println(model);
    }
}
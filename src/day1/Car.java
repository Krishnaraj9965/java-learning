

public class Car {
    public static void main(String[] args) {

        Car c = new Car();
        c.gear();
        c.accelator();
        c.brake();
        c.indicator();
        System.out.println(c.name);

    }

    String name = "innova car";

    public void gear() {
        System.out.println("gear");
    }

    public void accelator() {
        System.out.println("acclertor");
    }

    public void brake() {
        System.out.println("brake");
    }
        public void indicator() {
            System.out.println("indicator");
    }
}
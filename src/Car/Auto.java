package Car;

import java.util.Scanner;

public class Auto {
    public static void main(String[] ex){
        Scanner scanner = new Scanner(System.in);
        Car car = Car.get(scanner);
        while (true) {
            System.out.println(
                    "Chose menu:" + "\n" +
                            "0. Exit\n" +
                            "1. Move\n" +
                            "2. Zapravka\n" +
                            "3. change a Wheels\n" +
                            "4. Print info of auto (brand too)\n" +
                            ": "
            );
            int choice = scanner.nextInt();
            if (choice == 0)
                break;
            if (choice < 1 || choice > 4) {
                System.out.println("Corerect number, Enter a new: ");
                continue;
            }
            switch (choice) {
                case 1:
                    car.move();
                    break;
                case 2:
                    System.out.println("Enter count of fuel: ");
                    double fuel = scanner.nextDouble();
                    car.add_fuel(fuel);
                    break;
                case 3:
                    car.change_wheel(scanner);
                    break;
                case 4:
                    System.out.println(car.toString());
                    break;
            }
        }
    }
}
class Engine{
    private int number;
    private double power;

    public Engine(int number, double power){
        this.number = number;
        this.power = power;
    }

    public String toString() {
        String string = "engine: " + number + ", power:" + power;
        return string;
    }

    public static Engine get(Scanner scanner) {
        Engine object = new Engine(0, 0);
        System.out.print("Enter a number of Engine: ");
        object.number = scanner.nextInt();
        System.out.print("Enter power of Engine: ");
        object.power = scanner.nextDouble();
        return object;
    }
}
class Wheel{
    public enum Type {Winter, Summer};

    private double diametr;
    private String brand;
    private Type type;

    public  Wheel(String brand, double diametr, Type type){
        this.brand = brand;
        this.diametr = diametr;
        this.type = type;
    }

    public String toString() {
        String string = "";

        string += brand + "(" + diametr + "): ";
        if (type == Type.Winter)
            string += "Winter";
        else
            string += "Summer";

        return string;
    }

    public static Wheel get(Scanner scanner) {
        Wheel object = new Wheel("", 0, Type.Winter);

        System.out.print("Enter Brand: ");
        object.brand = scanner.next();

        System.out.print("Enter Diametr: ");
        object.diametr = scanner.nextDouble();

        System.out.print("(1) - Winter, (2) - Summer: ");
        while (true) {
            int value = scanner.nextInt();
            if (value == 1) {
                object.type = Type.Winter;
                break;
            }
            if (value == 2) {
                object.type = Type.Summer;
                break;
            }
            System.out.print("Corerect number, Enter a new: ");
        }
        return object;
    }

    public double get_diameter() {
        return diametr;
    }
}
class Car {
    private Wheel wheels[];
    private Engine engine;
    private String brand;
    private double consumption;
    private double fuel_level;

    public Car(String brand, double consumption, Engine engine_, Wheel wheels[], double fuel_level) {
        this.brand = brand;
        this.consumption = consumption;
        this.engine = engine;
        this.wheels = wheels;
        this.fuel_level = fuel_level;
    }
    public String toString() {
        String string = "";
        string += brand + engine.toString() + ";" + consumption + "L/100km { " + fuel_level + "}; [";
        for (int i = 0; i < 4; ++i) {
            string += wheels[i].toString() + " ";
        }
        return string + "]";
    }
    public static Car get(Scanner scanner) {
        Car object = new Car("", 0, new Engine(0, 0), new Wheel[4], 0);
        System.out.print("Enter brand of auto: ");
        object.brand = scanner.next();
        System.out.print("Enter consumption of 100km: ");
        object.consumption = scanner.nextDouble();
        System.out.print("Enter level of fuel :");
        object.fuel_level = scanner.nextDouble();
        System.out.println("Enter wheels:");
        for (int i = 0; i < 4; ++i) {
            System.out.println("Wheels number " + i + " ");
            object.wheels[i] = Wheel.get(scanner);
        }
        object.engine = Engine.get(scanner);
        return object;
    }
    public void move() {
        if (fuel_level <= 0) {
            System.out.println("No fuel for driving!!!");
            return;
        }
        for (int i = 1; i < 4; ++i) {
            if (wheels[i].get_diameter() != wheels[i - 1].get_diameter()) {
                System.out.println("Wheels are of different radius!!!");
                return;
            }
        }
        double distance = fuel_level / consumption;
        System.out.println("Auto drive " + distance * 100 + "km!!!");
        fuel_level = 0;
    }
    public void add_fuel(double value) {
        fuel_level += value;
    }
    public void change_wheel(Scanner scanner) {
        System.out.println("Enter number of wheels [0-3]:");
        int number;
        while (true) {
            number = scanner.nextInt();
            if (number >= 0 && number <= 3)
                break;
            System.out.println("Corerect number of wheels, Enter a new: ");
        }
        wheels[number] = Wheel.get(scanner);
    }
}
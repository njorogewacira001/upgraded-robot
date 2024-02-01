// Parent class
class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof!");
    }
}

// Child class inheriting from Animal
class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow!");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}


// Interface
interface Greetable {
    void greet();
}

// Class implementing the interface
class Person implements Greetable {
    public void greet() {
        System.out.println("Greetings!");
    }
}

public class GreetingTest {
    public static void main(String[] args) {
        Greetable greeter = new Person();
        greeter.greet();
    }
}

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static int divide(int a, int b) {
        return a / b;
    }
}


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionsExample {
    public static void main(String[] args) {
        // List
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("Names: " + names);

        // Map
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 22);

        System.out.println("Ages: " + ages);
    }
}


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOExample {
    public static void main(String[] args) {
        // Writing to a file
        try (FileWriter writer = new FileWriter("example.txt")) {
            writer.write("This is an example.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from a file
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line = reader.readLine();
            System.out.println("File Content: " + line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


public class MultithreadingExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));

        thread1.start();
        thread2.start();
    }
}

class MyRunnable implements Runnable {
    private final String name;

    MyRunnable(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + ": Count " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}







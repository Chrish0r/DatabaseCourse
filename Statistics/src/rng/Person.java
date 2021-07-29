package rng;

import java.util.Random;

public class Person {
    private int age;
    private String name;
    private int randomNumber;


    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }


    // logic
    public int createRandomNumber() {
        Random rng =  new Random();
        int randomNumber = rng.nextInt(1000);

        return randomNumber;
    }

    // getters and setters

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRandomNumber(int ran) {
        this.randomNumber = ran;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRandomNumber() {
        return randomNumber;
    }
}

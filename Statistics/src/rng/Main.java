package rng;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        Person p1 = new Person(35, "Chris");
        int ran = p1.createRandomNumber();
        p1.setRandomNumber(ran);

        Person p2 = new Person(25, "Chrisssa");
        int ran2 = p2.createRandomNumber();
        p2.setRandomNumber(ran2);

        Person p3 = new Person(24, "Ava");
        int ran3 = p3.createRandomNumber();
        p3.setRandomNumber(ran3);

        Person p4 = new Person(15, "David");
        int ran4 = p4.createRandomNumber();
        p4.setRandomNumber(ran4);

        Person p5 = new Person(28, "Mike");
        int ran5 = p5.createRandomNumber();
        p5.setRandomNumber(ran5);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        for (Person p : list) {
            System.out.println(p.getName() + "   " + p.getAge() + "   " + p.getRandomNumber());
        }


        new Main().sortList(list, list.size());
        System.out.println(System.lineSeparator() + "Choose 3 of 5:" + System.lineSeparator());
        for(int i = 0; i < 3; i++) {
            System.out.println(list.get(i).getName() + "   " + list.get(i).getAge());
        }
    }

    private static void sortList(List<Person> list, int n) {
        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-i-1;  j++) {
                if(list.get(j).getRandomNumber() > list.get(j+1).getRandomNumber()) {
                    Person temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
    }

}

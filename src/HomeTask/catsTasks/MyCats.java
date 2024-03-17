package HomeTask.catsTasks;

import java.util.ArrayList;
import java.util.List;

public class MyCats {

    public static void main(String[] args) {
        //Calling the cat class by list to make new cats.
    List<Cat> catList = new ArrayList<>();
    //Makes new cats.
    Cat cat1 = new Cat();
    cat1.setName("jaffar");
    cat1.setColor("black");
    cat1.setAge(31);

        Cat cat2 = new Cat();
        cat2.setName("mitsuki");
        cat2.setColor("white");
        cat2.setAge(2);

        Cat cat3 = new Cat();
        cat3.setName("puma");
        cat3.setColor("brown");
        cat3.setAge(3);

        Cat cat4 = new Cat();
        cat4.setName("shosho");
        cat4.setColor("mixed green and white color");
        cat4.setAge(15);

        Cat cat5 = new Cat();
        cat5.setName("angry ofir");
        cat5.setColor("red");
        cat5.setAge(30);

        //adding cats to the list.
        catList.add(cat1);
        catList.add(cat2);
        catList.add(cat3);
        catList.add(cat4);
        catList.add(cat5);

        printCatList(catList);
    }
    //PrintCatList function to print the list of cats
    public static void printCatList(List<Cat> cats){
        for (Cat cat : cats){
            System.out.println("catList");
            System.out.println("Cat name: " + cat.getName());
            System.out.println("Cat color: " + cat.getColor());
            System.out.println("Cat age: " + cat.getAge());
        }
    }
}

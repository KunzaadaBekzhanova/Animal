package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Animal turtle = new Turtle();
        Animal eage = new Eage();
        Animal shark = new Shark();


        Animal[] animals = {new Turtle(), new Eage(), new Shark()};



        for (Animal a : animals) {
            if (a instanceof Turtle) (
                    (Turtle) a).swim();

            if (a instanceof Eage) (
                    (Eage) a).fly();
            if (a instanceof Shark) (
                    (Shark) a).attack();


        }
        Animal[] rep = {turtle};
        Animal[] fish = {eage};
        Animal[] bird = {shark};

        System.out.println(Arrays.toString(rep));
        System.out.println(Arrays.toString(fish));
        System.out.println(Arrays.toString(bird));

    }
}


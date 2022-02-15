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
            if(a.getClass().getName().equals("com.company.Turtle")){
                ((Turtle) a).swim();
            }
            if (a instanceof Eage) (
                    (Eage) a).fly();
            if(a.getClass().getName().equals("com.company.Eage")){
                ((Eage) a).fly();
            }
            if (a instanceof Shark) (
                    (Shark) a).attack();
            if(a.getClass().getName().equals("com.company.Shark")){
                ((Shark) a).attack();
            }


        }
        Shark[] rep = {(Shark) animals[0]};
        Animal[] fish = {(Turtle) animals[1]};
        Animal[] bird = {(Eage) animals[2]};

    }
}


package ru.stqa.pft.adressbook.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {

        System.out.println("H");
        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(2,4);
        System.out.println("Площадь прямоугольника = " + r.area());
    }

}
package ru.mirea.Practice01;

import java.util.Scanner;
public class Tester {
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number (1-3): ");
        int number = num.nextInt();

        switch (number)
        {
            case 1:
                Dog dog = new Dog(5, 27, "black");
                System.out.println(dog);
                dog.barking();
                break;

            case 2:
                Ball ball = new Ball(7, "yellow");
                System.out.println(ball);
                break;

            case 3:
                Book book = new Book(631, "scientific");
                System.out.println(book);
                break;
        }

    }
}

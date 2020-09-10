package ru.mirea.Practice01;

public class Dog {
    private int age;
    private int weight;
    private String color;

    public Dog(int age, int weight, String color)
    {
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void barking()
    {
        System.out.println("bark");
    }

    public String toString()
    {
        return "Age: "+age+";  "+"weight: "+weight+";  "+"color: "+color;
    }
}

package ru.mirea.Practice01;

public class Ball {
    private int radius;
    private int diameter;
    private String color;

    public Ball(int radius, String color)
    {
        this.radius = radius;
        diameter = radius*2;
        this.color = color;
    }

    public String toString()
    {
        return "Radius: "+radius+";  "+"diameter: "+diameter+";  "+"color: "+color;
    }
}

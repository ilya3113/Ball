package ru.mirea.kapatsin.Lab1.Ball;
import java.lang.*;
public class Ball {
    public String colour;
    public int diameter;
    public String toString(){
        return this.colour+", weight "+this.diameter;
    }
    public Ball(String x, int y){
        colour=x;
        diameter=y;
        if (y >= 23 & y <= 24)
            System.out.println(this.colour+" ball "+"This basketball ball");
        if (y >= 21 & y <= 22)
            System.out.println(this.colour+" ball "+"This football ball");
        if (y >= 19 & y <= 20)
            System.out.println(this.colour + " ball " + "This volleyball ball");
        if (y < 19 || y > 24)
            System.out.println(this.colour+" ball "+"This boll not football, basketball, or volleyball");
    }
    public Ball(String x){
        colour=x;
        System.out.println("This ball "+this.colour);
    }
}

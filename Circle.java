///usr/bin/env jbang "$0" "$@" ; exit $?


import static java.lang.System.*;

public class Circle {

    private double x;
    private double y;
    private double rayon;

    public Circle(double x, double y, double rayon){
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }

    public static void main(String... args) {
        out.println("Hello World");
    }

    public boolean isCollision(Circle c1, Circle c2){
        if(c1.rayon+c2.rayon >= distanceBetween(c1, c2)){
            return true;
        } else {
            return false;
        }
    }

    public double distanceBetween(Circle c1, Circle c2){
        return Math.sqrt((c2.x-c1.x)*(c2.x-c1.x) + (c2.y-c1.y)*(c2.y-c1.y));
    }
}

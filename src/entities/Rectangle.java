package entities;

public class Rectangle {
    public double lar;
    public double alt;

    public double areaRectangle(){
        return lar * alt;
    }
    public double perimeterRectangle(){
        return 2 * (lar + alt);
    }
    public double diagonalRectangle(){
        return Math.sqrt(Math.pow(lar, 2) + Math.pow(alt, 2));
    }
}


package entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public double areaTriangle() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public static void maiorTriangulo(double area1, double area2){
        System.out.printf("Area do triângulo X : %.4f%n", area1);
        System.out.printf("Area do triângulo Y : %.4f%n", area2);
        if ( area1 == area2) {
            System.out.println("Os triângulos X e Y tem a mesma área.");
        } else if (area2 > area1){
            System.out.println("O triângulo com a maior área: Y");
        } else {
            System.out.println("O triângulo com a maior área: X");
        }
    }
}

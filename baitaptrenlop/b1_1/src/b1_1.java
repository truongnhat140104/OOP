class Circle{
    private double radius;
    private String color;
    public Circle(){

    }
    public Circle(double r){
        this.radius=r;
    }

    public double getRadius() {
        return this.radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
}

public class b1_1 {
    public static void main(String[] args) { 
        Circle d = new Circle(5.0);
        System.out.print(d.getArea());
//        System.out.println("Hello world!");
    }

}
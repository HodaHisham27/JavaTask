package shapes;

public class Shapes {

    public static void main(String[] args) {
        Cylinder c = new Cylinder(10,2);
        System.out.println("The volume of the cylinder is: "+c.getVolume());
        System.out.println(c.toString());
    }
    
}
class Circle {
    double radius =10;
    String color= "red";
    public Circle()
    {
        
    }
    Circle (double r) {
        radius=r;
    }
    Circle (double r , String c) {
        radius=r;
        color=c;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double getArea()
    {
        return (3.14*radius*radius);
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + '}';
    }
    
}

class Cylinder extends Circle {
    private double hight=1.0;
    public Cylinder(double h,double r) {
        super(r);
        hight=h;
    }
    public Cylinder(double h, double r, String c) {
        super(r, c);
        hight=h;
    }
    public Cylinder(double h) {
        hight=h;
    } 
    public Cylinder() {
        
    } 
    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }
    public double getVolume()
    {
        return (hight*getArea());
    }

    @Override
    public String toString() {
        return "Cylinder{" + "hight=" + hight +", radius=" + radius + ", color=" + color +  '}';
    }
    
}
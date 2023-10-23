// Shape.java
public abstract class Shape {
    public abstract double surface_area();
    public abstract double volume();
}

// Sphere.java
   class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double surface_area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere:\nSurface Area: " + surface_area() + "\nVolume: " + volume();
    }
}

// Cylinder.java
    class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surface_area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        return "Cylinder:\nSurface Area: " + surface_area() + "\nVolume: " + volume();
    }
}

// Cone.java
    class Cone extends Shape {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surface_area() {
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    public double volume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        return "Cone:\nSurface Area: " + surface_area() + "\nVolume: " + volume();
    }
}

// ShapeArray.java
class ShapeArray {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(5.0);
        Cylinder cylinder = new Cylinder(3.0, 7.0);
        Cone cone = new Cone(4.0, 6.0);

        Shape[] shapeArray = { sphere, cylinder, cone };

        for (Shape shape : shapeArray) {
            System.out.println(shape.toString() + "\n");
        }
    }
}

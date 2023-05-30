/*Create an abstract class Shape and the derived classes Square, Triangle and Circle. Write a
java program to display area of different shapes.*/


abstract class Shape 
{
    abstract double getArea();
}


class Square extends Shape 
{
    double side;    
    Square(double s) 
    {
        side = s;
    }    
    double getArea() 
    {
        return side * side;
    }
}


class Triangle extends Shape
{
	double base, height;
	Triangle(double b, double h)
	{
		base = b;
		height = h;
	}
	double getArea()
	{
		return 0.5*base*height;
	}
}


class Circle extends Shape
{
	double radii;
	Circle(double r)
	{
		radii = r;
	}
	double getArea()
	{
		return radii*radii*Math.PI;
	}
}


public class Q6
{

	public static void main(String[] args) 
	{
        
	    Shape s1 = new Square(5);
	    Shape s2 = new Triangle(4, 3);
	    Shape s3 = new Circle(2.5);        
	    System.out.println("Area of the first shape is : " + s1.getArea());
	    System.out.println("Area of the second shape is : " + s2.getArea());
	    System.out.println("Area of the third shape is : " + s3.getArea());

	}

}

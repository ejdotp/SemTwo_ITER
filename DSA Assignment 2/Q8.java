/*Define an interface DetailInfo to declare methods display ( ) & count ( ). Another class Person
contains a static data member maxcount, instance member name & method display ( ) to display
name of a person, count the no. of characters present in the name of the person.*/

interface Detailinfo
{
	void display();
	int count();
}

class Persona implements Detailinfo
{
	static int maxcount = 15;
    String name;
    public Persona(String name)
    {
        this.name = name;
    }
    public void display() 
    {
        System.out.println("Name: " + name);
    }
    public int count() 
    {
        return name.length();
    }
}

public class Q8 {

	public static void main(String[] args) {
		Persona p = new Persona("Jagadeeswar");
        p.display();
        int count=p.count();
        System.out.println("Name length: " + count);

	}

}

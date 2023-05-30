package Q10.sports.Student;
import java.util.Scanner;
public class test extends student {
    public int mark1;
    public int mark2;

    public test(String name, String roll)
    {
        super(name, roll);
        this.mark1 = 0;
        this.mark2 = 0;
    }

    public void input()
    {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mark 1: ");
        this.mark1 = sc.nextInt();
        System.out.print("Enter mark 2: ");
        this.mark2 = sc.nextInt();
    }

    public void output()
    {
        super.output();
        System.out.println("Mark 1: " + this.mark1);
        System.out.println("Mark 2: " + this.mark2);
    }
}

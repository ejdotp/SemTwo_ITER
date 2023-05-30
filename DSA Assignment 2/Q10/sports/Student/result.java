package Q10.sports.Student;
import Q10.sports.*;
public class result extends test implements sports {
    public result(String name, String roll) {
        super(name, roll);
    }

    public void output() {
        super.output();
        int total = this.mark1 + this.mark2 + this.score1 + this.score2;
        System.out.println("Grand total: " + total);
    }
    public static void main(String[] args) {     
        result r = new result("I", "007");
        r.input();      
        r.output();
    }
}

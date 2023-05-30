/*Write a Java program to declare a Class named as Student which contains roll number,
name and course as instance variables and input_Student () and display_Student () as
instance methods. A derived class Exam is created from the class Student. The derived
class contains mark1, mark2, mark3 as instance variables representing the marks of three
subjects and input_Marks () and display_Result () as instance methods. Create an array of
objects of the Exam class and display the result of 5 students.*/

class Student1
{
    int rollNumber;
    String name;
    String course;    
    void input_Student(int r,String n,String c) 
    {
        rollNumber=r;
        name=n;
        course=c;
    }
    
    void display_Student() {
        System.out.print(rollNumber+"\t"+name+"\t"+course+"\t");
    }
}
class Exam extends Student1 
{
    int mark1;
    int mark2;
    int mark3;
    
    void input_Marks(int m1,int m2,int m3) 
    {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }
    
    void display_Result() 
    {
     System.out.println(mark1+"\t"+mark2+"\t"+mark3);
    }
}

public class Q9 
{
    public static void main(String[] args) 
    {
        Exam[] exams = new Exam[5];
        
        for (int i = 0; i < exams.length; i++) 
            exams[i] = new Exam();
            System.out.println("Rollno\tName\tBranch\tMark1\tMark2\tMark3");
            exams[0].input_Student(30,"Jagd","Btech");
            exams[0].input_Marks(70,80,50);
            exams[1].input_Student(31,"Sidlu","Btech");
            exams[1].input_Marks(50,43,55);
            exams[2].input_Student(32,"Preeti","Btech");
            exams[2].input_Marks(78,62,58);
            exams[3].input_Student(33,"Subham","Btech");
            exams[3].input_Marks(90,69,59);
            exams[4].input_Student(34,"Swager","Btech");
            exams[4].input_Marks(35,45,55);     
        for (int i = 0; i < exams.length; i++) 
        {
            
            exams[i].display_Student();
            exams[i].display_Result();
        }
    }
}

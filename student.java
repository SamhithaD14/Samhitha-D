package CIE;
import java.util.*;

public class Student
{
    Scanner scan = new Scanner(System.in);
    public String usn, name;
    public int sem;
    public void accept()
    {
        System.out.println("Enter USN : ");
        usn = scan.nextLine();
        System.out.println("Enter Name : ");
        name = scan.nextLine();
        System.out.println("Enter sem : ");
        sem = scan.nextInt();
    }

    public void display()
    {
        System.out.println("Name : "+ name);
        System.out.println("USN : "+ usn);
        System.out.println("Sem : "+ sem);
    }
}
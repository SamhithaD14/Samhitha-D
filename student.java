import java.util.*;
class Main
{
    public static void main(String args[])
    {
        student s1=new student();
    
        s1.accept();
        s1.display();
        s1.calculate();
    }
    
}
class student
{
  String usn;
  String name;
  int credits[] = new int[5];
  int marks[] = new int[5];
  int i;
  Scanner sc = new Scanner (System.in);
  void accept (){
    System.out.println ("Enter your usn");
    usn = sc.nextLine ();
    System.out.println ("Enter your name");
    name = sc.nextLine ();
    System.out.println ("Enter credits of five subjects");
    for (i = 0; i < 5; i++)
      {
	credits[i] = sc.nextInt ();
      }
    System.out.println ("Enter marks of five subjects");
    for (i = 0; i < 5; i++)
      {
	marks[i] = sc.nextInt ();
      }
  }
  void display ()
  {
    System.out.println ("USN:" + usn);
    System.out.println ("Name:" + name);
    for (i = 0; i < 5; i++)
      System.out.println ("Credit in subject" + (i+1) + ":"+credits[i]);
    for (i = 0; i < 5; i++)
      System.out.println ("Marks in subject" + (i+1) + ":"+marks[i]);
  }
  void calculate ()
  {
    int total_creds = 0;
    float sgpa_final = 0;
    for(int i =0; i < 5; i++)
    {
      int grade_points;
      if(marks[i] >= 90)
        grade_points = 10;
      else if(marks[i] >= 80)
        grade_points = 9;
      else if(marks[i] >= 70)
        grade_points = 8;
      else if(marks[i] >= 60)
        grade_points = 7;
      else if(marks[i] >= 50)
        grade_points = 6;
      else if(marks[i] >= 35)
        grade_points = 5;
      else
        grade_points = 0;
    sgpa_final += grade_points*credits[i];
    total_creds += credits[i];
    }
    System.out.println("The SGPA of the student is : " + sgpa_final/total_creds);
  }
}


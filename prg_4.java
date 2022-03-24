abstract class shape
{
    int num1;
    int num2;
    void printArea(int num1,int num2)
    {
      System.out.println("Area not defined");  
    }
}
class rectangle extends shape
{
 void printArea(int num1,int num2)
 {
    int area=num1*num2; 
    System.out.println(area);
 }
}
class triangle extends shape
{
   void printArea(int num1,int num2)
 {
    double area=0.5*num1*num2; 
    System.out.println(area);
 }  
}
class circle extends shape
{
   void printArea(int num1,int num2)
 {
    double area=3.14*num1*num1; 
    System.out.println(area);
 }    
}

class Main
{
public static void main (String[] args) 
{
    rectangle r1=new rectangle();
    triangle t1=new triangle();
    circle c1=new circle();
    r1.printArea(10,20);
    t1.printArea(10,20);
    c1.printArea(10,20);
}
}

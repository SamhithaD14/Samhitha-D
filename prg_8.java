import java.util.*;
class Main{
    public static void main (String[] args) {
        Son s=new Son();{
            try{
                s.excf();
            }
            catch(FatherWrongAgeException e)
            {
                System.out.println(e);
            }
             try{
                s.excs();
            }
            catch(SonWrongAgeException e)
            {
                System.out.println(e);
            }
        }
 
    }
}
class Father
{
    int agef;
    Scanner sc=new Scanner(System.in);
    Father()
    {
    System.out.println("Enter age of father");
    agef=sc.nextInt();
    }
    void excf() throws FatherWrongAgeException
    {
        if(agef<0)
        throw new FatherWrongAgeException();
    }
}
class Son extends Father
{
    int ages;
    Scanner sc=new Scanner(System.in);
    Son()
    {
    System.out.println("Enter age of son");
    ages=sc.nextInt();
    }
    void excs() throws SonWrongAgeException
    {
        if(ages<0 || ages>super.agef)
        throw new SonWrongAgeException(ages);
    }
}
class FatherWrongAgeException extends Exception
{
    public String toString()
    {
        return("Father's age is less than 0 Exception");
    }
}
class SonWrongAgeException extends Exception
{
    int a;
    SonWrongAgeException(int age)
    {
        a=age;
    }
    public String toString()
    {
        if(a<0)
        return("Son's age is less than 0 Exception");
        else
        return("Son's age greater than father's age Exception");
    }
}

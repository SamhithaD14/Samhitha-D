public class Main
{
	public static void main(String[] args) {
	new	newThread("BMSCE",10000,2);
	new newThread("CSE",2000,10);
	}
}
class newThread implements Runnable
{
    String tname;
    long tdelay;
    int n;
    Thread t;
    newThread(String name,long delay,int x)
    {
        tname=name;
        tdelay=delay;
        n=x;
        t= new Thread(this,tname);
        t.start();
    }
        public void run()
        {
            try{
            for(int i=n;i>0;i--)
            {
                System.out.println(tname);
                Thread.sleep(tdelay);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(tname+"Interrupted");
        }
        
    }
}

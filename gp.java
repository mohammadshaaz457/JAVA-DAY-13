import java.util.*;
class pg {
    public void r()
    {
        System.out.println(" hello i am grand parant");

    }
    
}
class p1 extends pg
{
    public void r1()
    {
        System.out.println("hello i am parent...!");
    }
}
class d extends p1
{
    public void r2()
    {
        System.out.println("hello i am child...!");
    }
}
public class gp
{
    public static void main(String args[])
    {
        d f=new d();
        f.r();
        d r=new d();
        r.r1();
        d g=new d();
        g.r2();

    }
}
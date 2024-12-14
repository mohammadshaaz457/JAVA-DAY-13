import java.util.*;
class a
    {
        public void p1(){
            System.out.println("hello students");
    }
    
}
class b extends a
{
    public void r()
    {
        System.out.println("good morning teachers ");

    }
}
class c extends b
{
    public void r1()
    {
        System.out.println("hello ashraf");
    }
}

    public class multilevelinheritence
    {
    public static void main (String args[])
    {

    
    c f=new c();
    f.r();
    c h=new c();
    h.p1();
    c r=new c();
    r.r1();
    }

}
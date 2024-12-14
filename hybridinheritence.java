import java.net.spi.InetAddressResolver;
import java.util.*;
class In
{
    public void a()
    {
        System.out.println(" Aejas:i am IRONMAN");

    }
}
class JK extends In
{
    public void a1()



{
    System.out.println("ashraf:i am SPIDERMAN");
}
}
interface ad 
{
    void fd();
}
class a extends JK implements ad
{
    public void fd()
    {
        System.out.println("shaaz:i am BATMAN");
    }
}
public class hybridinheritence
{
    public static void main(String[] args) {
        a s=new a();
        s.a();
        s.a1();
        s.fd();
    }
}
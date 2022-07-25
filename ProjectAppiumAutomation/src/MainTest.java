import org.junit.Test;

public class MainTest
{
    int a = 10;

    @Test
    public void myFirstTest()
    {
        a = this.giveMeNumber(12);
        System.out.println(a);
    }

    public int giveMeNumber(int number)
    {    
    return number * 2 ;
    }
}
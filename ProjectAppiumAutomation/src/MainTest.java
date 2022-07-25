import org.junit.Test;

public class MainTest extends CoreTestCase
{   giveHelper Give = new giveHelper();
    int a = 10;

    @Test
    public void myFirstTest()
    {
        a = Give.giveMeNumber(12);
        System.out.println(a);
    }


}
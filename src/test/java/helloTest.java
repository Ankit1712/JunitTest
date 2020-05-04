import junit.framework.TestCase;

public class helloTest extends TestCase{
    hello hel=new hello();

   public void helloTestt(){
        String result = hel.concat("Hello ", "World");
        assertEquals("Hello World", result);
    }
}

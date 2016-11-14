/**
 * Created by Administrator on 2016/11/14.
 */
import junit.framework.*;
import org.junit.*;
import org.junit.Test;

public class test1 extends TestCase{
    public test1(){}
    @Before
    public void setUp() throws Exception{}
    @After
    public void tearDown() throws Exception{}
    @Test
    public void testGetMaxSubString1(){
        String test1 = "abcabcbb";
        int result = Main.getMaxSubString(test1);
        assertEquals(3,result);
    }
    public void testGetMaxSubString2(){
        String test1 = "bbbbb";
        int result = Main.getMaxSubString(test1);
        assertEquals(1,result);
    }
    public void testGetMaxSubString3(){
        String test1 = "";
        int result = Main.getMaxSubString(test1);
        assertEquals(0,result);
    }
    public void testGetMaxSubString4(){
        String test1 = "sfdgfgqwiturpjkllfgjspymjvndlfksafrkg";
        int result = Main.getMaxSubString(test1);
        assertEquals(12,result);
    }
}

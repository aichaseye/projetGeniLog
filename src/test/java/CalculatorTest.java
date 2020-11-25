
import org.junit.Test;

import org.junit.Assert;

public class CalculatorTest {
    @Test
    public void TestSum(){
        Calculator calculator = new Calculator();
        int result=calculator.sum(2,2);
        if  ( result !=4) {
            Assert.fail() ;    }
    }
    @Test
    public void TestMinus() {
        Calculator calculator = new Calculator();
       // Assert.assertEquals(0, calculator.minus(2, 2));
        int result=calculator.minus(10,2);
        if  ( result !=8) {
            Assert.fail() ;    }
    }
    @Test
    public void TestDivide() {
        Calculator calculator = new Calculator();
        //Assert.assertEquals(2, calculator.divide(6, 3));
        int result=calculator.divide(2,2);
        if  ( result !=1) {
            Assert.fail() ;    }
    }
    @Test
    public void TestMultiply(){
        Calculator calculator=new Calculator();
        int result=calculator.multiply(2,9);
        if  ( result !=18) {
            Assert.fail() ;    }
    }
    @Test
    public void TestMin(){
        Calculator calculator=new Calculator();
        int result=calculator.min(2,9);
        if  ( result !=2) {
            Assert.fail() ;    }
    }
    @Test
    public void TestMax(){
        Calculator calculator=new Calculator();
        int result=calculator.max(2,9);
        if  ( result !=9) {
            Assert.fail() ;    }
    }
    @Test
    public void testMinElement(){
        Calculator calculator=new Calculator();
        int result=calculator.minElement(new int []{7,1,8,3,5} );
        if(result!=1)
           Assert.fail();
    }
    @Test
    public void testMaxElement(){
        Calculator calculator=new Calculator();
        int result=calculator.maxElement(new int []{7,1,8,3,5} );
        if(result!=8)
            Assert.fail();
    }


}

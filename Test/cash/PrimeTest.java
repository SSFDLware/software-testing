package printPrimes;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PrimeTest {
	private PrintPrime pr;
    @Before
    public void setup(){
        pr = new PrintPrime();//����ò���ǰ�������
    }
    @Test
    public void test() {
    	pr.printPrimes(1);
    }
}

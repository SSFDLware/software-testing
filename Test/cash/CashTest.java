package cash;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CashTest {
    Cash c = null;
    int[] num = {-10,0,3,9,20,49,52,53,54};//录入测试用例
    int[] equal = {-1,1,1,-1,1,-1,1,1,-1};//录入期望结果
    @Before
    public void testBeforeClass(){
        c = new Cash();//定义好测试前所需的类
    }
    @Test
    public void testcash(){
    	for(int i = 0;i < num.length;i++) {
        int result = c.cash(num[i]);
        Assert.assertEquals(result,equal[i]);
    	}
        //输入测试用例以及期望，进行测试
    }
}

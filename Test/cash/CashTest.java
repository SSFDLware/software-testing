package cash;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CashTest {
    Cash c = null;
    int[] num = {-10,0,3,9,20,49,52,53,54};//¼���������
    int[] equal = {-1,1,1,-1,1,-1,1,1,-1};//¼���������
    @Before
    public void testBeforeClass(){
        c = new Cash();//����ò���ǰ�������
    }
    @Test
    public void testcash(){
    	for(int i = 0;i < num.length;i++) {
        int result = c.cash(num[i]);
        Assert.assertEquals(result,equal[i]);
    	}
        //������������Լ����������в���
    }
}

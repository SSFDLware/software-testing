package cash;

public class Cash {

	int[] list1 = {50,20,5,5,1,1,1};//�Ӵ�С�������еĽ�Ǯ����
    
    public int cash(int num) {
		int remain = 0;//ʣ��Ǯ��
		for(int i = 0;i <list1.length;i++) {
			remain += list1[i];
		}//����Ŀǰ�ʲ��ܶ�
		if(num > remain) {
			return -1;
		}//Ŀ����ܶ�࣬�����쳣
		else if(num < 0){
			return -1;
		}//��������Ϊ��ʱ�������쳣
		for(int i = 0;i <list1.length;i++) {
			if(num >= list1[i]) {
				num -= list1[i];
			}
		}//ѭ�����ԣ��Ӵ�С���θ���֧�����з�ʽ
		if(num == 0) {
			return 1;
		}//���ܳɹ�����Ŀ����ֵ�����Ϊ0������1
		else {
			return -1;
		}//�����ܳɹ�����Ŀ����ֵ�������Ϊ0������-1
	}
}

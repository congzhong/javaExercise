/*9.ˮ�ɻ�����ָһ��3λ��������ÿ��λ�ϵ����ֵ�3 ����֮�͵���������
�����磺1^3 + 5^3 + 3^3 = 153��,�ж��Ƿ�ˮ�ɻ�����*/
public class DaffyNum{
public static void main(String[] args){
	int num = 153,
	a = num%10,
	b = num%100/10,
	c = num/100;
	if((int)(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)) == num)
	{
		System.out.println(num+"��һ��ˮ�ɻ���");
	}
}
}
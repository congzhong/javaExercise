/*1~10֮���������ӣ��õ��ۼ�ֵ����20�ĵ�ǰ��*/
public class AddNumber{
	public static void main(String[] args){
		int sum = 0;
		int num = 0;
		for(int i=1;i<=10;i++){
			sum+=i;
			num=i;
			if(sum>=20){
				break;	
			}
		}
		System.out.println("�ۼ�ֵ����20�ĵ�ǰ����:"+num);
	}
}
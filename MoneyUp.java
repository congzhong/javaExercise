/*8.����Ͷ�ʵ�������Ϊ5%�������1000��������5000�飬��Ҫ���Ѷ����� ��*/
public class MoneyUp{
	public static void main(String[] args){
		int year = 2019;
		double rate = 0.05,
		money = 1000;
		
		while(money<=5000){
			money =money*(1+rate);
			year++;
		}
		System.out.println("��1000��������5000�飬��Ҫ���Ѷ�����:");
		System.out.println((year-2019)+"��");
		
	}
}
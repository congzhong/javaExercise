/*��ӡ1-100֮������7�ı����ĸ������ܺ�*/
public class Multiple7{
	public static void main(String[] args){
		int sum = 0;
		int count = 7;
		int totalCount =0;
		System.out.println("100����7�ı���������ͳ��:");
		while(count<=100){
			sum +=count;
			System.out.print(count+" ");
			count+=7;
			totalCount++;
		}
		System.out.println();
		System.out.println("7�ı���������ͳ��:"+totalCount+" �ܺ�:"+sum);
		
	}
}
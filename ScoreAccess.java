/*5.ѭ������ĳͬѧ��ҵ���Ե�5�ſγɼ����������ֺܷ�ƽ���֡�*/
import java.util.Scanner;
public class ScoreAccess{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum = 0,
		classTotal =1,
		Avg = 0;
		
		System.out.println("=================ѧ���ɼ�������=================");
		System.out.println("�������������:");
		String name = sc.next();
		for(double i=1;i<=5;i++){
			System.out.println("���������"+i+"�ſγɼ�:");
			double score = sc.nextDouble();
			sum+=score;
			classTotal++;
			
		}
		Avg=sum/classTotal;
		System.out.println();
		System.out.println("��ĳɼ�����:");
		System.out.println("����:"+name);
		System.out.println("�ܷ�:"+sum);
		System.out.println("���пγ�ƽ����:"+Avg);
		}
	
}
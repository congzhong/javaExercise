/*6.ѭ������10���˿͵������̳��Թ˿͵������ν��е���
����������εĹ˿ͱ���������:18�����ϵ�60%��18�����µ�40%��*/
import java.util.Scanner;
public class CustomerSurvey{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//int sum = 0,
		int youngTotal =0,
		customerTotal =0;
		double oldResult = 0,
		youngResult = 0;
		
		System.out.println("=================�̳��˿͵��������=================");
		for(double i=1;i<=10;i++){
			System.out.println("�˿�����,���������"+"����:");
			double year = sc.nextDouble();
			if(year<=18&year>0){
					youngTotal++;
				}
			//sum+=year;
			customerTotal++;
		}
		//System.out.println(customerTotal);
		//System.out.println(youngTotal);
		youngResult = (customerTotal-youngTotal)*customerTotal;
		System.out.println(youngResult);
		System.out.println();
		System.out.println("�˿�����ͳ������:");	
		System.out.println("18�����ϵ�:"+(youngResult)+"%");
		System.out.println("18�����µ�:"+(100-(youngResult))+"%");
		}
	
}
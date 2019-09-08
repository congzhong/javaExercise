/*6.循环输入10个顾客的年龄商场对顾客的年龄层次进行调查
计算各年龄层次的顾客比例（例如:18岁以上的60%，18岁以下的40%）*/
import java.util.Scanner;
public class CustomerSurvey{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//int sum = 0,
		int youngTotal =0,
		customerTotal =0;
		double oldResult = 0,
		youngResult = 0;
		
		System.out.println("=================商场顾客的年龄调查=================");
		for(double i=1;i<=10;i++){
			System.out.println("顾客您好,请输入你的"+"年龄:");
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
		System.out.println("顾客年龄统计如下:");	
		System.out.println("18岁以上的:"+(youngResult)+"%");
		System.out.println("18岁以下的:"+(100-(youngResult))+"%");
		}
	
}
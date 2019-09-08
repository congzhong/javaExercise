/*5.循环输入某同学结业考试的5门课成绩，并计算总分和平均分。*/
import java.util.Scanner;
public class ScoreAccess{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum = 0,
		classTotal =1,
		Avg = 0;
		
		System.out.println("=================学生成绩计算器=================");
		System.out.println("请输入你的姓名:");
		String name = sc.next();
		for(double i=1;i<=5;i++){
			System.out.println("请输入你第"+i+"门课成绩:");
			double score = sc.nextDouble();
			sum+=score;
			classTotal++;
			
		}
		Avg=sum/classTotal;
		System.out.println();
		System.out.println("你的成绩如下:");
		System.out.println("姓名:"+name);
		System.out.println("总分:"+sum);
		System.out.println("所有课程平均分:"+Avg);
		}
	
}
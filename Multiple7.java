/*打印1-100之间所有7的倍数的个数及总和*/
public class Multiple7{
	public static void main(String[] args){
		int sum = 0;
		int count = 7;
		int totalCount =0;
		System.out.println("100以内7的倍数的数字统计:");
		while(count<=100){
			sum +=count;
			System.out.print(count+" ");
			count+=7;
			totalCount++;
		}
		System.out.println();
		System.out.println("7的倍数的数字统计:"+totalCount+" 总和:"+sum);
		
	}
}
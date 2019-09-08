public class Calcu100{
	public static void main(String[] args){
		int count = 1,
		sum = 0;
		while(count<=100){
			sum += count;
			count++;
		}
		System.out.println("1-100之和:"+sum+"\n方法:while");
		int forSum = 0;
		for(int i=1;i<=100;i++){
			forSum+=i;
		}
		System.out.println("1-100之和:"+forSum+"\n方法:for");
	}
}
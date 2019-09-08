public class IsOdd{
	public static void main(String[] args){
		int sum = 0;
		for(int i=0;i<=100;i+=2){
			sum+=i;
		}
		System.out.println("1-100偶数之和:"+sum+"\n方法:for");
		int oddSum = 0;
		for(int i=1;i<=100;i+=2){
			oddSum+=i;
		}
		System.out.println("1-100奇数之和:"+oddSum+"\n方法:for");
	}
}
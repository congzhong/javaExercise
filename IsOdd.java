public class IsOdd{
	public static void main(String[] args){
		int sum = 0;
		for(int i=0;i<=100;i+=2){
			sum+=i;
		}
		System.out.println("1-100ż��֮��:"+sum+"\n����:for");
		int oddSum = 0;
		for(int i=1;i<=100;i+=2){
			oddSum+=i;
		}
		System.out.println("1-100����֮��:"+oddSum+"\n����:for");
	}
}
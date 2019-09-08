/*1~10之间的整数相加，得到累加值大于20的当前数*/
public class AddNumber{
	public static void main(String[] args){
		int sum = 0;
		int num = 0;
		for(int i=1;i<=10;i++){
			sum+=i;
			num=i;
			if(sum>=20){
				break;	
			}
		}
		System.out.println("累加值大于20的当前数是:"+num);
	}
}
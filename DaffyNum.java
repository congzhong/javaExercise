/*9.水仙花数是指一个3位数，它的每个位上的数字的3 次幂之和等于它本身。
（例如：1^3 + 5^3 + 3^3 = 153）,判断是否水仙花数。*/
public class DaffyNum{
public static void main(String[] args){
	int num = 153,
	a = num%10,
	b = num%100/10,
	c = num/100;
	if((int)(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)) == num)
	{
		System.out.println(num+"是一个水仙花数");
	}
}
}
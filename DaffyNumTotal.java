/*.使用循环打印100-1000以内所有的水仙花数for  i  100 -1000使用求余数   的方式将  i  的个位   十位   百位  取出来。
循环里面写一个   if判断各个位数  立方和  ==  iSys...   i是水仙花数*/
public class DaffyNumTotal{
	public static void main(String[] args){
		int sum = 0,
		a = 0,
		b = 0,
		c = 0;
		for(int i=100;i<1000;i++){
			a = i%10;
			b = i%100/10;
			c = i/100;
			if((int)(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)) == i){
				System.out.println(i+"是一个水仙花数");
			}
			
		}
	}
}
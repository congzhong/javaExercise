/*8.假如投资的年利率为5%，试求从1000块增长到5000块，需要花费多少年 ？*/
public class MoneyUp{
	public static void main(String[] args){
		int year = 2019;
		double rate = 0.05,
		money = 1000;
		
		while(money<=5000){
			money =money*(1+rate);
			year++;
		}
		System.out.println("从1000块增长到5000块，需要花费多少年:");
		System.out.println((year-2019)+"年");
		
	}
}
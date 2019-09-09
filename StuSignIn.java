/*7.用while循环重写小明的成绩0<成绩<100，年龄大于6<年龄<18，性别男或女，如果用户输入不合法就反复输入，直到正确为止。*/
import java.util.Scanner;
public class StuSignIn{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("=================学生登录系统=================");
		int score = 0,
		age = 0;
		String name = "小明",
		men = "女",
		man = "男",
		tip = "输入正确",
		errorTip="输入错误,请重新输入！！！";
		while(true){
			System.out.println("请输入"+name+"的成绩:");
			int systemSocre = sc.nextInt();
			if(systemSocre>=0&systemSocre<=100){
				System.out.println(tip);
				break;
						}
			else{
					System.out.println(errorTip);	
						}
				}
		while(true){
			System.out.println("请输入"+name+"的年龄:");
			int systemAge = sc.nextInt();
			if(systemAge>=6&systemAge<=18){
				System.out.println(tip);
				break;
					}
			else{
				System.out.println(errorTip);	
							}
				}
		while(true){
			System.out.println("请输入"+name+"的性别:");
			String systemSex = sc.next();
			if(systemSex.equals(men)|systemSex.equals(man)){
				System.out.println(tip);
				break;
					}	
			else{
				System.out.println(errorTip);
					}
				}
			System.out.println("登录成功！！！");
		}
	}


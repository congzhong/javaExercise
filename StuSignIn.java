/*7.��whileѭ����дС���ĳɼ�0<�ɼ�<100���������6<����<18���Ա��л�Ů������û����벻�Ϸ��ͷ������룬ֱ����ȷΪֹ��*/
import java.util.Scanner;
public class StuSignIn{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("=================ѧ����¼ϵͳ=================");
		int score = 0,
		age = 0;
		String name = "С��",
		men = "Ů",
		man = "��",
		tip = "������ȷ",
		errorTip="�������,���������룡����";
		while(true){
			System.out.println("������"+name+"�ĳɼ�:");
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
			System.out.println("������"+name+"������:");
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
			System.out.println("������"+name+"���Ա�:");
			String systemSex = sc.next();
			if(systemSex.equals(men)|systemSex.equals(man)){
				System.out.println(tip);
				break;
					}	
			else{
				System.out.println(errorTip);
					}
				}
			System.out.println("��¼�ɹ�������");
		}
	}


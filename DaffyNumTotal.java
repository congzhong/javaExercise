/*.ʹ��ѭ����ӡ100-1000�������е�ˮ�ɻ���for  i  100 -1000ʹ��������   �ķ�ʽ��  i  �ĸ�λ   ʮλ   ��λ  ȡ������
ѭ������дһ��   if�жϸ���λ��  ������  ==  iSys...   i��ˮ�ɻ���*/
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
				System.out.println(i+"��һ��ˮ�ɻ���");
			}
			
		}
	}
}
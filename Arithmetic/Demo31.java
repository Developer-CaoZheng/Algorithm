import java.util.Scanner;
public class Demo31{
	public static void main(String[] args){
		//�����Լ������С������
		Scanner input = new Scanner(System.in);
		System .out.println("������������");
		int m1 = input.nextInt();
		int n1 = input.nextInt();
		int m = m1>n1? m1:n1;
		int n = n1>m1? n1:m1;
		int ji = m*n;
		while(n!=0){
			int tempt = m%n;
			m = n;
			n = tempt;
		}
		System.out.println("���Լ��Ϊ"+m);
		System.out.println("��С������Ϊ"+(ji/m));
	}
	
}
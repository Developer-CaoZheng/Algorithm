import java.util.Scanner;
public class Demo17{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����λ��");
		int number = input.nextInt();
			int ge = number/1%10;
			int shi = number/10%10;
			int bai = number/100%10;
			int qian = number/1000%10;
		System.out.println("��λ��"+ge+"ʮλ: "+shi+"��λ: "+bai+"ǧλ: "+qian);
		int sum = ge+shi+bai+qian;
		System.out.println(sum);
		
	}
	
}
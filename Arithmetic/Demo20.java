import java.util.Scanner;
public class Demo20{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int score;
	int sum = 0;
	int i =1;
	do {
		System.out.println("��������ĵ�"+i+"�ųɼ�");
		score = input.nextInt();
		sum +=score;
		i++;
		} while (i<=5);
			System.out.println((i-1)+"�ųɼ����ܺ�Ϊ"+sum);
	}
		
}
import java.util.Scanner;
public class Demo27{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num;
		int sum = 0;
		for(int i =1;i<=10;i++){
			System.out.println("�������"+i+"������");
			num = input.nextInt();
			if(num == 886){
			System.out.println("���ź�886���ܲ��뱾�����㣬�Ժ�Ϳ�����");
			break;
			}
			sum +=num;
		}
		System.out.println(sum);	
	}
}
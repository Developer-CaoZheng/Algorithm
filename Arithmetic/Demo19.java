import java.util.Scanner;
public class Demo19{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("��������ķ���");
	int score = input.nextInt();
	switch(score/10){
	case 10:
	case 9:
	System.out.println("����");
	break;
	case 8:
	System.out.println("����");
	break;
	case 6:
	case 7:
	System.out.println("�е�");
	break;
	default:
	System.out.println("������");
	break;
		}	
	}
}
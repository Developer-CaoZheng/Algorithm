import java.util.Scanner;
public class demo11{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("��������Ҫ���ָ���·�");
		int month = input.nextInt();
		if(month != 0){
			switch(month){
				case 3:
				//System.out.println("����");
				//break;
				case 4:
				//System.out.println("����");
				//break;
				case 5:
				System.out.println("����");
				break;
				case 6:
				//System.out.println("�ļ�");
				//break;
				case 7:
				//System.out.println("�ļ�");
				//break;
				case 8:
				System.out.println("�ļ�");
				break;
				case 9:
				//System.out.println("�＾");
				//break;
				case 10:
				//System.out.println("�＾");
				//break;
				case 11:
				System.out.println("�＾");
				break;
				case 12:
				//System.out.println("����");
				//break;
				case 1:
				//System.out.println("����");
				//break;
				case 2:
				System.out.println("����");
				break;
			}
		} else {
			System.out.println("������Ĳ���һ���·�");	
		}
	}
}
import java.util.Scanner;
public class Demo15{
	public static void main(String[] args){
	Scanner input= new Scanner(System.in);
	System.out.println("��������ĳɼ�");
	int score = input.nextInt();
	System.out.println("����������Ա�");
	String sex = input.next();
	if(score <= 10){
		if(sex.equals("��")){
			System.out.println("�������������");
		} else {
			System.out.println("����Ů�������");
				}
		}
	}	
}
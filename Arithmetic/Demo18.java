public class Demo18{
	public static void main(String[] args){
		int week = 1;
		int temperature = 32;
		switch(week){
		case 1:
		System.out.println("monday");
		case 2:
		System.out.println("tuesday");
		case 3:
		System.out.println("wednesday");
		case 4:
		System.out.println("thursday");
		case 5:
		System.out.println("friday");
		case 6:
		System.out.println("saturday");
		case 7:
		System.out.println("sunday");
		}
		if(week == 6||week ==7){
			if(temperature > 30){
				System.out.println("ȥ��Ӿ");
			} else {
				System.out.println("��ɽ");
			}
		} else if(week == 1||week == 2||week == 3||week == 4||week == 5){
				System.out.println("ȥ�ͻ���λ̸ҵ��");
			} else {
				System.out.println("��˾����������");
			}
		}
	
}
public class Demo28{
	public static void main(String[] args){
		double h = 100;
		double sum = 0; 
		for(int i =1;i<=10;i++){
			h /=2;
			sum +=h;
		}
		System.out.println("������"+(sum+100)+"��");
		System.out.println("��ʮ����ط���"+h+"��");
	}
}
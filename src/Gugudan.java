import java.util.Scanner;
public class Gugudan {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("����ϰ� ���� �������� �Է��ϼ���: ");
		int a = s.nextInt();
		
		if(a<2 || a>9) //�Ǵ� if, else if, else�� ������ ���� ����
			System.out.println("2�̻�, 9������ ���� �Է��� �� �ֽ��ϴ�.");
		
		else {
			//for�� ����� ���
			for(int i=1; i<10; i++) {
				System.out.printf("%d*%d = %d", a, i, a*i);
				System.out.println();
			}
			
			//while�� ����� ���
			int i = 1;
			while(i<10) {
				System.out.printf("%d*%d = %d", a, i, a*i);
				System.out.println();
				i++;
			}
		}
		
		
		
			
		//ctrl alt ���Ʒ�ȭ��ǥ : ����
		//alt ���Ʒ�ȭ��ǥ : �̵�
		//eclipse ����Ű �˻��ؼ� ���� Ȱ���� ��

	}

}

import java.util.Scanner;
public class GugudanMain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("�������� ũ�⸦ �Է��ϼ���: ");
		int a = s.nextInt();
		
		
		
		
		for (int j = 2; j < a+1; j++) {        
        	Gugudan.print(Gugudan.calculate(j,a));
        }

	}

}

import java.util.Scanner;
public class GugudanMain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("�Է��� ũ�⸦ ������ ���ڿ��� �Է��ϼ���: ");
		String a = s.next();
		
		String [] splited = a.split(",");
		
		int first = Integer.parseInt(splited[0]);
		int second = Integer.parseInt(splited[1]);
		
		
		
		
		for (int j = 2; j < first+1; j++) {        
        	Gugudan.print(Gugudan.calculate(j,second));
        }

	}

}

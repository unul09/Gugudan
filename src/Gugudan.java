import java.util.Scanner;
public class Gugudan {

	public static void main(String[] args) {
		
		int[] result = new int[9]; //�迭 ����
		
		for(int i=0; i<9; i++)
			result[i] = 2*(i+1);
		
		for(int i=0; i<result.length; i++)
			System.out.println("2*"+(i+1)+"="+result[i]);
		
		
		

	}

}

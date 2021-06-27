import java.util.Scanner;
public class Gugudan {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("출력하고 싶은 구구단을 입력하세요: ");
		int a = s.nextInt();
		
		if(a<2 || a>9) //또는 if, else if, else로 구분할 수도 있음
			System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
		
		else {
			//for문 사용할 경우
			for(int i=1; i<10; i++) {
				System.out.printf("%d*%d = %d", a, i, a*i);
				System.out.println();
			}
			
			//while문 사용할 경우
			int i = 1;
			while(i<10) {
				System.out.printf("%d*%d = %d", a, i, a*i);
				System.out.println();
				i++;
			}
		}
		
		
		
			
		//ctrl alt 위아래화살표 : 복붙
		//alt 위아래화살표 : 이동
		//eclipse 단축키 검색해서 적극 활용할 것

	}

}

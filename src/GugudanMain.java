
public class GugudanMain {

	public static void main(String[] args) {
		for (int j = 2; j < 10; j++) {
            // calculate와 print 메소드 활용해 구구단 구현하기
        	// calculate메소드가 배열을 return 하므로, print의 인자로 넣어준다
        	Gugudan.print(Gugudan.calculate(j));
        }

	}

}

public class Gugudan {
	
	//값을 받아 저장공간 배열에 해당 구구단 값 저장
    public static int[] calculate(int times) {
        int[] result = new int[9];

        for (int i = 0; i < result.length; i++) {
            // 계산 결과를 배열에 저장
        	result[i] = times *(i+1);
        }

        return result;
    }
    
    
    //배열을 받아 배열 출력
    public static void print(int[] result) {
        for (int i = 0; i < result.length; i++) {
            // 계산 결과를 화면에 출력
        	System.out.println(result[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        for (int j = 2; j < 10; j++) {
            // calculate와 print 메소드 활용해 구구단 구현하기
        	// calculate메소드가 배열을 return 하므로, print의 인자로 넣어준다
        	print(calculate(j));
        }
    }
}

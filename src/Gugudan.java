public class Gugudan {
	
	//값을 받아 저장공간 배열에 해당 구구단 값 저장
    public static int[] calculate(int times, int howmuch) {
        int[] result = new int[howmuch];

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

   
    
}

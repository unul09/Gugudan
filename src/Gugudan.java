public class Gugudan {
	
	//���� �޾� ������� �迭�� �ش� ������ �� ����
    public static int[] calculate(int times) {
        int[] result = new int[9];

        for (int i = 0; i < result.length; i++) {
            // ��� ����� �迭�� ����
        	result[i] = times *(i+1);
        }

        return result;
    }
    
    
    //�迭�� �޾� �迭 ���
    public static void print(int[] result) {
        for (int i = 0; i < result.length; i++) {
            // ��� ����� ȭ�鿡 ���
        	System.out.println(result[i]);
        }
        System.out.println();
    }

   
    
}

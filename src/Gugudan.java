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

    public static void main(String[] args) {
        for (int j = 2; j < 10; j++) {
            // calculate�� print �޼ҵ� Ȱ���� ������ �����ϱ�
        	// calculate�޼ҵ尡 �迭�� return �ϹǷ�, print�� ���ڷ� �־��ش�
        	print(calculate(j));
        }
    }
}

package JC_hm2;

public class Task3 {

    public static void main(String[] args) {

        int[][] matrix = new int[5][7];
        int min = -2;
        int max = 75;
        int range = max - min + 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                matrix[i][j] = (int) (Math.random() * range) + min;
            }
        }
        for (int i = 0; i < 5; i++, System.out.println()) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }

    }
}

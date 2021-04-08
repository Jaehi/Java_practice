package Array;

public class TwoDimension {
    public static void main(String[] args) {
        int[][] ss = new int[2][6];
        int temp = 1;
        for (int i = 0; i < ss.length; i++){

            for (int j = 0; j < ss[i].length; j++){
                ss[i][j]= temp;
                temp ++;
                System.out.println(ss[i][j]);
            }

        }
        System.out.println(ss.hashCode());
    }
}

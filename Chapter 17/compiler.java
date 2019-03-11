import java.util.Arrays;

public class compiler{

     public static void main(String []args){
        int[][] mat = new int[12][12];

        for(int r = 0; r < mat.length; r++)
        {
            for(int c = 0; c <= r; c++)
            {
              System.out.println("C: " + c + " R: " + r);

              for(int[] a : mat)
              {
                System.out.println(Arrays.toString(a));
              }

              System.out.println();

                if(c == 0 || r ==0)
                {
                    mat[r][c] = 1;
                }
                else
                {
                    mat[r][c] = mat[r-1][c]+mat[r-1][c-1];
                }
            }
        }

        System.out.println("Result of mat[3][2]:: " + mat[3][2]);
     }
}

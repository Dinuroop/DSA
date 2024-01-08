package Day3;

public class Search2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int n = 3, m = 4;
        int target = 6;
        boolean res = false;
        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i][0]<=target && matrix[i][m-1]>=target){
                for (int is : matrix[i]) {
                    if (is==target) {
                        res = true;
                        break;
                    }
                }
                break;
            }
        }
        System.out.println("Result: "+res);
    }
}

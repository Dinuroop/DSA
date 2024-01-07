import java.util.ArrayList;

public class SetMatrixZero {
  public static void main(String[] args) {
    int[][] ma = {{1, 2, 3}, {4, 5, 0},{0, 3, 6}};
    ArrayList<Integer> row = new ArrayList<Integer>();
    ArrayList<Integer> col = new ArrayList<Integer>();
    for(int i=0; i<ma.length; i++){
        for(int j=0; j<ma[0].length; j++){
            if(ma[i][j]==0){
                row.add(i);
                col.add(j);
            }
        }
    }
    System.out.println("Rows: " + row);
    System.out.println("Cols: " + col);
    for(int i=0; i<row.size(); i++){
        for(int j=0; j<ma[0].length; j++){
            ma[row.get(i)][j] = 0;
        }
    }
    for(int i=0; i<ma.length; i++){
        for(int j=0; j<col.size(); j++){
            ma[i][col.get(j)] = 0;
        }
    }

    for (int i = 0; i < ma.length; i++) {
        for (int j = 0; j < ma[0].length; j++) {
            System.out.print(ma[i][j]+" ");
        }
        System.out.println();
    }
  }
    
}
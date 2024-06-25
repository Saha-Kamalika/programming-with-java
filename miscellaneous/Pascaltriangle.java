import java.util.*;
class Main{
    public static void main(String[] args){
        int rows=7;
        int[][] tri=new int[rows][];
        
        for(int i=0;i<rows;i++){
            tri[i]=new int[i+1];
            tri[i][0]=1;
            tri[i][i]=1;
            
            for(int j=1;j<i;j++){
                tri[i][j]=tri[i-1][j-1]+tri[i-1][j];
            }
        }
        int maxLength = tri[rows-1].length;
        for(int i=0;i<rows;i++) {
            for(int j=0; j<maxLength-tri[i].length; j++) {
                System.out.print(" ");
            }
            for(int j=0;j<tri[i].length;j++) {
                System.out.print(tri[i][j]+" ");
            }
            System.out.println();
        }
    }
}
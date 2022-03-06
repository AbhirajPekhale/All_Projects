package q_9_Array;


public class Array_2d {

	   public static void main(String[] args) {

	        int[][] a = {
	            {1, 2, 3}, 
	            {8, 9, 10, 11} 
	        };
	      
	        for (int i = 0; i < a.length; ++i) {
	            for(int j = 0; j < a[i].length; ++j) {
	                System.out.println("\n"+a[i][j]);
	            }
	        }
	    }
}

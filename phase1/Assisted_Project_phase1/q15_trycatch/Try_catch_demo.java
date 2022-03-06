package q15_trycatch;


public class Try_catch_demo {
	    public static void main(String args[]) 
	    {
	        int[] array = new int[3];
	        try 
	        {
	            array[6] = 9;
	        }
	        catch (ArrayIndexOutOfBoundsException e) 
	        {
	            System.out.println("Array index is out of bounds!"); 
	        }
	    }
	}

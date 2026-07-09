

public class linear {

	
	    public static void main(String[] args) {
	        int[][] arr = {
	            {10, 20, 30},
	            {40, 50, 60},
	            {70, 80, 90}
	        };

	        int target = 50;
	        boolean found = false;

	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[i].length; j++) {
	                if (arr[i][j] == target) {
	                    System.out.println("Found at Row " + i + ", Column " + j);
	                    found = true;
	                    break;
	                }
	            }
	            if (found) break;
	        }

	        if (!found) {
	            System.out.println("Element not found");
	        }
	    }
	}
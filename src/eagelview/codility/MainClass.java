package eagelview.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {

		//System.out.println(new MainClass().solution(6, 20));
		int[] array = new int[] {2,-2,3,0,4,-7};

	    List<int[]> indices = findAllRanges(array);

	    System.out.println("Found "+indices.size()+" ranges in the array: "+Arrays.toString(array));
	    for (int i=0; i<indices.size(); i++) {
	        int[] pair = indices.get(i);
	        System.out.println(i+": From index "+pair[0]+" to "+pair[1]);
	    }
	}

	public int solution(int A, int B) {
		int count = 0;
		for (int i = 1; i < B; i++) {
			if ((i * (i + 1)) >= A && (i * (i + 1)) <= B) {
				count++;
			}
		}
		return count;
	}
	
	private static List<int[]> findAllRanges(int[] array) {
	    List<int[]> result = new ArrayList<int[]>();
	    for (int i=0; i<array.length; i++) {     // go from 0 to N-1  --> i
	        for (int j=i; j<array.length;j++) {  // go from i to N-1  --> j
	            int sum = 0;

	            // sum the values up from "i" to "j"
	            for (int k=i; k<=j; k++) {
	                sum += array[k];
	            }

	            if (sum == 0) {
	                int[] indices = new int[] {i, j};
	                result.add(indices);
	            }
	        }
	    }
	    return result;
	}
}

import java.util.Arrays;

public class Lab4 {
	public static void main(String[] args){

		
		Integer[] testOne = new Integer [] {13,54,232,64,4};
		Integer[] testTwo = new Integer [] {null};
		Integer[] testThree = new Integer [] {3,4,3,3,4};
		Integer[] testFour = new Integer [] {-5,3,5,2,-100};
		Integer[] testFive = new Integer [] {1,2,3,4,5};
		Integer[] testSix = new Integer [] {1,2,3,4,5};

		newArray(testOne);
		newArray(testTwo);
		newArray(testThree);
		newArray(testFour);
		newArray(testFive);
		newArray(testSix);
		
	}
			

	private static void newArray(Integer[] testCase) {
		if(testCase!=null){
			Arrays.sort(testCase);
	        int temp;
	         
	        for (int i = 0; i < testCase.length/2; i++) 
	        {
	            temp = testCase[i];
	             
	            testCase[i] = testCase[testCase.length-1-i];
	             
	            testCase[testCase.length-1-i] = temp;
	        }
	        
			}
		if(testCase==null){
			throw new IllegalArgumentException("case is null");
		}
		}

	
		}
		
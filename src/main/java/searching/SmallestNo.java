package searching;

public class SmallestNo {

	public static void main(String[] args) {

	}
	/**
	 * 
	 * @param inArr
	 * @return smallest Number from the given array
	 */

	public static int smallestNo(int[] inArr) {
		int smallestNo = inArr[0];

		for (int i = 1; i < inArr.length; i++) {
			if (smallestNo > inArr[i]) {
				smallestNo = inArr[i];
			}

		}
		return smallestNo;
	}

}

package searching;

public class LargestNumber {

	public static void main(String[] args) {

		int[] inArr = { 5, 23, 54, 52, 34, 12, 96, 78, 756 };
		int largestNo = largestNo(inArr);
		System.out.println("Largest no in the given array is : " + largestNo);

	}

	/**
	 * 
	 * @param inpArr
	 * @return largest Number from the given array
	 */
	public static int largestNo(int[] inpArr) {
		int largestNo = inpArr[0];

		for (int i = 1; i < inpArr.length; i++) {

			if (largestNo < inpArr[i]) {
				largestNo = inpArr[i];
			}

		}
		return largestNo;

	}

}

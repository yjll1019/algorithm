package midQuiz;
/*
 * 작성일 : 2018년 03월 26일
 * 내 용 : 알고리즘 중간 쪽지시험.
 */
public class Quiz10 {
	
	
	static void mergeSort(int[] a, int start, int end) {
		System.out.printf("%d %d begin \n", start, end);
		
		if(start < end) {
			int middle = (start + end) / 2; 
			mergeSort(a, start, middle);
			mergeSort(a, middle+1, end);
			merge(a, start, middle, end);
		}
		System.out.printf("%d %d end \n", start, end);
	}
	
	static void merge(int[] a, int start, int middle, int end) {
		int length = end-start+1;
		int index1 = start;
		int index2 = middle+1;
		int i=0;
		int [] temp = new int[length];
		
		while(index1 <= middle && index2 <= end) {
			if(a[index1] < a[index2]) {
				temp[i++]  = a[index1++];
			}
			else
				temp[i++] = a[index2++];
		}
		
		while(index1<=middle) {
			temp[i++] = a[index1++];
		}
		while(index2<=end) {
			temp[i++] = a[index2++];
		}
		for(i=0; i<temp.length; i++) {
			a[start+i] = temp[i]; 
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("midQuiz_Quiz10 : 이예지");
		
		int[] a = {31, 3, 65, 73, 8, 11, 20, 29};
		mergeSort(a, 0, a.length-1);
	}

}

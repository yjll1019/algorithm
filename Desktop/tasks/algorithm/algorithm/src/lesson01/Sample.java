package lesson01;
/*
 * 작성일자 : 2018년 03월 17일
 * 내 용 : n^3,n에 비례하는 알고리즘
 */
public class Sample {
	static int sample1(int a[], int n) {
		//n^3에 비례하는 알고리즘
		int sum = 0;
		int k = 0;
		
		for(int i=0; i<n; ++i) {
		for(int j=0; j<n; ++j) {
			for(int z=j; z<n; ++z) {
				if(a[z]>k) {
					k = a[z];
				}
			}
			sum += k;
		}
		}
		
		return sum;
	}
	
	static int sample2(int a[], int n) {
		int sum = 0;
		for(int i=0; i<n/2; ++i) {
			sum += a[i];
		}
		return sum;
	}
	
	static String sample3(int a[], int n) {
		int sum = 0;
		int max = 0;
		for(int i=0; i<n; ++i) {
			sum += a[i];
		}
		for(int j=0; j<n; ++j) {
			if(max<a[j])
				max = a[j];
		}
		
		return String.format("sum: %d, max: %d", sum,max);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,7,1,3};
		System.out.print("n^3에 비례: ");
		System.out.println(sample1(a,4));
		
		System.out.print("n에 비례: ");
		System.out.println(sample2(a,4));
		
		System.out.print("2n(n)에 비례: ");
		System.out.println(sample3(a,4));
	}

}

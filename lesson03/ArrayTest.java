package lesson03;

import java.util.Arrays;

/*
 * 작성일 : 2018년 03월 24일
 * 내 용 : 기본 자료형과 객체 배열의 정렬
 */

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lesson03_ArrayTest : 이예지");
		
		int [] a = { 17, 14, 11, 19, 13, 15, 20, 12, 16, 18 };
		Arrays.sort(a, 0, 5); //인덱스 0~4까지 부분 정렬
		System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        
        double [] b =  { 17.1, 14.3, 11.2, 19.5, 11.3, 14.1, 17.5, 19.2 };
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));

        char [] c = {'a', 'c', 'd', 'b', 'z'};
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        // 기본 자료형 정렬
        
        
        String [] d = { "zero", "one", "two", "three", "four", "five", "six", "seven" };
        Arrays.sort(d);
        System.out.println(Arrays.toString(d));

        Integer[] f = { 17, 14, 11, 19, 13, 15, 20, 12, 16, 18 };
        Arrays.sort(f);
        System.out.println(Arrays.toString(f));
        //객체 배열 정렬
	}

}

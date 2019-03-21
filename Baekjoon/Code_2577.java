package algorithm;

import java.util.Scanner;

/*
    작성일 : 2019년 03월 21일
    내 용  : 백준 - 숫자의 개수
            세 개의 자연수가 주어질 때 세 자연수의 곱에서 0~9까지의 숫자가 몇 번 쓰였는지 출력.
 */
public class Code_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numArr = new int[10]; //0~9까지 숫자의 개수를 저장하는 배열.

        int result = 1;

        for(int i=0; i<3; ++i){
            result *= sc.nextInt();
        }

        while(result>0){
            numArr[result%10]++;
            result /= 10;
        }

        for(int i : numArr)
            System.out.println(i);
    }
}
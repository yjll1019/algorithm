package algorithm;

/*
    작성일 : 2019년 03월 29일
    내 용 :  아스키 코드
            알파벳 소문자, 대문자 그리고 0부터 9까지 중 하나가 주어졌을 때 주어진 글자의 아스키코드 값을 출력.
 */

import java.util.Scanner;

public class Code_11654 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println((input.nextLine().charAt(0))-0);

        input.close();
    }

}

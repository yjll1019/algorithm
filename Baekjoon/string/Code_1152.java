package string;

import java.util.Scanner;

/*
 * 작성일 : 2019년 03월 12일
 * 내 용 : 백준 1152 - 단어의 개수
 *                  첫째 줄에 단어의 개수를 출력한다.
 */
public class Code_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        s = s.trim();

        if(s.isEmpty()) {
            System.out.println(0);
            return;
        }

        int n = s.split(" ").length;

        System.out.println(n);
    }
}
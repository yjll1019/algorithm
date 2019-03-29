package algorithm;

import java.util.Scanner;

/*
    작성일 : 2019년 03월 29일
    내 용 : 알파벳 찾기
            모두 소문자인 단어가 주어지면 각각의 알파벳이 처음 등장하는 위치를 출력.
            해당 알파벳이 단어에 포함되지 않은 경우에는 -1 을 출력한다.
 */
public class Code_10809 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String s = input.nextLine();

        int idx;
        int[] alphabetNumber = new int[26];

        for(int i=0; i<alphabetNumber.length; ++i){
            alphabetNumber[i] = -1;
        }

        for(int i=0; i<s.length(); ++i){

            idx = s.charAt(i)-'a';

            if(alphabetNumber[idx]==-1) {
                alphabetNumber[idx] = i;
            }
        }

        for(int i : alphabetNumber){
            System.out.print(i+" ");
        }

        input.close();

        /* 19~37line 대신 밑의 두 문장으로도 구현할 수 있다.
           밑의 코드가 더 간결함에도 불구하고 사용하지 않은 이유는 indexOf()메소드를 실행할 때 내부적으로 for문을 수행한다.
            내가 작성한 for문 + indexOf()의 for문 => 즉, 시간복잡도가 O(N^2)이 된다. 그래서 시간복잡도가 O(N)인 위의 코드를 남겨두었다.
            그러나 백준에서 위의 코드와 밑의 코드를 돌려보았을 때, 시간 차이가 얼마나지 않았다....간단한 예제를 실행시켜서 그랬던걸까...

         for(int i='a'; i<='z'; ++i){
            System.out.print(s.indexOf(i)+" ");
        }*/

    }

}

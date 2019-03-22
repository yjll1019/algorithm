package algorithm;

import java.util.Scanner;

/*
    작성일 : 2019년 03월 21일
    내 용  : 백준 - 평균 점수
            5명의 점수가 입력되는데 40점 미만이면 40점으로, 40점 이상이면 본인의 점수로 처리해서 5명의 평균 점수 구하기.
 */
public class Code_10039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testNum = 5;

        int sum = 0;
        int score = 0;

        for(int i=0; i<testNum; ++i){
            score = sc.nextInt();
            if(score<40){
                sum+=40;
            }else{
                sum+=score;
            }
        }

        System.out.println(sum/testNum);
    }
}
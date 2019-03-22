package algorithm;

import java.util.Scanner;

/*
    작성일 : 2019년 03월 21일
    내 용  : 백준 - 음계
            1부터 8까지의 숫자가 오름차순으로 주어지면 ascending, 내림차순으로 주어지면 descending, 섞여있으면 mixed 출력.
 */
public class Code_2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputNum = 8;

        int preNum = sc.nextInt();
        int nowNum = 0;
        int gap = 0; //앞의 숫자와 현재 입력한 숫자의 차이를 나타내는 변수.

        while(inputNum-->1){
            nowNum = sc.nextInt();
            gap = preNum - nowNum;
            preNum = nowNum;

            if(gap!=1&&gap!=-1){
                System.out.println("mixed");
                return;
            }else{
                if(inputNum==1){
                    if(gap==-1){
                        System.out.println("ascending");
                    }else{
                        System.out.println("descending");
                    }
                    return;
                }
            }
        }

    }
}
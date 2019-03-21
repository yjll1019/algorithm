package algorithm;

import java.util.Scanner;

/*
    작성일 : 2019년 03월 21일
    내 용 :  백준 - OX퀴즈
            OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성.
 */
public class Code_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testNum = sc.nextInt();

        String[] oxArr;

        int[] numArr;

        int sum=0;

        while(testNum-->0){
           oxArr = sc.next().split("");

           numArr = new int[oxArr.length];

           sum = 0;

           if(oxArr[0].equals("O"))
               numArr[0]++;

           for(int i=1; i<numArr.length; ++i){
               if(oxArr[i].equals("O")){
                   numArr[i]+= (numArr[i-1]+1);
               }
           }

           for(int i : numArr)
               sum+=i;

            System.out.println(sum);
        }

    }
}
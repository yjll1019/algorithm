package algorithm;

import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 10일 --> 2019년 03월 21일 수정.
 * 내 용 : OX퀴즈
 		OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성.
 */
public class Code_8958_2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();

        String ox;

        int sum,count;

        int [] arr;

        while(n-->0) {
            ox  = sc.nextLine();
            arr = new int[ox.length()];
            count=0;
            sum=0;
            //각 문제마다 점수를 저장하기 위한 배열
            for(int i=0; i<ox.length(); ++i) {
                if(ox.charAt(i)=='O') {
                    arr[i] = (count+1);
                    count = arr[i];
                    //if문을 생략해주었음.
                  /*  if(count==0) {
                        arr[i] = 1;
                        count = 1;
                    }else {
                        arr[i] = count+1;
                        count +=1;
                    }*/
                }else {
                    count=0;
                    arr[i] = 0;
                }
            }

            for(int i=0; i<ox.length(); ++i) {
                sum += arr[i];
            }

            System.out.println(sum);
        }

    }

}

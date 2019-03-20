package com.company;

//포비와 크롱이 책 페이지를 폈을 때, 페이지를 더하거나 곱해서 가장 큰 수를 만든 사람이 이기는 게임.
public class Code_4 {

    public static void main(String[] args) {
        int[] pobi = {131,132};
        int[] crong = {211,212};
        System.out.println(solution(pobi, crong));
    }

    static public int solution(int[] pobi, int[] crong) {
        int answer = 0;

        int pobiMax = pobiOrCrongMaxNumber(pobi);
        int crongMax = pobiOrCrongMaxNumber(crong);

        //책의 표지가 잘못 나왔을 경우 EX)90,120 는 존재할 수 없는 페이지.
        if(pobi[1]-pobi[0]!=1 || crong[1]-crong[0]!=1){
            answer = -1;
        }else if(pobiMax>crongMax){
            answer = 1;
        }else if(pobiMax<crongMax){
            answer = 2;
        }else{
            answer = 0;
        }

        return answer;
    }

    static  public int pobiOrCrongMaxNumber(int[] arr){

        int add = 0;
        int mul = 1;
        int max = 0;

        //페이지의 범위는 1~400이라 if문으로 페이지가 1,2,3자리 수일 때로 나눴음.
        for(int i=0; i<arr.length; ++i) {
            if (arr[i] < 10) {
                return arr[i];
            } else if (arr[i] < 100) {
                int oneNum = arr[i] / 10;
                int twoNum = arr[i] % 10;

                add = oneNum + twoNum;
                mul = oneNum * twoNum;
            } else {
                int oneNum = arr[i] / 100;
                int twoNum = (arr[i] / 10) % 10;
                int threeNum = arr[i] % 10;

                add = oneNum + twoNum + threeNum;
                mul = oneNum * twoNum * threeNum;
            }
            if(add>mul){
                max = (add>max) ? add : max;
            }else{
                max = (add>max) ? add : max;
            }
        }

        return max;
    }
}
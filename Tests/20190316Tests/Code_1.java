package com.company;

//돈의 금액이 주어졌을 때, 각 돈의 개수가 몇 개인지 출력.
public class Code_1 {
    public static void main(String[] args) {
        f(511);
    }

    static public void f(int money){
        int[] arr = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
        int[] solution = new int[9];

        //5만원부터 1원까지 나눠지면 몫(개수)를 배열에 저장.
        for(int i=0; i<arr.length; ++i){
            if(money/arr[i]>0){
                solution[i] = money/arr[i];
                money %= arr[i]; //나눠진 돈을 빼고 남은 돈을 저장.
            }
        }

        for(int a : solution)
            System.out.print(a+" ");
    }
}
package com.company;

//1부터 주어진 수까지 3,6,9가 몇 번 나오는지 출력.
public class Code_5 {
    public static void main(String[] args) {
        System.out.println(solution(13));
    }

   static  public int solution(int number) {
        int count =0;

        //1부터 주어진 수까지 돌림.
        for(int i=1; i<=number; ++i){
            int a = i;

            //해당되는 수가 0이 될 때까지 10으로 나눠서 각 자리수에 3,6,9가 포함되어있으면 count증가.
            while(a!=0){
                int b = a%10;
                a=a/10;
                if(b==3 || b==6 || b==9){
                    count++;
                }
            }

        }
        return count;
    }
}
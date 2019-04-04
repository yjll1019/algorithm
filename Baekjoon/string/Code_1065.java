import java.util.Scanner;

/*
    작성일 : 2019년 03월 04일
    내 용 : 백준 1065 - 한수
    	첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
 */

public class Code_1065 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int count = 0;

        if (n < 100){
            System.out.println(n);
        }else{ //세 자리수 일 때만 한수인지 구분(1,2자리 수의 차 = 2,3자리 수의 차)
            count=99;
            for(int i=100; i<=n; ++i){
                int oneNum = i/100;
                int twoNum = (i/10)%10;
                int threeNum = i%10;

                if((oneNum-twoNum)==(twoNum-threeNum))
                    count++;
            }
            System.out.println(count);
        }

    }


}
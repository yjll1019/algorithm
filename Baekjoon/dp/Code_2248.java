package dp;

import java.util.Scanner;
/*
 *  작성일 : 2019년 03월 12일
 *  내 용 : 백준 2248 - 별찍기11
 *         예제를 보고 규칙을 유추한 뒤 별을 찍어보자.
 */
public class Code_2248 {

    static String[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        arr = new String[n][2 * n - 1];

        for (int i = 0; i<n; i++)
            for (int j = 0; j < 2*n-1; j++)
                arr[i][j] = " ";

        function(0,  n - 1, n);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < (2 * n - 1); ++j) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }

    public static void function(int x, int y, int n){
        if(n==3) {
            arr[x][y] = "*";
            arr[x+1][y-1] = arr[x+1][y+1] = "*";
            arr[x+2][y-2] = arr[x+2][y-1] = arr[x+2][y] = arr[x+2][y+1] = arr[x+2][y+2] = "*";
            return ;
        }

        function(x, y, n/2);
        function(x+(n/2), y-(n/2), n/2);
        function(x+(n/2), y+(n/2), n/2);
    }

}

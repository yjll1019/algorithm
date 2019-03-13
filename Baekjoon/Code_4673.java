/*
    작성일 : 2019년 03월 04일
    내 용 : 백준 4673 - 셀프 넘버
            10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력해라.
 */

public class Code_4673 {

    public static void main(String[] args) {
        getSelfNumber();
    }

    static  void getSelfNumber(){

        boolean[] check = new boolean[10001];

        for(int i=1; i<10001; ++i){
            int ctor = getCtor(i);
            if (10001 > ctor) {
                check[ctor] = true;
            }

        }

        StringBuffer sf = new StringBuffer();

        for(int i=1; i<10001; ++i) {
            if(check[i]==false)
                sf.append(i+"\n");
        }

        System.out.println(sf);
    }

    static int getCtor(int num){
        int sum = num;

        while(true){
            if(num==0)
                break;
            sum += num%10;
            num = num/10;
        }

        return sum;
    }

}
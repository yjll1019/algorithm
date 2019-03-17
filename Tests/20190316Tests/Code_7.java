package com.company;

//연속으로 중복되는 문자열 제거.
public class Code_7 {
    public static void main(String[] args) {
        System.out.println(solution("yzllzy"));
    }

    static public String solution(String cryptogram) {
        String answer = "";

        boolean result = false;

        while (result != true || cryptogram.length() > 0) {
            result = true;
            char[] arr = cryptogram.toCharArray();

            //문자열을 하나씩 꺼내고 앞 문자열과 비교하면서 중복된 문자열이면 공백으로 바꾸고, 없애준다.
            for (int i = 1; i < arr.length; ++i) {
                if (arr[i - 1] == arr[i]) {
                    result = false;
                    arr[i - 1] = arr[i] = ' ';
                    cryptogram = String.valueOf(arr);
                    cryptogram = cryptogram.replaceAll("\\s", "");
                    break;
                }
            }
            if(result==true)
                return cryptogram;
        }
        answer = cryptogram;

        return answer;
    }
}

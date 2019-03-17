package com.company;

//A->Z , Z->A 로 바꿔 출력하기.(소문자도 포함해서)
public class Code_3 {
    public static void main(String[] args) {

        String word ="I love you";

        char[] arr = word.toCharArray();

        for(int i=0; i<arr.length; ++i) {
             if(arr[i]>='A' && arr[i]<='Z'){//대문자일경우
                int a = 155 - arr[i];
                arr[i] = (char) a;
            }else if(arr[i]>='a' && arr[i]<='z'){//소문자일경우
                int a = 219 - arr[i];
                arr[i] = (char) a;
            }
             //공백일 경우 아무 처리도 해주지 않음.
        }

        String result = String.valueOf(arr);
        System.out.println(result);
    }
}
package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Code_6 {
    public static void main(String[] args) throws ParseException {
        String[] logs = {"woni request 09:12:29",
                "brown request 09:23:11",
                "brown leave 09:23:44",
                "jason request 09:33:51",
                "jun request 09:33:56",
                "cu request 09:34:02"};
        System.out.println(Arrays.toString(solution(2000,logs)));
    }

    static public String[] solution(int totalTicket, String[] logs) throws ParseException {


        List<String[]> list = new ArrayList<>();

        List<String> ticketSuccess = new ArrayList<>();

        //시간을 비교하기 위한 포맷형식.
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        Date nowUserTime;

        Date preUserTime;

        //주어진 배열을 list에 넣음.
        for(int i=0; i<logs.length; ++i){
            list.add(logs[i].split(" "));
        }

        for(int i=0; i<list.size(); ++i){
            String[] nowUser = list.get(i);

            //이미 티켓팅에 성공한 후 다시 접속했을 때
            if(ticketSuccess.contains(nowUser[0])){
                break;
            }

            //접속 후 1분을 유지하지 못한 경우
            if(nowUser[1].equals("leave")){
                ticketSuccess.remove(nowUser[0]);
                break;
            }

            //이미 다른 유저가 접속한 상태에서 현재 유저가 접속한 경우(1분차이가 나는지 검사)
            if(i!=0){
                nowUserTime = sdf.parse(nowUser[2]);
                String[] preUser = list.get(i-1);
                preUserTime = sdf.parse(preUser[2]);
                long timeGap = (nowUserTime.getTime()-preUserTime.getTime())/1000;
                if(timeGap<=60)
                    break;
            }

            //위의 조건에 해당하지 않는 티켓팅에 성공한 유저 add.
            ticketSuccess.add(nowUser[0]);
        }

        String[] answer = new String[ticketSuccess.size()];

        ticketSuccess.toArray(answer);

        return answer;
    }
}
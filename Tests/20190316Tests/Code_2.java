package com.company;

//lands는 point의 범위에 존재하지 않고, wells는 point의 범위에 존재해야한다.
public class Code_2 {
    public static void main(String[] args) {
        int[][] lands = { {10, 0, 30, 5}, {0, 30, 20, 50}, {30, 30, 40, 40} };
        int[][] wells = { {15, 15, 25, 25}, {40, 10, 50, 20}};
        int[] point ={10, 10, 30, 30};

        System.out.println("정답"+solution(lands, wells, point));

    }

    static public boolean solution(int[][] lands, int[][] wells, int[] point) {
        boolean answer = true;

        //lands가 point에 포함되는지 검사.
        for(int i=0; i<lands.length; ++i){
            for(int j=0; j<lands[i].length; ++j){
                if(j==0 || j==1){
                    if(lands[i][j]-point[j]<=0){
                    }else
                        return false;
                }else{
                    if(point[j]-lands[i][j]<=0){
                        return true;
                    }else
                        return false;
                }
            }
        }

        //wells가 point에 포함되는지 검사.
        for(int i=0; i<wells.length; ++i){
            for(int j=0; j<wells[i].length; ++j){
                if(j==0 || j==1){
                    if(wells[i][j]-point[j]>=0){
                    }else
                        return false;
                }else{
                    if(point[j]-wells[i][j]>=0){
                        return true;
                    }else
                        return false;
                }
            }
        }


        return answer;
    }
}

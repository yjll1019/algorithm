package algorithm;

/*
    작성일 : 2019년 08월 04일
    내 용 :  직각삼각형
    풀이과정 : 입력된 수를 정렬한 후 피타고라스의 정리 이용
*/


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Code_4153 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			int a;
			int b;
			int c;

			while (true) {
				List<Integer> list = new ArrayList<>();
				String[] nums = br.readLine().split(" ");
				a = Integer.parseInt(nums[0]);
				b = Integer.parseInt(nums[1]);
				c = Integer.parseInt(nums[2]);

				if(a == 0 && b == 0 && c == 0) {
					return;
				}

				list.add(a);
				list.add(b);
				list.add(c);

				if(isRightTriangle(list)) {
					bw.write("right");
					bw.newLine();
				} else {
					bw.write("wrong");
					bw.newLine();
				}
				bw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static boolean isRightTriangle(List<Integer> nums) {
		Collections.sort(nums);
		return Math.pow(nums.get(2), 2) == ((Math.pow(nums.get(0), 2) + Math.pow(nums.get(1), 2)));
	}
}
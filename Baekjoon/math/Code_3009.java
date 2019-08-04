package algorithm;

/*
    작성일 : 2019년 08월 04일
    내 용 :  네 번째 점
    풀이과정 : X좌표, Y좌표 중 개수가 1개인 수를 출력
*/


import java.io.*;
import java.util.*;

public class Code_3009 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			List<Integer> coordinateX = new ArrayList<>();
			List<Integer> coordinateY = new ArrayList<>();

			for (int i = 0; i < 3; i++) {
				String[] coordinate = br.readLine().split(" ");
				int x = Integer.parseInt(coordinate[0]);
				int y = Integer.parseInt(coordinate[1]);
				coordinateX.add(x);
				coordinateY.add(y);
			}

			Collections.frequency(coordinateX, 30);

			removeDuplicateNumber(coordinateX);
			removeDuplicateNumber(coordinateY);

			bw.write(coordinateX.get(0) + " " + coordinateY.get(0));
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void removeDuplicateNumber(List<Integer> coordinateX) {
		int duplicatedValue = findDuplicateNumber(coordinateX);
		coordinateX.removeAll(Arrays.asList(duplicatedValue));
	}

	private static int findDuplicateNumber(List<Integer> coordinateX) {
		for (int i = 0; i < coordinateX.size(); i++) {
			if (Collections.frequency(coordinateX, coordinateX.get(i)) == 2) {
				return coordinateX.get(i);
			}
		}
		throw new IllegalArgumentException();
	}
}
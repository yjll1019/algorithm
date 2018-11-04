package binarySearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 11�� 04��
 * �� �� : �̺� Ž�� - �߷� ����
 */
class Point{
	int next; //����� ����
	int cost; // �ٸ��� �ߵ� �� �ִ� �߷�
	
	public Point(int next, int cost) {
		this.next = next;
		this.cost = cost;
	}
	
	public int getNext() {
		return next;
	}
	public void setNext(int next) {
		this.next = next;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
}

public class Code_1939 {
	
	static boolean[] check;
	static int island1; 
	static int island2;
	static Map<Integer, List<Point>> map ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //���� ����
		
		int m = sc.nextInt(); //�ٸ��� ������ ��Ÿ���� m���� ��
		
		map = new HashMap<Integer, List<Point>>();
				
		for(int i=0; i<=n; ++i) {
			map.put(i, new ArrayList<Point>());
		}
		
		int costMax = 0;
		
		while(m-->0){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int cost = sc.nextInt();
			map.get(a).add(new Point(b, cost));
			map.get(b).add(new Point(a, cost));
			costMax = Math.max(costMax, cost);
		}
		
		island1 = sc.nextInt();
		island2 = sc.nextInt();
		
		//���� �߷��� �������� �̺� Ž��
		int left = 1;
		int right = costMax;

		int result = 0;
		
		while(left<=right) {
			int middle = left + (right-left)/2;
			
			check = new boolean[n+1];
			
			if(go(island1, middle)) {
				result = middle;
				left = middle+1;
			}else {
				right = middle-1;
			}
		}
		System.out.println(result);
	}
	
	static public boolean go(int island, int cost) {
		if(check[island])
			return false;
		
		check[island] = true;
		
		if(island == island2)
			return true;
		
		List<Point> list = map.get(island);
		
		for(int i=0; i<list.size(); ++i) {
			int next = list.get(i).next;
			int c = list.get(i).cost;
			
			if(c >= cost) {
				if(go(next, cost)) {
					return true;
				}
			}
		}
		
		return false;
	}
}

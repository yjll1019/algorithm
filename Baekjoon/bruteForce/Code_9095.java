package bruteForce;

import java.util.Scanner;

/*
 * 작성일 : 2018년 12월 09일
 * 내 용 :  1, 2, 3 더하기
 */
public class Code_9095 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while(n-->0) {
			int sum=0;
			int x = sc.nextInt();
			for(int i1=1; i1<=3; i1++) {
				if(i1==x) {sum++;}
				for(int i2=1; i2<=3; i2++) {
					if(i1+i2==x) {sum++;}
					for(int i3=1; i3<=3; i3++) {
						if(i1+i2+i3==x) {sum++;}
						for(int i4=1; i4<=3; i4++) {
							if(i1+i2+i3+i4==x) {sum++;}
							for(int i5=1; i5<=3; i5++) {
								if(i1+i2+i3+i4+i5==x) {sum++;}
								for(int i6=1; i6<=3; i6++) {
									if(i1+i2+i3+i4+i5+i6==x) {sum++;}
									for(int i7=1; i7<=3; i7++) {
										if(i1+i2+i3+i4+i5+i6+i7==x) {sum++;}									
										for(int i8=1; i8<=3; i8++) {
											if(i1+i2+i3+i4+i5+i6+i7+i8==x) {sum++;}									
											for(int i9=1; i9<=3; i9++) {
												if(i1+i2+i3+i4+i5+i6+i7+i8+i9==x) {sum++;}									
												for(int i10=1; i10<=3; i10++) {
													if(i1+i2+i3+i4+i5+i6+i7+i8+i9+i10==x) {sum++;}									
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}	
			System.out.println(sum);
		}
	}
}

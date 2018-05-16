package study;
/*
 * 작성일자 : 2018년 03월 29일
 * 내 용 : 영어 대소문자와 띄어쓰기로 이루어진 문장에서 단어의 개수를 구하는 코드 작성.(백준1152 참고)
 */
public class Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("study_Word : 이예지");
		String s = "The Curious Case of Benjamin Button";
		
		String []a = s.split(" ");
		
		System.out.println("단어의 개수 :"+a.length);
	}
	//split 메서드 : 매개변수에 regex를 지정하여 그 기준으로 스트링을 나눠 String[] 타입으로 리턴하는 메서드.
}

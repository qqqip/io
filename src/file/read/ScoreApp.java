package file.read;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ScoreApp {
	public static void main(String[] args) throws Exception {

		ArrayList<Score> scoreList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("score.txt");
		FileOutputStream fos2 = new FileOutputStream("ranking.txt");

		while (true) {

			System.out.println("                       ▷메뉴를 선택하세요◁                      ");
			System.out.println("1. 성적정보 등록	2. 성적정보 파일로 저장		3. 성적순으로 파일저장	0.종료");

			int menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {
				System.out.println("이름을 입력하세요: ");
				String name = sc.nextLine();
				System.out.println("국어점수를 입력하세요: ");
				int kor = Integer.parseInt(sc.nextLine());
				System.out.println("영어점수를 입력하세요: ");
				int eng = Integer.parseInt(sc.nextLine());
				System.out.println("수학점수를 입력하세요: ");
				int math = Integer.parseInt(sc.nextLine());

				Score score = new Score();
				score.setName(name);
				score.setKor(kor);
				score.setEng(eng);
				score.setMath(math);

				scoreList.add(score);

			} else if (menu == 2) {
				// 파일로 기록하기
				for (Score s : scoreList) {
					String text = s.getName() + "^" + s.getKor() + "^" + s.getEng() + "^" + s.getMath();
					byte[] bt = text.getBytes();
					fos.write(bt);
					System.out.println("파일이 기록되었습니다.");
				}
				fos.close();

			} else if (menu == 3) {
				
				Collections.sort(scoreList, (t1,t2) -> t2.getTotal() - t1.getTotal());	// 람다식으로 성적순정렬함
				for (Score s : scoreList) {
					String text = s.getName() + "^" + s.getKor() + "^" + s.getEng() + "^" + s.getMath() + "^" + s.getTotal() + System.lineSeparator();
					byte[] bt = text.getBytes();
					fos2.write(bt);
					System.out.println("파일이 기록되었습니다.");
				}
				fos2.close();
					

				
			} else if (menu == 0) {
				break;
			}
		}
	}
}

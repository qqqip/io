package Quizz1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class EmployeeApp {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> employeeList = new ArrayList<>();
		FileOutputStream fs = new FileOutputStream("employee.txt");
		FileOutputStream fs2 = new FileOutputStream("employee2.txt");
		FileOutputStream fs3 = new FileOutputStream("employee3.txt");
		//FileInputStream fis = new FileInputStream("employee");
		int empNo = 0;

		while (true) {
			System.out.println("*******************************************************************");
			System.out.println("1.회원가입	2.저장	3. 가나다순 조회	4. 경력순 조회	0.종료");
			System.out.println("*******************************************************************");
			int menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {
				System.out.println("회원가입을 시작합니다. 이름을 입력하세요:");
				String name = sc.nextLine();
				System.out.println("경력을 입력하세요:");
				String year = sc.nextLine();
				
				Employee emp = new Employee();			
				emp.setName(name);
				emp.setCareer(year);
				emp.setNo(empNo);
				
				employeeList.add(emp);
				empNo ++;				

			} else if (menu == 2) {
				for (Employee e : employeeList) {
				String text = e.getName() + "," + e.getCareer() + System.lineSeparator();
				byte[] b = text.getBytes();
				fs.write(b);
				System.out.println("기록이 저장되었습니다.");
				}
				fs.close();

			} else if (menu == 3) {
				
				Collections.sort(employeeList, (e1,e2) -> e1.getName().compareTo(e2.getName()));
				for (Employee e : employeeList) {
					String text = e.getName() + "," + e.getCareer() + System.lineSeparator();
					byte[] b = text.getBytes();
					fs2.write(b);
					System.out.println("파일이 저장되었습니다.");
					}			
				fs2.close();

			} else if (menu == 4) {
				Collections.sort(employeeList, (e1, e2) -> {return e1.getCareer().compareTo(e2.getCareer());});
				for (Employee e : employeeList) {
					String text = e.getName() + "," + e.getCareer() + System.lineSeparator();
					byte[] b = text.getBytes();
					fs3.write(b);
					System.out.println("파일이 저장되었습니다.");
					}			
				fs3.close();
				
				
			} else if (menu == 0) {
				return;
			}
		}
		

		// 이름순

		// 경력순

	}
}

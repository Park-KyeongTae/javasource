package database2;

import java.util.ArrayList;
import java.util.Scanner;

public class DeptMain {
	public static void main(String[] args) {
		DeptDAO dao = new DeptDAO();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("===============");
			System.out.println("1. 특정부서 조회");
			System.out.println("2. 전체부서 조회");
			System.out.println("3. 새 부서 추가");
			System.out.println("4. 부서 정보 수정");
			System.out.println("5. 부서 정보 삭제");
			System.out.println("6. 종료");
			System.out.println("===============");

			System.out.println("메뉴입력 >> ");
			int no = Integer.parseInt(sc.nextLine());

			switch (no) {
			case 1:
				// 사용자로부터 조회를 원하는 부서코드 입력받기
				System.out.println("부서 코드 입력 >>");
				int deptno = sc.nextInt();

				// 하나 조회
				DeptDTO row = dao.getRow(deptno);
				// DeptDTO 출력
				System.out.println(row);
				break;
			case 2:
				// 전체 조회
				ArrayList<DeptDTO> list = dao.getRows();
				for (DeptDTO deptDTO : list) {
					System.out.print(deptDTO.getDeptno() + "\t");
					System.out.print(deptDTO.getDname() + "\t");
					System.out.println(deptDTO.getLoc() + "\t");
				}
				break;
			case 3: // 새 부서 추가
//				System.out.println("부서번호 >>");
//				deptno = Integer.parseInt(sc.nextLine()); // 70
//				System.out.println("부서명 >>");
//				String dname = sc.nextLine(); // 데이터 베이스
//				System.out.println("지역 >>");
//				String loc = sc.nextLine();
//				System.out.println(dao.insert(deptno, dname, loc) ? "삽입 성공" : "삽입 실패");

				DeptDTO dto = new DeptDTO();
				System.out.println("부서번호 >>");
				dto.setDeptno(Integer.parseInt(sc.nextLine())); // 70
				System.out.println("부서명 >>");
				dto.setDname(sc.nextLine()); // 데이터 베이스
				System.out.println("지역 >>");
				dto.setLoc(sc.nextLine());
				System.out.println(dao.insert(dto) ? "삽입 성공" : "삽입 실패");

				break;
			case 4:
				System.out.println("부서번호 >> ");
				deptno = Integer.parseInt(sc.nextLine());

				System.out.println("1) 부서명 수정 2) 위치 수정 원하는 번호 입력");
				int updateno = Integer.parseInt(sc.nextLine());

				String input = null;
				if (updateno == 1) {
					// 1번 선택시
					System.out.println("새 부서명 입력 >>");
					input = sc.nextLine();
				} else if (updateno == 2) {
					// 2번 선택시
					System.out.println("새 위치 입력 >>");
					input = sc.nextLine();
				}
				System.out.println(dao.update(input, deptno, updateno) ? "수정성공" : "수정실패");

				break;
			case 5:

				System.out.println("삭제 부서 코드 입력 >>");
				deptno = Integer.parseInt(sc.nextLine());

				System.out.println(dao.remove(deptno) ? "삭제 성공" : "삭제 실패");

				break;
			case 6:
				flag = false;
				break;
			default:
				System.out.println("번호 다시 입력해 주세요");
				break;
			}
		}

	}

}

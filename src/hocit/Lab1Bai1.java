package hocit;

import java.util.Scanner;

public class Lab1Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Student's name: ");
		String name = scanner.nextLine();

		System.out.println("ĐTB: ");
		double dTB = scanner.nextDouble();
		System.out.println(name + " co diem = " + dTB);
		System.out.println("Tên sinh viên: " + name);
		System.out.println("Điểm: " + Math.ceil(dTB));
		scanner.close();
	}
}

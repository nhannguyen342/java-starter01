package hocit;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập cạnh: ");
		double a = scanner.nextDouble();
		System.out.println("The tich cua hinh lap phuong la: " + Math.pow(a, 5));
	}
}

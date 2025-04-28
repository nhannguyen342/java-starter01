package hocit;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chiều dài là: ");
		double chieuDai = scanner.nextDouble();

		System.out.println("Chiều rộng là: ");
		double chieuRong = scanner.nextDouble();

		double chuVi = (chieuDai + chieuRong) * 2;

		double dienTich = chieuDai * chieuRong;

		System.out.println("Chu vi: " + chuVi);
		System.out.println("Dien tich: " + dienTich);
		System.out.println("Canh nho nhat " + Math.min(chieuDai, chieuRong));
		scanner.close();
	}
}

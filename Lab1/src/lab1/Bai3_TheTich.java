package lab1;
import java.util.Scanner;
public class Bai3_TheTich {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập cạnh khối lập phương: ");
		double canh = scanner.nextDouble();
		
		//Ta dùng hàm Math.pow(cạnh, số mũ) dùng để tính thể tích vì công thức là: a*a*a
		double theTich = Math.pow(canh, 3);
		
		System.out.printf("Thể tích khối lập phương là: %.2f", theTich);
		
		scanner.close();
	}

}

package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
		String mesaj = "Lütfen bir sayi giriniz";
		System.out.println(mesaj);

		Scanner input = new Scanner(System.in); //kutuphaneden cagirdigimiz hazir scan fonksiyonu
		int sayi = input.nextInt();

		int counter = 0;
		for (int i = 2; i < sayi; i++) {

			counter = 0;
			int mod = sayi % i;

			if (mod == 0) {
				counter++;
			}
			if (counter > 0) {
				break;
				//i artsa da asla kullanicidan alinan sayiya esit olmayacagi icin (i<sayi yazdik) counter 1 bile olsa bu ,girilen sayinin kendisinden
				// baska boleni var demektir. o yüzden girilen sayi asal sayi degildir.for dongusu burada break komutu ile sonlandirilir.
				//eger for dongusunu sartlandirirken i=sayi olana kadar i yi artirsaydik bu if eyleminin sarti counter>1 olmaliydi.
				//cunku bu kendisinden baska boleni oldugu anlamina gelir.
			}
		}

		if (counter > 0) {
			System.out.println("Girdiginiz sayi asal bir sayi degildir.");
		}

		else {
			System.out.println("Girdiginiz sayi asal bir sayidir.");

		}


	}
}

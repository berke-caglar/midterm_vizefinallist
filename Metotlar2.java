import java.util.List;
import java.util.Scanner;

public class Metotlar2 {

    public static void menu() {
        System.out.println("----- MENÜ -----");
        System.out.println("1. İsim, vize ve final notu girişi yap");
        System.out.println("2. Öğrencilerin1 isimlerini, vize ve final notlarını listele");
        System.out.println("3. Öğrencilerin başarı durumunu göster");
        System.out.println("4. Ortalama :");
        System.out.print("Seçiminizi girin: ");
    }

    public static void veriGir(Scanner sc, List<String> isim, List<Integer> vize, List<Integer> final1) {
        // TODO Auto-generated method stub
        System.out.println("iSİM GİRİNİZ - ");
        isim.add(sc.next());
        System.out.println("Vize Notu GİRİNİZ - ");
        vize.add(sc.nextInt());
        System.out.println("Final Notu GİRİNİZ - ");
        final1.add(sc.nextInt());
    }

    public static void Liste(List<String> isim, List<Integer> vize, List<Integer> final1, List<String> bDurum) {
        // TODO Auto-generated method stub
        
        for (int i = 0; i < isim.size(); i++) {
            yazdır(i,vize.get(i),final1.get(i),bDurum);


        }

    }

    private static void yazdır(int i, Integer vize2, Integer final12, List<String> bDurum) {
        // TODO Auto-generated method stub
        System.out.println("İsmi : "+i);
		System.out.println("Vize Notu : "+vize2);
		System.out.println("Final Notu : "+final12);
	
		System.out.println("--------------------------");
    }

    public static void basariDurumuHesapla(List<String> isim, List<Integer> vize, List<Integer> final1) {
        // TODO Auto-generated method stub
        for (int i = 0; i < isim.size(); i++) {
            double ortalama = (vize.get(i) * 0.4) + (final1.get(i) * 0.6); // Ortalama hesapla
            String durum = (ortalama >= 50) ? "Geçti" : "Kaldı"; // Geçme koşulunu kontrol et
            System.out.println(isim.get(i) + " isimli öğrencinin başarı durumu: " + durum);
        }
    }

    public static void ortalama(List<Integer> vize, List<Integer> final1) {      
        for (int j = 0; j < vize.size(); j++) {
            double ortalama = (vize.get(j) * 0.4) + (final1.get(j) * 0.6); // Ortalama hesapla
            System.out.println("Kişinin ortalaması : "+ ortalama);
        }
            
       
            
        
    }
}





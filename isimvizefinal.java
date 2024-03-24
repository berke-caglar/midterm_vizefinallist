import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class isimvizefinal {

        public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
            List<String> isim = new ArrayList<String>();
            List<Integer> vize = new ArrayList<Integer>();
            List<Integer> final1 = new ArrayList<Integer>();
            List<String> bDurum = new ArrayList<String>();
            byte menu;
    
            for(;;){
                Metotlar2.menu();
                menu = sc.nextByte();
                switch (menu) {
                        case 1:
                        Metotlar2.veriGir(sc,isim,vize,final1);
                        
                        break;
                        case 2:
                        Metotlar2.Liste(isim,vize,final1,bDurum);
                        
                        break;
                        case 3:
                        Metotlar2.basariDurumuHesapla(isim, vize, final1);
                        break;
                        
                        case 4:
                            Metotlar2.ortalama(vize,final1);
                        break;
                        case 5:
                        break;

                    default:
                        break;
                }
    
    
    
    
    
    
            }
    
    }
}

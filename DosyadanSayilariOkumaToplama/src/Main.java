import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        /*
        file isimli yeni bir fileReader nesnesi oluşturarak
        number.txt isimli dosyaya ulaşıyoruz. Ardından file
        dosyasını BufferedReader sınıfı sayesinde okuyoruz. Gelen her
        satırdaki veriyi while döngüsünde yazdırıyoruz.
        Ardından result isimli bir integer değişken oluşturup 0
        değerini atıyoruz. parseInt() yardımıyla number.txt'nin
        satırlarındaki verileri String'den integer'a çevirip
        toplama işlemini yapıyoruz.
         */
        try {
            FileReader file = new FileReader("number.txt");
            BufferedReader input = new BufferedReader(file);
            String line;
            int result = 0;
            while ((line = input.readLine()) != null){
                int lineNumber = Integer.parseInt(line);
                System.out.println(line);
                    result += lineNumber;
            }
            input.close();
                System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
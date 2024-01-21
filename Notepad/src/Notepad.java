import java.io.*;
import java.util.Scanner;

public class Notepad {
    public Notepad(){}
    /*
    run() metoduyla programı çalıştırıyoruz.
    */
    public void run (){
        read();
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Metin Giriniz : ");
        String text = input.nextLine();
        print(text);
        read();
    }

    /*
    print() metoduyla notes.txt dosyasına yazdırıyoruz.
     */

    public void print(String text){
        try {
            FileWriter fileWriter = new FileWriter("notes.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(text);
            printWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    /*
    read() metofuyla programın son çıktısını okuyoruz.
     */

    public void read(){
        try {
            FileReader fileReader = new FileReader("notes.txt");
            BufferedReader input = new BufferedReader(fileReader);
            String line;
            while ((line = input.readLine()) != null){;
                System.out.println(line);
            }
            input.close();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }

}

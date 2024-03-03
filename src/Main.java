import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> takimlar = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Eklenecek takımları giriniz:");
        System.out.println("(Yeteri kadar ekleyince 'q')");

        while (true) {
            String teamName = scanner.nextLine();

            if (teamName.equalsIgnoreCase("q")) {
                break;
            }
            takimlar.add(teamName);
            System.out.println("'" + teamName + "' takımı listeye eklendi.");
        }

        // Tek sayıda takım girildiğinde "Bay" takımını ekleyin
        if (takimlar.size() % 2 != 0) {
            takimlar.add("Bay");
            System.out.println("'Bay' takımı eklendi.");
        }

        int haftaSayisi = takimlar.size() - 1;
        int yarisayi = takimlar.size() / 2;

        // Her hafta ev sahibi takımın değişmesi için ilk takımı sabit alıp, geri kalanı kaydırıyoruz
        String ilkTakim = takimlar.remove(0);
        takimlar.add(ilkTakim);

        for (int hafta = 0; hafta < haftaSayisi; hafta++) {
            System.out.println((hafta + 1) + ". Hafta:");

            // Her hafta ev sahibi takımın değişmesi sağlanır
            for (int i = 0; i < yarisayi; i++) {
                String evSahibi = takimlar.get(i);
                String deplasman = takimlar.get((takimlar.size() - 1) - i); // Son sıradaki takımlar deplasman olur

                if (!evSahibi.equals(deplasman)) {
                    System.out.println(evSahibi + " (Ev Sahibi) vs " + deplasman + " (Deplasman)");
                }
            }

            // Takımları döndür
            takimlar.add(1, takimlar.remove(takimlar.size() - 1));
        }
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<String> takimlar = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Eklenecek takımları giriniz:");
        System.out.println("(Yeteri kadar ekleyince 'q')");

        while (true){
            System.out.println();
            String teamName = scanner.nextLine();

            if (teamName.equalsIgnoreCase("q")){
                break;
            }
            takimlar.add(teamName);
            System.out.println("'" + teamName + "' takımı listeye eklendi.");
        }
        System.out.println("Girilen takımlar:");
        for (String team : takimlar) {
            System.out.println(team);
        }
        if (takimlar.size() %2 !=0){
            takimlar.add("Bay");
        }

        List<String> takimlar2 = new ArrayList<>();
        takimlar2.addAll(takimlar);

        int weekNum = (takimlar.size() - 1)*2;
        int halfSize = takimlar.size()/2;


        for (int week=0 ; week<weekNum ; week++){
            System.out.println(week + ". Hafta");
            for (int i=1 ; i<halfSize ; i++){
                System.out.println(takimlar.get(i) + " vs " + takimlar2.get(takimlar2.size()-i-1));
            }
        }






    }
}
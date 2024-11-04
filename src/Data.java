import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Data {
    private static ArrayList<Passager> listePassagers = new ArrayList<>();

    public static void lireFichier() {
        try {
            File file = new File("resources/titanic.dbf");
            Scanner scan = new Scanner(file);

            // Saut des 5 premieres lignes
            for (int i = 0; i < 5; i++) {
                scan.nextLine();
            }

            // Récuperation des données de la ligne
            while (scan.hasNext()) {
                listePassagers.add(new Passager(scan.next(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt()));
            }

        } catch (FileNotFoundException e) {
            System.err.println("Erreur:" + e.getMessage());
        }
    }

}

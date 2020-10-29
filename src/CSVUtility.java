import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class CSVUtility {

    /**
     * This method will read a csv file and return a TreeMap of the make
     * and models of vehicles
     */
    public static TreeMap<String, TreeSet<String>> getMakeAndModel()
    {
        TreeMap<String, TreeSet<String>> makesAndModels = new TreeMap<>();
        File csvFile = new File("./src/carNames.csv");
        try {
            Scanner scanner = new Scanner(csvFile);

            while (scanner.hasNext())
            {
                String[] row = scanner.nextLine().split(",");
                String make = row[0];
                String model = row[1];

                if (!makesAndModels.keySet().contains(make))
                {
                    makesAndModels.put(make, new TreeSet<String>());
                }
                makesAndModels.get(make).add(model);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return makesAndModels;
    }
}

import java.util.TreeMap;
import java.util.TreeSet;

public class Car {
    private String make, model;
    private int year;
    private static TreeMap<String, TreeSet<String>> makesAndModels =
            CSVUtility.getMakeAndModel();

    public Car(String make, String model, int year) {
        setMake(make);
        setModel(model);
        setYear(year);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (makesAndModels.keySet().contains(make))
            this.make = make;
        else
            throw new IllegalArgumentException("The make is not listed in: "+makesAndModels.keySet());
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (makesAndModels.get(make).contains(model))
            this.model = model;
        else
            throw new IllegalArgumentException("Model must be in the set: "+makesAndModels.get(make));
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

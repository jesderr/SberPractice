import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<CityDirectory> listOfCity = new ArrayList<>();
        DirectoryMethods performer = new Performer();

        try {
            String path = "D:\\v\\repo\\intershipSber\\taskJavaSberTest.csv";
            BufferedReader reader = new BufferedReader
                    (new InputStreamReader(new FileInputStream(path), "Windows-1251"));
            String line;
            Parser csvParser = new CSVLineParser();
            while ((line = reader.readLine()) != null) {
               CityDirectory cityDirectory = csvParser.Parse(line);
                listOfCity.add(cityDirectory);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

//        Map<String, Long> mapMaxRegions = performer.maxRegion(listOfCity);
//        mapMaxRegions.entrySet()
//                .forEach(System.out::println);


//        performer.sortingOfDistrict(listOfCity);


//        performer.sortingOfName(listOfCity);

        for (CityDirectory cityDirectory : listOfCity) {
            performer.print(cityDirectory);
        }


//        performer.maxOfPeople(listOfCity);
    }
}



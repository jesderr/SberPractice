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

//Сортировка списка городов по федеральному округу и наименованию
// города внутри каждого федерального округа в алфавитном порядке по убыванию с учетом регистра;
//        performer.sortingOfDistrict(listOfCity);

//Сортировка списка городов по наименованию в алфавитном порядке по убыванию без учета регистра;
//        performer.sortingOfName(listOfCity);

        for (CityDirectory cityDirectory : listOfCity) {
            performer.print(cityDirectory);
        }

//найти индекс элемента и значение с наибольшим количеством жителей города.
//        performer.maxOfPeople(listOfCity);
    }
}



import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Performer implements DirectoryMethods {
    @Override
    public void print(CityDirectory city) {
        System.out.println("City{name='" + city.getName() + "',region='" + city.getRegion() +
                "',district=" + city.getDistrict() + "',population='" + city.getPopulation() +
                "',foundation='" + city.getFoundation() + "'}");
    }

    @Override
    public void sortingOfName(List<CityDirectory> directoryList) {
        directoryList.sort((city1, city2) ->
                city1.getName().compareToIgnoreCase(city2.getName()));
    }

    @Override
    public void sortingOfDistrict(List<CityDirectory> directoryList) {
        Collections.sort(directoryList, new Comparator<CityDirectory>() {
            @Override
            public int compare(CityDirectory city1, CityDirectory city2) {
                int districtComparison = city1.getDistrict().compareTo(city2.getDistrict());
                if (districtComparison != 0) {
                    return districtComparison;
                }
                return city1.getName().compareTo(city2.getName());
            }
        });
    }

    @Override
    public void maxOfPeople(List<CityDirectory> directoryList) {
        long max = 0;
        int index = 0;
        for (CityDirectory cityDirectory : directoryList) {
            if (cityDirectory.getPopulation() > max) {
                max = cityDirectory.getPopulation();
                index = cityDirectory.getPosition();
            }
        }
        System.out.printf("[%d] = %d",index, max);
    }

    @Override
    public Map<String, Long> maxRegion(List<CityDirectory> directoryList) {
       return  directoryList.stream()
                .collect(Collectors.groupingBy(CityDirectory::getRegion, Collectors.counting()));
    }
}

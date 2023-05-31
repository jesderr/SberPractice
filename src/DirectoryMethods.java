import java.util.List;
import java.util.Map;

public interface DirectoryMethods {
    void print(CityDirectory city);

    void sortingOfName(List<CityDirectory> directoryList);
    void sortingOfDistrict(List<CityDirectory> directoryList);

    void maxOfPeople(List<CityDirectory> listOfCity);

    Map<String, Long> maxRegion(List<CityDirectory> directoryList);
}

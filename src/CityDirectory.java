import java.util.Date;
import java.util.List;

public class CityDirectory {
    private int position;
    private String name;
    private String region;
    private String district;
    private int population;
    private String foundation;

    public CityDirectory(){

    }

    public CityDirectory(int position, String name, String region,
                         String district, int population, String foundation) {
        this.position = position;
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public int getPosition() {
        return this.position;
    }

    public String getName() {
        return this.name;
    }

    public String getRegion() {
        return this.region;
    }

    public String getDistrict() {
        return this.district;
    }

    public int getPopulation() {
        return this.population;
    }

    public String getFoundation() {
        return this.foundation;
    }
}

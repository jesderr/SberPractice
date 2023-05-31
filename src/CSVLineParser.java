public class CSVLineParser implements Parser{
    @Override
    public CityDirectory Parse(String csvLine) {

        String[] tokens = csvLine.split(";");

        CityDirectory cityDirectory = new CityDirectory();
        cityDirectory.setPosition(Integer.parseInt(tokens[0]));
        cityDirectory.setName(String.valueOf(tokens[1]));
        cityDirectory.setRegion(String.valueOf(tokens[2]));
        cityDirectory.setDistrict(String.valueOf(tokens[3]));
        cityDirectory.setPopulation(Integer.parseInt(tokens[4]));
        if(tokens.length < 6){
            cityDirectory.setFoundation(" ");
        }else{
            cityDirectory.setFoundation(String.valueOf(tokens[5]));
        }
        return cityDirectory;
    }
}

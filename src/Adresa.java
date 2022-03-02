public class Adresa {
    /// country, region, city, postalcode.
    private String country;
    private String region;
    private String city;
    private int postalcode;

    public Adresa(String country, String region, String city, int postalcode){
        this.country = country;
        this.region = region;
        this.city = city;
        this.postalcode = postalcode;
    }
    public String getCountry(){
        return country;
    }
}

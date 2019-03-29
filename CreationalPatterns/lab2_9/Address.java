package lab2_9;

public class Address {
    private String country;
    private String province;
    private String city;

    public Address(String country,String province,String city){
        this.country=country;
        this.province=province;
        this.city=city;
    }

    public String getCountry() {
        return country;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String toString() {
        return "Address[city=" + city + ", country=" + country + ", province="
                + province +"]";
    }

}

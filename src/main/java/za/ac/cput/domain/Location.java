package za.ac.cput.domain;

public class Location {
    private String locationID;
    private String province;
    private String country;

    private Location(Builder builder){
        this.locationID = builder.locationID;
        this.province = builder.province;
        this.country = builder.country;
    }

    public String getLocationID() {
        return locationID;
    }

    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Location{" +
                "locationID='" + locationID + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public static class Builder{
        private String locationID;
        private String province;
        private String country;

        public Builder setLocationID(String locationID) {
            this.locationID = locationID;
            return this;
        }

        public Builder setProvince(String province) {
            this.province = province;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder copy(Location location){
            this.locationID = location.locationID;
            this.province = location.province;
            this.country = location.country;
            return this;
        }

        public Location build(){
            return new Location(this);
        }
    }
}

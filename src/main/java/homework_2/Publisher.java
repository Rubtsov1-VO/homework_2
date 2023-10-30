package homework_2;

class Publisher {
    private String namePub;
    private String city;

    public String getNamePub() {
        return namePub;
    }

    public String getCity() {
        return city;
    }

    public void setNamePub(String namePub) {
        if (namePub != null && !namePub.isEmpty()) {
            this.namePub = namePub;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setCity(String city) {
        if (city != null && !city.isEmpty()) {
            this.city = city;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
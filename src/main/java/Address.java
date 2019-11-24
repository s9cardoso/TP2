public class Address {

    private String streetname;

    private int doorno, postalcode;

    public Address(String streetname, int doorno, int postalcode) {
        this.streetname = streetname;
        this.doorno = doorno;
        this.postalcode = postalcode;
    }

    public String getStreetname() {
        return streetname;
    }

    public int getDoorno() {
        return doorno;
    }

    public int getPostalcode() {
        return postalcode;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    public void setDoorno(int doorno) {
        this.doorno = doorno;
    }

    public void setPostalcode(int postalcode) {
        this.postalcode = postalcode;
    }
}

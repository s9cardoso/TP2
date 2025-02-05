public class User {

    private String name, email, username, password;
    private Address endereco1;

    public User(String name, String email, String username, String password,  Address endereco1){
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.endereco1 = endereco1;
    }



    public String getStreetName() {
        return endereco1.getStreetname();
    }

    public String getName() {
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getUsername(){
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

package enkapsulasi_user;

public class User {

    private String username;
    private String password;
    private int id;
    private boolean status;

    public User(String username, String password, int id, boolean status) {
        this.username = username;
        this.password = password;
        this.id = id;
        this.status = status;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getStatus(){
        return status ? "menikah" : "Belum Menikah";
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
 

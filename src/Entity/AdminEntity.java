package entity;

public class AdminEntity {
    private String nama, id, password;
    
    public AdminEntity(String nama, String id, String password) {
        this.nama = nama;
        this.id = id;
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    } 
}
package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userID;
    @Column(name = "user_account")
    private String userAccount;
    //можно не указывать Column name, если оно совпадает с названием столбца в таблице
    //@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)

    public Users() {
    }

    public String getId() {
        return userID;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String name) {
        this.userAccount = name;
    }


    @Override
    public String toString() {
        return "models.User{" +
                "userID=" + userID +
                ", userAccount='" + userAccount + "'}";
    }
}
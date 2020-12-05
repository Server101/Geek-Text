package Group1.GeekTextBookstore.Model;

import javax.persistence.Entity;

//import java.sql.Date;

//import javax.annotation.Generated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class login {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String user_name;
    private String user_email;
    private String wish_list_name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getWish_list_name() {
        return wish_list_name;
    }

    public void setWish_list_name(String wish_list_name) {
        this.wish_list_name = wish_list_name;
    }

}

package Group1.GeekTextBookstore.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


//import org.springframework.data.annotation.Id;

@Entity
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String user_name;
    private String user_email;
    private String user_phone;
    private String user_address;
    private String user_wishlist;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public String getUser_wishlist() {
        return user_wishlist;
    }

    public void setUser_wishlist(String user_wishlist) {
        this.user_wishlist = user_wishlist;
    }
    
	
		
    


}
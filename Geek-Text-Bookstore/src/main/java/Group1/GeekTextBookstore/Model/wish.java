package Group1.GeekTextBookstore.Model;

//import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


//import org.springframework.data.annotation.Id;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class wish {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
    private String user_name;
    private String user_email;
    private String wish_list_name;
    private String item1;
    private String item2;
    private String item3;
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
	public String getItem1() {
		return item1;
	}
	public void setItem1(String item1) {
		this.item1 = item1;
	}
	public String getItem2() {
		return item2;
	}
	public void setItem2(String item2) {
		this.item2 = item2;
	}
	public String getItem3() {
		return item3;
	}
	public void setItem3(String item3) {
		this.item3 = item3;
	}

    


}

package Springboot.CEN4010.JWTConfiguration;

import Springboot.CEN4010.controller.RequestPojo.LoginRequest;
import Springboot.CEN4010.model.User;
import Springboot.CEN4010.service.UserServices.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;


@Configuration
public class AuthManager {
	@Autowired
    UserService userService;
	 private static final Logger logger = LoggerFactory.getLogger(AuthManager.class);
	 public Authentication authenticate(UsernamePasswordAuthenticationToken authentication, LoginRequest loginRequest) throws AuthenticationException {
	    String mobile = authentication.getPrincipal() + "";
	    String password = authentication.getCredentials() + "";
	    User user;
		try {
			logger.info("user is going to validate(AuthManager) "+mobile);
			if(userService == null) {
				 logger.info("user found the error");
				 throw new BadCredentialsException("1001");
			}
			user = userService.findByMobile(mobile);
			 if (user == null) {
			        throw new BadCredentialsException("User Not found!!");
			  }
			 
			 logger.info("from authentication "+password+" from db "+user.getPassword());
			 if(!this.passwordMatch(password, user.getPassword())) {
				 logger.info("Password is wrong for user .."+user.getEmail()+"-- "+user.getMobile());
				 throw new BadCredentialsException("Mobile or password is wrong.");
			 } 

		        return new UsernamePasswordAuthenticationToken(new UserPrincipal(user.getId(), mobile, password), password);
		} catch (Exception e) {
			logger.info("Error",e);
			 throw new BadCredentialsException(e.getMessage());
		}
	   
	} 
	 private Boolean passwordMatch(String rawPassword,String from_db_encoded) {
		 return rawPassword.equals(from_db_encoded);
		// return BCrypt.checkpw(rawPassword.toString(),from_db_encoded);	 
	 }
	 
}

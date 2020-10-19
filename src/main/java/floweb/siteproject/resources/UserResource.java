package floweb.siteproject.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import floweb.siteproject.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	public UserResource() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "999334", "mariazinah");
		return ResponseEntity.ok().body(u);}

}

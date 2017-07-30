package net.sj.slipp.web.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Setter;

@Setter
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false, length=20)
	private String userId;
	
	private String password;
	private String userName;
	private String email;
	
	
	@Override
	public String toString() {
		return "User [" 
				+ "id=" + id 
				+ "userId=" + userId 
				+ "userId=" + userId 
				+ ", password=" + password 
				+ ", userName=" + userName 
				+ ", email=" + email
				+ "]";
	}


	public void update(User updatedUser) {
		this.userName=updatedUser.userName;
		this.password=updatedUser.password;
		this.email=updatedUser.email;
	}
	
}

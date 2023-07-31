package com.example.librarymanagement.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="libraryuser")
public class LibraryUser {
	@Id
	@SequenceGenerator(name = "LIBUSER_SEQ", sequenceName = "libuser_seq", initialValue = 1, allocationSize = 100)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LIBUSER_SEQ")
	private long id;
	private String name;
	private String gender;
	private String email;
	private long phno;


	

	
	

}

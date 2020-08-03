package com.example.demoone.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Getter
//@Setter
//@ToString
@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
//@RequiredArgsConstructor
public class Employee  {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   
	private int id;
   
	private  String password;

	
}


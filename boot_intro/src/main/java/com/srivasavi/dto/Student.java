package com.srivasavi.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "table_student")
public class Student {
	
	@Id
	@Column(name = "s_id")
	private String studentId;
	@Column(nullable = false, length = 36)
	private String password;
	private String name;

}

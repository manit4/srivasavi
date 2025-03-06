package com.srivasavi.dto;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Size;
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
	@Size(min = 9, message = "Size should not be less than 9")
	private String password;
	@NotNull
	private String name;

}

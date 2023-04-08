package edu.stm.shop.model;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto implements Serializable{
	
	private Long CategoryId;
	@NotEmpty
	@Length(min = 5)
	private String name;
	
	private Boolean isEdit = false;
	

}

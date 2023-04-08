package edu.stm.shop.model;

import java.sql.Date;

import org.springframework.web.multipart.support.MultipartFilter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProductDto  {
	
	private Long productId;
	
	private String name;
	
	private int quantity;
	
	private double unitPrice;
	
	private String image;
	
	
	private MultipartFilter imaFilter;
	
	
	private String description;
	
	private double discount;
	
	private Date enteredDate;
	
	private short status;
	
	private Long categoryId;
	
}
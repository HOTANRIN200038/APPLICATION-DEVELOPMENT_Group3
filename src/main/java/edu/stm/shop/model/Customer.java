package edu.stm.shop.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	
    private int customerId;
	
	private String name;
	
	private String email;
	
	private String password;
    
    private String phone;
    
	private Date registerdDate;
    
	private short status;

}

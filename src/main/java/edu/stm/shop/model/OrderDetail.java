package edu.stm.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetail {
	private int OrderDeatailId;
	
	
	private int orderId;
	
	
	private int productId;
	
	
	private int quantity;
	
	
	private double unitPrice;

}

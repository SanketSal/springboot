package com.rajtech;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Product {
	@NotNull (message="Product Id is required")
	private int pid;
	@NotNull (message="Product Name is required")
	private String pname;
	@NotNull (message="Product Price is required")
	private int price;
}

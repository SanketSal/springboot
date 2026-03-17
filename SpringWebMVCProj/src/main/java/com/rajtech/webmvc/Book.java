package com.rajtech.webmvc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {
	private int bid;
	private String bname;
	private int price;

}

package com.springboot.jdbc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data //@Setter, @Getter and @ToString
public class Account {
	private int accountNum;
	private String accountType;
	private int accountBalance;
}

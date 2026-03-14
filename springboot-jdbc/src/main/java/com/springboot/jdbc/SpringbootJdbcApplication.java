package com.springboot.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootJdbcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootJdbcApplication.class, args);
		AccountDao dao = context.getBean(AccountDao.class);
		/*Account acct = new Account();
		acct.setAccountNum(103);
		acct.setAccountType("Current");
		acct.setAccountBalance(75000);
		dao.createAccount(acct);*/
		/*List<Map<String,Object>> accountList = dao.getAllAccounts();
		for(Map acct : accountList)
		{
			System.out.println(acct.get("account_num")+" "+acct.get("account_type")+" "+acct.get("account_balance"));
		}*/
		//dao.updateAccount(103, 850000);
		dao.deleteAccount(103);
	}

}

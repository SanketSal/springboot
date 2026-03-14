package com.springboot.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class AccountDaoImpl implements AccountDao {
	@Autowired // adds the setters automatically
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void createAccount(Account acct) {
		String SQL = "insert into account values (?,?,?)";
		jdbcTemplate.update(SQL, acct.getAccountNum(), acct.getAccountType(), acct.getAccountBalance());
		System.out.println("Account Created");
				
	}

	@Override
	public void updateAccount(int accountNum, int accountBalance) {
		String SQL = "update account set account_balance=? where account_num=?";
		jdbcTemplate.update(SQL, accountBalance,accountNum);
		System.out.println("Account Updated");
	}

	@Override
	public void deleteAccount(int accountNum) {
		String SQL = "delete from account where account_num=?";
		jdbcTemplate.update(SQL,accountNum);
		System.out.println("Account Deleted");
	}

	@Override
	public List<Map<String, Object>> getAllAccounts() {
		String SQL = "select * from account";
		return jdbcTemplate.queryForList(SQL);
	}

}
 
package club.lunarcat.dao.impl;

import club.lunarcat.dao.IAccount;
import club.lunarcat.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @aothor cds
 * @create 2019/10/9 - 13:15
 */
public class AcccountImpl implements IAccount {
	private QueryRunner runner;
	@Override
	public List<Account> findAll() {
		try{
			return runner.query("select * from account",new BeanListHandler<Account>(Account.class));
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public Account findById(Integer id) {

		try{
			return runner.query("select * from account where id = ? ",new BeanHandler<Account>(Account.class),id);
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void update(Account account) {

		try{
			runner.update("update account set name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public void setRunner(QueryRunner runner) {
		this.runner = runner;
	}

	public QueryRunner getRunner() {
		return runner;
	}
}

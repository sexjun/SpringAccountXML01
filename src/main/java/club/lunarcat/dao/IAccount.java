package club.lunarcat.dao;

import club.lunarcat.domain.Account;

import java.util.List;

/**
 * @aothor cds
 * @create 2019/10/9 - 13:12
 */
public interface IAccount {
	 List<Account> findAll();
	 Account findById(Integer id);
	 void update(Account account);

}

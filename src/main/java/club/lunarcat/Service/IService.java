package club.lunarcat.Service;

import club.lunarcat.domain.Account;

import java.util.List;

/**
 * @aothor cds
 * @create 2019/10/9 - 13:21
 */
public interface IService {
	List<Account> findAll();
	Account findById(Integer id);
	void update(Account account);
}

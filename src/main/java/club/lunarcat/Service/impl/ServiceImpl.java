package club.lunarcat.Service.impl;



import club.lunarcat.Service.IService;
import club.lunarcat.dao.IAccount;
import club.lunarcat.domain.Account;

import java.util.List;

/**
 * @aothor cds
 * @create 2019/10/9 - 13:23
 */
public class ServiceImpl implements IService {

	private IAccount iAccount;
	@Override
	public List<Account> findAll() {
		return iAccount.findAll();
	}

	@Override
	public Account findById(Integer id) {
		return iAccount.findById(id);
	}

	public void setiAccount(IAccount iAccount) {
		this.iAccount = iAccount;
	}

	@Override
	public void update(Account account) {
		iAccount.update(account);
	}
}

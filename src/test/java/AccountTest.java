import club.lunarcat.dao.IAccount;
import club.lunarcat.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @aothor cds
 * @create 2019/10/9 - 14:08
 */

@RunWith(SpringJUnit4ClassRunner.class)	// 可以创建容器
@ContextConfiguration(locations = "classpath:bean.xml")	// 加载配置文件
public class AccountTest {

	@Autowired
	private IAccount as;

	@Test
	public void testFindALL(){
		List<Account> all = as.findAll();
		for(Account a:all){
			System.out.println("a = " + a.toString());
		}
	}
}

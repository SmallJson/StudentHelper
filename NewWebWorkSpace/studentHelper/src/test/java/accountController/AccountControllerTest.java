package accountController;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.ty.account.bean.Account;
import com.ty.account.bean.AccountDetails;
import com.ty.account.controller.AccountController;

import studentHelper.BaseJunit4Test;

public class AccountControllerTest extends BaseJunit4Test{
	@Autowired
	AccountController accountController;
	//注册功能的单元测试代码
	@Test
	@Rollback(false)
	public void testRegister(){
		Account user  = new Account();
		user.accountName ="jasonTu";
		user.accountPassword = "hello";
		System.out.println(accountController.registerAccount(user));
	}
	//注册功能的单元测试代码
	@Test
	@Rollback(false)
	public void testLogin(){
		Account user  = new Account();
		user.accountName ="jasonTu";
		user.accountPassword = "hello";
		System.out.println(accountController.loginAccount(user));
	}
	//注册个人信息功能的单元测试代码
	@Test
	@Rollback(false)
	public void testRegisterDetail(){
		AccountDetails details = new AccountDetails();
		details.token="44f09d62814048709c2cdf9f410091b0";
		details.detailImage="aa.jpg";
		details.detailMail="tuyin1995@163.com";
		details.detailWord="晴天你好";
		details.detailName="遇见阳光涂涂";
		System.out.println(accountController.registerAccountDetail(details));
	}
	
}	

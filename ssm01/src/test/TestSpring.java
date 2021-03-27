import com.itheima.ssm.domain.Account;
import com.itheima.ssm.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService accountService = ac.getBean("accountService", IAccountService.class);
        accountService.findAll();
        accountService.saveAccount(new Account());
    }

}

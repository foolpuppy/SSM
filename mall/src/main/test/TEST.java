import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.wigon.utils.emailSender.JavaMailUtil;
import top.wigon.utils.snowflake.RecordNoUtils;

/**
 * @fileName: TEST
 * @author: L
 * @date: 2019/6/3 10:25
 * @description:
 * @history: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class TEST {
	@Test
	public void emailTest() {
		JavaMailUtil.sendToEmail("alience98@gmail.com");
	}

	@Test
	public void snowFlakeGen() {
		System.out.println(RecordNoUtils.getInstance().get());
	}

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		for (String beanDefinitionName : ac.getBeanDefinitionNames()) {
			System.out.println(beanDefinitionName);
		}
	}
}

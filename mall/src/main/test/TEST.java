import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.wigon.dao.ItemMapper;
import top.wigon.utils.emailSender.JavaMailUtil;
import top.wigon.utils.snowflake.RecordNoUtils;

import java.util.*;

/**
 * @fileName: TEST
 * @author: L
 * @date: 2019/6/3 10:25
 * @description:
 * @history: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class TEST {
	@Autowired
	ItemMapper itemMapper;

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

	@Test
	public void ensureCap() {
		List<String> l1 = new ArrayList<>(1);
		l1.add("1");
		l1.add("2");
		Vector<Integer> ve = new Vector<>();
		ve.add(1);
		ve.add(1);
		ve.add(1);
		ve.add(7);
		ve.add(9);
//		ve.forEach(System.out::println);
		Map<String, String> vs = new HashMap<>(1);
		vs.put("abc", "bcd");
		vs.put("acc", "bcd");
		vs.put("ccc", "as");
		vs.put(null, null);
		vs.put(null, "6");
		vs.put(null, null);
		vs.forEach((k, v) -> System.out.println(k + "-" + v));
		System.out.println(2 << 8);
	}

	@Test
	public void ItemMapper() {
		System.out.println(itemMapper.selectByPrimaryKey(1));
	}
}

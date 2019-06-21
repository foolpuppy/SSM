import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.wigon.dao.DeliveryMapper;
import top.wigon.dao.ItemMapper;

/**
 * @fileName: MapperTest
 * @author: L
 * @date: 2019/6/5 14:07
 * @description:
 * @history: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@Slf4j
public class MapperTest {
	@Before
	public void init() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

	}

	@Autowired
	ItemMapper itemMapper;
	@Autowired
	DeliveryMapper deliveryMapper;

	@Test
	public void ItemMapper() {
//		log.info(itemMapper.load(1000000256).toString());
		log.info(itemMapper.loadByCategory("笔记本电脑").toString());
	}
}

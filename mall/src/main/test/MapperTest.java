import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.wigon.dao.DeliveryMapper;
import top.wigon.dao.ItemMapper;
import top.wigon.dao.OrdersMapper;
import top.wigon.dao.ShopperMapper;
import top.wigon.pojo.Delivery;


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
//		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");

	}

	@Autowired
	ItemMapper itemMapper;
	@Autowired
	OrdersMapper orderMapper;
	@Autowired
	ShopperMapper shopperMapper;
	@Autowired
	DeliveryMapper deliveryMapper;

	@Test
	public void ItemMapper() {
		log.info(itemMapper.selectByPrimaryKey(1).toString());
	}

	@Test
	public void OrderMapper() {
//		orderMapper.selectByPrimaryKey(1);
		log.info(orderMapper.selectByPrimaryKey(1).toString());
//		log.info();
	}

	@Test
	public void ShooperMapper() {
		log.info(shopperMapper.selectByPrimaryKey(1).toString());
	}

	@Test
	public void DeliveryMapper() {
		log.info(deliveryMapper.selectByPrimaryKey(1).toString());
	}
}

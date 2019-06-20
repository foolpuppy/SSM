package Factory;

/**
 * @fileName: Factory.FactoryTest
 * @author: L
 * @date: 2019/6/16 14:37
 * @description:
 * @history: \n
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class FactoryTest {
	public static void main(String[] args) {
		Shape shape=Factory.getShape("Factory.三角形");
		shape.say();
		shape=Factory.getShape("Factory.正方形");
		shape.say();
	}
}

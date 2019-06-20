package Factory;

/**
 * @fileName: Factory.FactoryTest
 * @author: L
 * @date: 2019/6/16 14:30
 * @description:
 * @history: \n
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class Factory {
	static Shape shape = null;

	public static Shape getShape(String type) {
		switch (type) {
			case "Factory.三角形":
				shape = new 三角形();
				break;
			case "Factory.正方形":
				shape = new 正方形();
				break;
			default:
				System.out.println("无匹配类型");
				break;
		}
		return shape;

	}
}

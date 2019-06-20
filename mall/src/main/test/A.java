import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @fileName: A
 * @author: L
 * @date: 2019/6/13 15:48
 * @description:
 * @history: \n
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

class A {
	void call(int a, String b, Map<String, List<String>> map) {
		a = 3;
		b = "str2";
		map.get("list2");
		List<String> l2 = new ArrayList<String>();
		l2.add("three");
		map.put("list2", l2);

	}
}

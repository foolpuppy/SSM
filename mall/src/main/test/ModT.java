import org.apache.commons.fileupload.util.LimitedInputStream;
import org.junit.Test;

import java.util.*;

/**
 * @fileName: ModT
 * @author: L
 * @date: 2019/6/13 13:11
 * @description:光谷信息面试题
 * @history: \n
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

public class ModT {
	/**
	 * 数组元素之和=target，返回元素下标
	 */
	@Test
	public void text1() {
		int[] nums = new int[]{3, 6, 19, 35};
		int target = 9;
		int s = 0, e = nums.length - 1;

		while (s < e) {
			if (nums[s] + nums[e] == target) {
				System.out.println(s + "," + e);
				return;
			}
			if (nums[s] + nums[e] > target)
				e--;
			if (nums[s] + nums[e] < target)
				s++;
		}
		System.out.println("无结果");
	}

	/**
	 * 整数反转
	 */
	@Test
	public void text2() {
		long num = -1002450000;
		String str = String.valueOf(num);
		System.out.println(str);
		if (num >= 0) {
			if (str.endsWith("0")) {
				while (str.endsWith("0")) {
					//删除尾部的0
					str = str.substring(0, str.length() - 1);
				}
			}
			System.out.println(new StringBuilder(str).reverse());
		} else {
			if (str.endsWith("0")) {
				while (str.endsWith("0")) {
					str = str.substring(0, str.length() - 1);
				}
			}
			System.out.println("-" + new StringBuilder(str.substring(1)).reverse());
		}
	}

	@Test
	public void test2Beta() {
		int num = 21474836;
		int a;
		long res = 0;
		while (num != 0) {
			a = num % 10;
			num /= 10;
			res = res * 10 + a;
			if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
				res = 0;
			}

		}
		System.out.println(res);
	}

	@Test
	public void text3() {
		int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
		int[] nums2 = new int[]{2, 3, 1};
		int m = 3, n = 3;
		for (int j = 0; j < n; j++) {
			nums1[m++] = nums2[j];
		}
		Arrays.sort(nums1);
		System.out.println(Arrays.toString(nums1));
	}

	@Test
	public void text4() {
		String str = "HELLOHssssAHAHA";
		char[] chars = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (char c : chars) {

			if (c >= 65 && c <= 90) {
				c += 32;
			}
			sb.append(c);
		}
		System.out.println(sb.toString());
	}

	@Test
	public void text5() {
		int a = 2;
		String b = "str1";
		List<String> list = new ArrayList<>();
		list.add("str1");
		Map<String, List<String>> map = new HashMap<>();
		map.put("list2", list);
		new A().call(a, b, map);
		System.out.println(a + " " + b + " " + map);
	}

	@Test
	public void ObjectFun() {
		System.out.println(Objects.equals(new String("abcd"), new String("abc")));
	}
}

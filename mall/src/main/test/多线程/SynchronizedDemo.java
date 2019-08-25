/**
 * @fileName: Threa
 * @author: L
 * @date: 2019/7/1 14:14
 * @description:
 * @history: \n
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 多线程;

import org.junit.Test;

import java.nio.charset.StandardCharsets;

public class SynchronizedDemo implements Runnable {
	private static int count = 0;
	private static Object o = new Object();

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(new SynchronizedDemo());
			thread.start();
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("result: " + count);
	}

	@Override
	public void run() {
		synchronized (o) {
			for (int i = 0; i < 1000000; i++)
				count++;
		}
	}

	@Test
	public void StringLength() {
		System.out.println("哈".getBytes(StandardCharsets.UTF_8).length);
		System.out.println(java.nio.charset.Charset.defaultCharset().toString());
		char[] vals=new char[]{};
		System.out.println(vals.length);
		System.out.println("".getBytes().length);
	}
}
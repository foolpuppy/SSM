/**
 * @fileName: RecordNoUtils
 * @author: L
 * @date: 2019/6/2 16:08
 * @description:
 * @history: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package top.wigon.utils.snowflake;

public class RecordNoUtils {
	/**
	 * 这里的0，0分别是
	 *
	 * @param workerId 工作ID (0~31)
	 * @param datacenterId 数据中心ID (0~31)，可以写在配置文件中。
	 */
	private static UniqueOrderGenerate idWorker = new UniqueOrderGenerate(0, 0);

	public static RecordNoUtils getInstance() {
		return new RecordNoUtils();
	}

	public String get() {
		return String.valueOf(idWorker.nextId());
	}

}
/**
 * @fileName: DbDate
 * @author: L
 * @date: 2019/6/21 19:10
 * @description:
 * @history: \n
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package top.wigon.utils.database;

import java.sql.Timestamp;

public class DbDate {
	/**
	 * @return 返回 YYYY-MM-DD HH-MM-SS 字符串
	 */
	public static String getCurrDateTime() {
		return new Timestamp(new java.util.Date().getTime()).toString();
	}

	/**
	 * 返回时间戳
	 *
	 * @return
	 */
	public static String getCurrentTimeMillis() {
		return String.valueOf(System.currentTimeMillis());
	}
}

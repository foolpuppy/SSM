/**
 * @fileName: EncryptUtils
 * @author: L
 * @date: 2019/5/28 14:17
 * @description: 字符串加密工具
 * @history: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package top.wigon.utils;

import java.math.BigInteger;
import java.security.MessageDigest;

public class EncryptUtils {
	private static final String[] hexDigits = {"0", "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

	private static String byteArrayToHexString(byte[] b) {
		StringBuffer resultSb = new StringBuffer();
		for (int i = 0; i < b.length; i++) {
			resultSb.append(byteToHexString(b[i]));
		}

		return resultSb.toString();
	}

	private static String byteToHexString(byte b) {
		int n = b;
		if (n < 0) {
			n += 256;
		}
		int d1 = n / 16;
		int d2 = n % 16;
		return hexDigits[d1] + hexDigits[d2];
	}

	/**
	 * 返回大写MD5
	 *
	 * @param origin
	 * @param charsetname
	 * @return
	 */
	private static String MD5Encode(String origin, String charsetname) {
		String resultString = null;
		try {
			resultString = origin;
			MessageDigest md = MessageDigest.getInstance("MD5");
			if (charsetname == null || "".equals(charsetname)) {
				resultString = byteArrayToHexString(md.digest(resultString.getBytes()));
			} else {
				resultString = byteArrayToHexString(md.digest(resultString.getBytes(charsetname)));
			}
		} catch (Exception exception) {
		}
		return resultString.toUpperCase();
	}

	/**
	 * 传入字符串返回加密后的MD5值
	 *
	 * @param origin
	 * @return
	 */
	public static String MD5EncodeUtf8(String origin) {
		return MD5Encode(origin, "utf-8");
	}
	/**
	 * 密码不可逆加密，取 md5截取 [8,24)再算md5
	 *
	 * @param password 未加密的原始密码
	 * @return 加密后的密码
	 */
	public static String encryptPassword(String password) {
		return md5Encrypt(md5Encrypt(password).substring(8, 24));
	}

	private static String md5Encrypt(String str) {
		String result = "";
		try {
			// 生成一个MD5加密计算摘要
			MessageDigest md = MessageDigest.getInstance("MD5");
			// 计算md5函数
			md.update(str.getBytes());
			// digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
			// BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
			result = new BigInteger(1, md.digest()).toString(16);
		} catch (Exception ignored) {
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(encryptPassword("xi753951"));
		System.out.println(MD5EncodeUtf8("xi753951"));
	}
}

/**
 * @fileName: CommonController
 * @author: L
 * @date: 2019/6/4 10:46
 * @description:
 * @history: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package top.wigon.controller.front;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.wigon.pojo.Item;
import top.wigon.service.ItemService;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.util.List;
@Slf4j
@Controller
public class CommonController {
	@Autowired
	Producer captchaProducer = null;
	@Resource
	private ItemService itemService;

	@RequestMapping("/captcha")
	public void getKaptcha(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		HttpSession session = req.getSession();
		resp.setDateHeader("Expires", 0);
		resp.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		resp.addHeader("Cache-Control", "post-check=0, pre-check=0");
		resp.setHeader("Pragma", "no-cache");
		resp.setContentType("image/jpeg");
		//生成验证码
		String capText = captchaProducer.createText();
		session.setAttribute(Constants.KAPTCHA_SESSION_KEY, capText);
		//向客户端写出
		BufferedImage bi = captchaProducer.createImage(capText);
		ServletOutputStream out = resp.getOutputStream();
		ImageIO.write(bi, "jpg", out);
		try {
			out.flush();
		} finally {
			out.close();
		}

	}

	@RequestMapping(value = "/init",produces = "text/plain;charset=utf-8")
	@ResponseBody
	public String init() {
		ObjectMapper objectMapper = new ObjectMapper();
		String JSON = null;
		List<Item> itemLista = itemService.loadByCategory("笔记本电脑").subList(0, 5);
		List<Item> itemListb = itemService.loadByCategory("水果生鲜").subList(0, 5);
		List<Item> itemListc = itemService.loadByCategory("美妆馆").subList(0, 5);
		List<Item> itemListd = itemService.loadPage(0,20);
		StringBuffer content = new StringBuffer();
		content.append("{\"status\": 0,\"floor\": {\"bigimg\": \"res/static/img/s_img1.jpg\",");
		content.append("\"banner\": {");
		content.append("\"cont\":");
		try {
			JSON = objectMapper.writeValueAsString(itemListd);

			content.append(JSON);
			content.append("}},");
			content.append("\"proct\": [{\"floorNum\": \"1F\",\"productItem\": \"product-item1\",\"carImg\": \"res/static/img/icon_gou.png\", \"text\": \"电子产品\",\"bigImg\": \"res/static/img/img1.jpg\",\n" +
					" \"imgBox\":");
			JSON = objectMapper.writeValueAsString(itemLista);
			content.append(JSON);
			content.append("},");
			content.append("{\"floorNum\": \"2F\",\"productItem\": \"product-item2\",\"carImg\": \"res/static/img/icon_gou.png\",\"text\": \"水果生鲜\",\"bigImg\": \"res/static/img/img2.jpg\",\"imgBox\": ");
			JSON = objectMapper.writeValueAsString(itemListb);
			content.append(JSON);
			content.append("},");
			content.append("{\"floorNum\": \"3F\",\"productItem\": \"product-item3\",\"carImg\": \"res/static/img/icon_gou.png\", \"text\": \"美妆馆\",\"bigImg\": \"res/static/img/img3.jpg\",\"imgBox\": ");
			JSON = objectMapper.writeValueAsString(itemListc);
			content.append(JSON);
			content.append("}],");
			content.append("\"productList\": ");
			JSON = objectMapper.writeValueAsString(itemListd);
			content.append(JSON);
			content.append("}");
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return content.toString();

	}


}

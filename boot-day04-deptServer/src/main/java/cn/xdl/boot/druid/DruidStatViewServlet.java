package cn.xdl.boot.druid;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import com.alibaba.druid.support.http.StatViewServlet;

/**
 * 
 * @Title: DruidStatViewServlet
 * @Description: TODO(配置Druid监控统治信息)
 * @author X-Dragon
 * @date 2018年11月1日 下午4:11:02
 * @version V1.0
 *
 */
@WebServlet( urlPatterns = "/druid/*", initParams = {
		@WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*"), // 忽略资源
		@WebInitParam(name = "loginUsername", value = "system"), //用户名大小写敏感 如果写错了会直接登录 不需要密码
		@WebInitParam(name = "loginPassword", value = "123456") })//密码

public class DruidStatViewServlet extends StatViewServlet {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

}


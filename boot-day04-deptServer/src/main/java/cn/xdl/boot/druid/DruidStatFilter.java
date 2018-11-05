package cn.xdl.boot.druid;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

import com.alibaba.druid.support.http.WebStatFilter;

/**
 * 
 * @Title: DruidStatFilter
 * @Description: TODO(Druid过滤器)
 * @author X-Dragon
 * @date 2018年11月1日 下午4:19:46
 * @version V1.0
 *
 */

@WebFilter(filterName = "druidFilter", urlPatterns = "/*", initParams = {
		@WebInitParam(name = "exclusion", value = "*.js,*.gif,*.jpg,*.bmp,*.css,*.png,*.ico,/druid/*") }) // 忽略资源

public class DruidStatFilter extends WebStatFilter {

}

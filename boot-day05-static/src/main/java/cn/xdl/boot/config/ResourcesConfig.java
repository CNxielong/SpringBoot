package cn.xdl.boot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 
 * @Title: ResourcesConfig  
 * @Description: TODO(配置自定义的文件夹)  
 * @author X-Dragon  
 * @date 2018年10月31日 下午5:00:48 
 * @version V1.0  
 *
 */
@Configuration
public class ResourcesConfig extends WebMvcConfigurerAdapter{

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/myresources/**")
			.addResourceLocations("classpath:/myresources/");
	}

	
}

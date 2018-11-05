package cn.xdl.boot.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration//拦截器配置，配置AjaxDomainInterceptor拦截器
public class InterceptorConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		AjaxDomainInterceptor ajaxDomain = new AjaxDomainInterceptor();
		registry.addInterceptor(ajaxDomain).addPathPatterns("/**");// 拦截所有请求
	}
}

package cn.xdl.boot.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
public class WatchBean {
	
//    @Around("within(cn.xdl.boot.controller..*)")
	@Around(value="within(cn.xdl.boot.controller..*)")//标记要切入的Controller类
	public Object watch(ProceedingJoinPoint pjp) throws Throwable {//ProceedingJoinPoint 封装切入方法的信息
		System.out.println("前置通知执行");
		StopWatch sw = new StopWatch();//记录服务调用时间
		sw.start();
		Object obj = pjp.proceed();//执行调用目标组件方法(Controller的方法) obj封装方法返回值
		sw.stop();
		long time = sw.getTotalTimeMillis();//记录服务调用时间 第一次时间久
		Object target = pjp.getTarget();
	    //记录服务调用时间、处理时间、服务组件名、方法名等信息
		System.out.println("pjp.getTarget():"+target);//输出 pjp.getTarget():cn.xdl.boot.controller.DeptController@58fd1503
        String targetName = pjp.getTarget().getClass().getName();//目标组件名 cn.xdl.boot.controller.DeptController 
        String methodName = pjp.getSignature().getName();//目标方法名 loadAll
        System.out.println("执行的组件为:"+targetName+" 方法为:"+methodName+" 返回结果:"+obj+" 处理时长:"+time);
		return obj;//返回的结果就是请求返回的结果 此处是DEPT集合
	}
	
}

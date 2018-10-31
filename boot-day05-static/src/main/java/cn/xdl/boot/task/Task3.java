package cn.xdl.boot.task;

import java.util.Date;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling//启用定时计划
public class Task3 {

	@Scheduled(cron="0/5 * * * * ?" )//每五秒执行一次
	public void run(){
		System.out.println("cron表达式 Task3 "+new Date());
	}
	
}

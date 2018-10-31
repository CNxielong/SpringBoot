package cn.xdl.boot.task;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Task1 implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Task1");
	}

}

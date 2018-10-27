package cn.xdl.service;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

@EnableAutoConfiguration
@Service(value="UserService")
public class UserServiceImpl implements UserService {

	@Override
	public void register() {
		// TODO Auto-generated method stub
		System.out.println("用户注册");
	}

}

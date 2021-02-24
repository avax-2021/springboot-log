/**
 * 
 */
package top.anets.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import top.anets.entity.User;

/**
 * @author Administrator
 *
 */
@Controller
@ResponseBody
public class UserController {
	@RequestMapping("/user")
     public User getXml() {
		User user=new User();
		user.setAge(50);
		return user;
	}
} 

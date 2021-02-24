/**
 * 
 */
package top.anets.test;

import javax.annotation.PostConstruct;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 *
 */
@Component
public class Anets implements ApplicationRunner{
	@PostConstruct
    public void fun() {
    	System.out.println("service start ");
    }

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
	}
}

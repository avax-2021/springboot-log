/**
 * 
 */
package top.anets.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 *
 */

@Component
public class StartPingService implements CommandLineRunner{
 
 
    @Override
    public void run(String... args) throws Exception {
        System.out.println("cmd=====");
    }
 

}

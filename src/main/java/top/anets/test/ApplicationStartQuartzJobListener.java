/**
 * 
 */
package top.anets.test;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 *
 */

@Component
public class ApplicationStartQuartzJobListener implements ApplicationListener<ContextRefreshedEvent>{
 

 
    /**
     * 初始启动quartz
     */
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        try {
            System.out.println("ApplicationListener任务已经启动...");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

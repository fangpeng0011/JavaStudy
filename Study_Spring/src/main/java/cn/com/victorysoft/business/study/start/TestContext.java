package cn.com.victorysoft.business.study.start;

import cn.com.victorysoft.business.study.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName : TestContext
 * @Description : TODO
 * @Author : ffp
 * @Date: 2020-12-17 11:15
 */
public class TestContext {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("student.xml");

        Student student = applicationContext.getBean("studnet", Student.class);

        System.out.println(student);


    }
}

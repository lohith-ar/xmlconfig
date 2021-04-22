package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


//        BeanFactory bean = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        ApplicationContext bean = new ClassPathXmlApplicationContext("beans.xml");
//        Movie movie = (Movie) bean.getBean("movie1");
//        Movie movie11 = (Movie) bean.getBean("movie1");
//        System.out.println(movie1==movie11);


        Movie movie22 = (Movie) bean.getBean("movie1");
        Movie movie33 = (Movie) bean.getBean("movie2");
        System.out.println(movie22==movie33);
    }
}

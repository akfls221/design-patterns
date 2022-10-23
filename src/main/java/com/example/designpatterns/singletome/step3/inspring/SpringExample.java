package com.example.designpatterns.singletome.step3.inspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExample {

    public static void main(String[] args) {
        /**
         * 엄밀히 따지자면 싱글톤은 아니다.(여러개의 다른 인스턴스를 만들 수 있기 때문)
         * 그러나 ApplicationContext 안에서 유일한 인스턴스로 관리가 된다.
         */
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        String hello = applicationContext.getBean("hello", String.class);
        String hello2 = applicationContext.getBean("hello", String.class);

        System.out.println(hello == hello2);

    }
}

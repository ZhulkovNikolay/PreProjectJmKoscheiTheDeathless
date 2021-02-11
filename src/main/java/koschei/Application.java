package koschei;

import koschei.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        KoscheiTheDeathless koscheiTheDeathless =
                applicationContext.getBean(KoscheiTheDeathless.class);
        System.out.println(koscheiTheDeathless.getRulesByDeth());
    }
}
// На свете есть океан(1)  , на океане остров(2) , на острове дерево(3) , на дереве заяц(4) , в зайце утка(5) ,
// в утке яйцо(6) , в яйце иголка(7) , смерть Кощея на игле(8)
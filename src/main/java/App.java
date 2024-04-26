import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);


        HelloWorld helloWorldBean = (HelloWorld) applicationContext.getBean("helloWorld");
        System.out.println("First HelloWorld bean: " + helloWorldBean.getMessage());


        Cat catBean1 = (Cat) applicationContext.getBean("cat");
        Cat catBean2 = (Cat) applicationContext.getBean("cat");
        System.out.println("First Cat bean: " + catBean1.getName());
        System.out.println("Second Cat bean: " + catBean2.getName());


        System.out.println("Comparing HelloWorld beans: " + (helloWorldBean == helloWorldBean));
        System.out.println("Comparing Cat beans: " + (catBean1 == catBean2));
    }
}
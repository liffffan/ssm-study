import com.kuang.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 获取 Spring 的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // 我们的对象都在 Spring 中的管理了，我们要使用，直接去里面取出来就可以了
        // getBean 里的字符串对应 xml 里面 bean 的 id
        Hello hello = (Hello) context.getBean("hello");
        hello.show();
    }
}

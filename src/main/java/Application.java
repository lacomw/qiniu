import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by tommy.wch on 2017/9/24.
 */
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = "com.qiniu")
public class Application {


    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}

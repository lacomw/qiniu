import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by tommy.wch on 2017/9/24.
 */
@Controller
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = {"com.qiniu"})
public class Application {
    @RequestMapping("/printhello")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping(value = "/")
    public String index(ModelMap modelMap){
        ModelAndView modelAndView = new ModelAndView("home");
        System.out.println("in index");
        modelMap.put("num","123");
        return "home";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}

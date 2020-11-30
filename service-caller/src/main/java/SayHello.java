import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class SayHello {

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(){
        return "hello";
    }
}

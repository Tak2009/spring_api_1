package app;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")


public class DemoController {

    @Data
    private static class DemoRequest {
        private Integer id;
        private String name;
    }


    @Autowired
    private MessageSource messageSource;

    @RequestMapping(value = {"/create"}, method = RequestMethod.POST)
    public void create(@RequestBody DemoRequest request) {
        System.out.print(request);
    }
}

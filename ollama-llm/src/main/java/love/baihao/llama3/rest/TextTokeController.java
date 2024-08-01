package love.baihao.llama3.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("textToke")
public class TextTokeController {

    @PostMapping("test")
    public String test() {
        return "test";
    }

}

package spring.tier.challengers.debugsupporter.Query;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/query")
public class QueryController {
    private final QueryService queryService;
    @GetMapping
    public void query(){
        queryService.query();
    }
}

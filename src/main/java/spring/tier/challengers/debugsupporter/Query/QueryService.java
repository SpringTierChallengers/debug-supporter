package spring.tier.challengers.debugsupporter.Query;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QueryService {
    private final OpenAiService openAiService;
    public void query(){
        CompletionRequest completionRequest = CompletionRequest.builder()
                .prompt("Somebody once told me the world is gonna roll me")
                .model("ada")
                .echo(true)
                .build();
        openAiService.createCompletion(completionRequest).getChoices().forEach(System.out::println);
    }
}

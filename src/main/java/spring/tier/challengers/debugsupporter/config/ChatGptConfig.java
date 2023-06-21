package spring.tier.challengers.debugsupporter.config;

import com.theokanning.openai.service.OpenAiService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.tier.challengers.debugsupporter.common.Constant;

import java.time.Duration;

@Configuration
public class ChatGptConfig {
    @Bean
    public OpenAiService openAiService(){
        return new OpenAiService(Constant.OPEN_API_KEY, Duration.ofSeconds(30));
    }
}

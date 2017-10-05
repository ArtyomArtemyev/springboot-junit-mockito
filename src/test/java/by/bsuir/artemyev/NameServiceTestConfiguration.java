package by.bsuir.artemyev;

import by.bsuir.artemyev.service.NameService;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

// The @Profile annotation tells Spring to apply this configuration only when the “test” profile is active.
@Profile("test")
@Configuration
public class NameServiceTestConfiguration {

    // The @Primary annotation is there to make sure this instance is used instead of a real one for autowiring.
    @Bean
    @Primary
    public NameService nameService() {
        return Mockito.mock(NameService.class);
    }

}

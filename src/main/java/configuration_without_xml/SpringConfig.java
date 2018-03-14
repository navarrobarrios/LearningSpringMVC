package configuration_without_xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("configuration_without_xml")
@PropertySource("sport.properties")
public class SpringConfig {

}

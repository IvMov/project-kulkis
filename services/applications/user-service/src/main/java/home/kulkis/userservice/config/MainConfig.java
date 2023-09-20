package home.kulkis.userservice.config;

import home.kulkis.userservice.repository.customize.UuidMongoRepositoryImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "home.kulkis.userservice", repositoryBaseClass = UuidMongoRepositoryImpl.class)
public class MainConfig {
}

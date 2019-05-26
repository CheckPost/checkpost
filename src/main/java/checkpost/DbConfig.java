package checkpost;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

import java.util.Collection;
import java.util.Collections;

@Configuration
@EnableReactiveMongoRepositories
public class DbConfig extends AbstractReactiveMongoConfiguration {
  @Bean
  public MongoClient reactiveMongoClient() {
    return MongoClients.create();
  }

  @Override
  protected String getDatabaseName() {
    return "checkpost";
  }

  @Override
  protected Collection<String> getMappingBasePackages() {
    return Collections.singletonList("checkpost");
  }
}

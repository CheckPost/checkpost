package checkpost.core;

import graphi.GraphiPayload;
import graphi.GraphiResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/graphi")
public class GraphiController {

  @PostMapping
  Mono<GraphiResponse> execute(@RequestBody GraphiPayload payload) {
    return Mono.just(new GraphiResponse());
  }

}

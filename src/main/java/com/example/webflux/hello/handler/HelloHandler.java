package com.example.webflux.hello.handler;

import static org.springframework.web.reactive.function.BodyInserters.fromValue;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class HelloHandler {

    public Mono<ServerResponse> helloResponse(ServerRequest request) {
        return ok().contentType(MediaType.TEXT_PLAIN)
                   .body(fromValue("Hello " + request.pathVariable("name")));
    }
}

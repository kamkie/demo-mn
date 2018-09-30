package demo.mn;

import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Client("dummy")
public interface DummyClient {

    @Get("/")
    public HttpStatus index();
}
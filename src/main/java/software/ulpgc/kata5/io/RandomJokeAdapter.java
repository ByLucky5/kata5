package software.ulpgc.kata5.io;

import software.ulpgc.kata5.io.pojo.RandomJokeGetResponse;
import software.ulpgc.kata5.model.Joke;

public class RandomJokeAdapter implements JokeAdapter {
    @Override
    public Joke adapt(Object object) {
        return adapt(((RandomJokeGetResponse) object).attachments().get(0).text());
    }
    private Joke adapt(String text) {
        return new Joke(text);
    }
}

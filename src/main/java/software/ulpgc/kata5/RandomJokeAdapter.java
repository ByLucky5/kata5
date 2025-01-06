package software.ulpgc.kata5;

public class RandomJokeAdapter implements JokeAdapter {
    @Override
    public Joke adapt(Object object) {
        return adapt(((RandomJokeGetResponse) object).attachments().get(0).text());
    }
    private Joke adapt(String text) {
        return new Joke(text);
    }
}

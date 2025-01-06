package software.ulpgc.kata5.io.pojo;

import java.util.List;

public record RandomJokeGetResponse(List<Attachments> attachments, String responseType, String username) {
    public record Attachments (String fallback, String footer, String text){}
}

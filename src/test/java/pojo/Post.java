package pojo;

import com.google.gson.GsonBuilder;

public final class Post {
    private final String title;
    private final String body;

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public String toStringJson() {
        return new GsonBuilder().create().toJson(this);
    }
}

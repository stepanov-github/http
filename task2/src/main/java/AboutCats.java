public class AboutCats {
    public String id, text, type, user;
    public Integer upvotes;

    public AboutCats() {

    }

    public AboutCats(String id, String text, String type, String user, Integer upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    public String toString() {
        return String.format("AboutCats[id=%s, text=%s, type=%s, user=%s, upvotes=%d", id, text, type, user, upvotes);

    }


}

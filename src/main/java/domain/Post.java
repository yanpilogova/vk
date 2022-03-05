package domain;

public class Post {
    private String id;
    private int postId;
    private int ownerId;
    private int fromId;
    private int createBy;
    private int createDate;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private boolean friendOnly;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //+getter+setter на все поля;
}

package manager;

import domain.Post;

public class PagePostManager {
    private PostManager postManager;
    public String generatePost(){
        Post[] post = postManager.getPostsForGroup();
        //logic
        return null;
    }
}

package dto.responses;

import dto.responses.LikeResponse;
import lombok.Data;
import model.Post;

import java.util.List;

@Data
public class PostResponse {

    Long id;

    Long userId;

    String userName;

    String text;

    String title;

    List<LikeResponse> postLikes;

    public PostResponse(Post entity, List<LikeResponse> likes){
        this.id = entity.getId();
        this.userId = entity.getUser().getId();
        this.userName = entity.getUser().getUserName();
        this.text = entity.getText();
        this.title = entity.getTitle();
        this.postLikes = likes;
    }
}

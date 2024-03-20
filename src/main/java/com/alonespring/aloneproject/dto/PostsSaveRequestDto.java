package com.alonespring.aloneproject.dto;

import com.alonespring.aloneproject.domain.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.BindParam;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;

    /*
    엔티티 클래스와 거의 유사한 형태임에도 Dto 클래스를 추가로 사용
    절대로 엔티티 클래스를 Request/Reponse 클래스로 사용해서는 안된다.
    엔티티 클래스는 데이터베이스와 맞닿은 핵심 클래스이다.
    View layer와 DB layer의 역할 분리를 철저하게 하는게 좋다.
     */

    @Builder
    public PostsSaveRequestDto(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Posts toEntity(){
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}

package com.multi.mini6.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Movie2VO {

    private int movie_id;
    private String title;
    private String img;
    private String genre;
    private String running_time;
    private String link;


}

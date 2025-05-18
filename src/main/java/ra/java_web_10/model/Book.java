package ra.java_web_10.model;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {
    private int id;
    private String title;
    private String ISBN;
    private String price;
    private MultipartFile fileImage;
    private Date publishedDate;
}

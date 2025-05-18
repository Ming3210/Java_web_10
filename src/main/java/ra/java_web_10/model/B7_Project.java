package ra.java_web_10.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class B7_Project {
    private String name;
    private String description;
    private String documentTitle;
    private String documentDescription;
    private MultipartFile file;
}

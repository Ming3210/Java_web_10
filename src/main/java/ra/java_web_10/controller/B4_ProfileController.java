package ra.java_web_10.controller;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ra.java_web_10.model.B4_Profile;

import java.util.Map;

@Controller
public class B4_ProfileController {
    @Autowired
    private Cloudinary cloudinary;



    @GetMapping("/uploadForm")
    public String showUploadForm(Model model) {
        model.addAttribute("userProfile", new B4_Profile());
        return "uploadForm";
    }

    @PostMapping("/uploadAvatar")
    public String uploadAvatar(@ModelAttribute("userProfile") B4_Profile userProfile,
                               Model model) {
       try {
           Map uploadResult = cloudinary.uploader().upload(
                     userProfile.getAvatar().getBytes(),
                     ObjectUtils.asMap("resource_type", "auto")
           );
              String avatarUrl = (String) uploadResult.get("secure_url");
           if (avatarUrl == null || avatarUrl.isEmpty()) {
               throw new RuntimeException("URL is empty or null");
           }

           // Thêm dữ liệu cần thiết vào model
           model.addAttribute("avatarUrl", avatarUrl);
           model.addAttribute("username", userProfile.getUsername());
           model.addAttribute("message", "Upload thành công!");

       }catch (Exception e){
           e.printStackTrace();
       }
        model.addAttribute("uploadedProfile", userProfile);
        return "uploadResult";
    }
}

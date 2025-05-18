package ra.java_web_10.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class B8_Ticket {
    private String movieTitle;
    private Date showTime;
    private List<String> seats;
    private double totalAmount;
}

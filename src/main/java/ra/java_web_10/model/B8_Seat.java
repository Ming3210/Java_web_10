package ra.java_web_10.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class B8_Seat {
    private String seatNumber;
    private String type; // VD: "Standard", "VIP"
    private double price;

}

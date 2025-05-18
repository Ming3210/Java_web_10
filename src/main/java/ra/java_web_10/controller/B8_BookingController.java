package ra.java_web_10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ra.java_web_10.model.B8_Ticket;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class B8_BookingController {

    @GetMapping("/bookingForm")
    public String showForm(Model model) {
        model.addAttribute("ticket", new B8_Ticket());
        return "bookingForm";
    }

    @PostMapping("/bookTicket")
    public String bookTicket(
            @RequestParam String movieTitle,
            @RequestParam String showTime,
            @RequestParam List<String> seats,
            Model model
    ) {
        try {
            B8_Ticket ticket = new B8_Ticket();
            ticket.setMovieTitle(movieTitle);
            ticket.setSeats(seats);

            Date parsedDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm").parse(showTime);
            ticket.setShowTime(parsedDate);

            double pricePerSeat = 5.0;
            double totalAmount = seats.size() * pricePerSeat;
            ticket.setTotalAmount(totalAmount);


            model.addAttribute("ticket", ticket);
            model.addAttribute("message", "Đặt vé thành công!");

        } catch (Exception e) {
            model.addAttribute("message", "Lỗi đặt vé: " + e.getMessage());
        }

        return "bookingResult";
    }
}

package dev.mounika.BookMyShow.controller;

import dev.mounika.BookMyShow.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {
    @Autowired//creates a dependency object and inject inside the controller
    private TicketService ticketservice;
    @GetMapping("/hello")
    public ResponseEntity greet(){
        String greet = ticketservice.greet();
        return ResponseEntity.ok(greet);
    }
}

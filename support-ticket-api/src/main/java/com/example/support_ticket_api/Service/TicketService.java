package com.example.support_ticket_api.Service;

import com.example.support_ticket_api.Model.Ticket;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class TicketService {

    private final List<Ticket> tickets = new ArrayList<>();

    public Ticket addTicket(Ticket ticket) {
        ticket.setCreatedAt(LocalDateTime.now());
        tickets.add(ticket);
        return ticket;
    }

    public List<Ticket> getAllTickets() {
        return tickets;
    }
}

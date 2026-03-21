package com.rajtech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajtech.entities.Ticket;
import com.rajtech.repositories.TicketRepository;

@Service
public class TicketService {
	@Autowired
	private TicketRepository repo;
	
	public Ticket bookTicket(Ticket ticket) {
		return repo.save(ticket);
	}
	
	public Ticket getTicketById(int ticketId) {
		return repo.findById(ticketId).get();
	}
	
	public List<Ticket> getAllTickets(){
		return repo.findAll();	
	}
	
	public Ticket updateTicket(int ticketId, String newEmail) {
		Ticket ticketFromDb = repo.findById(ticketId).get();
		ticketFromDb.setEmail(newEmail);
		Ticket updatedTicket = repo.save(ticketFromDb);
		return updatedTicket;
	}
	
	public void deleteTicket(int ticketId) {
		repo.deleteById(ticketId);
	}
}

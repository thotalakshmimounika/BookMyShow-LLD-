package dev.mounika.BookMyShow.repository;

import dev.mounika.BookMyShow.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentsRepository extends JpaRepository<Payment, Integer > {
}
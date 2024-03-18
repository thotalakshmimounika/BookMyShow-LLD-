package dev.mounika.BookMyShow.model;

import dev.mounika.BookMyShow.model.constant.PaymentMode;
import dev.mounika.BookMyShow.model.constant.PaymentsStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter@Setter@Entity

public class Payment extends BaseModel{
    private LocalDateTime paymentTime;
    private double amount;
    private String referenceId;
    @ManyToOne
    private Ticket ticket;
    @Enumerated(EnumType.STRING)
    private PaymentsStatus paymentsStatus;
    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;
}

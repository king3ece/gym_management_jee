package com.king3ece.back_gym_management.models;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "clients")
@Data
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String lastName;

    @Column(length = 50)
    private String firstName;

    private LocalDate registrationDate;
    private boolean activeSubscription;
    private Number phoneNumber;

    @OneToMany(mappedBy = "client")
    private List<Subscription> Subscriptions;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public boolean isActiveSubscription() {
        return activeSubscription;
    }

    public void setActiveSubscription(boolean activeSubscription) {
        this.activeSubscription = activeSubscription;
    }

    public Number getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Number phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}


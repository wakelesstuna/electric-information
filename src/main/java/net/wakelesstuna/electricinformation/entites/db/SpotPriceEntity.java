package net.wakelesstuna.electricinformation.entites.db;

import jakarta.persistence.*;
import lombok.*;
import net.wakelesstuna.electricinformation.clients.enums.PriceArea;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "spot_prices")
@Builder(toBuilder = true)
@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SpotPriceEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    private String id;
    private LocalDate timeStampDay;
    private String timeStampHour;
    private Integer value;
    private String unit;
    private PriceArea priceArea;
    @CreationTimestamp
    private LocalDateTime created;
    @UpdateTimestamp
    private LocalDateTime updated;
}

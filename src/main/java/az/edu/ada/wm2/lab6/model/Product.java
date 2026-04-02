package az.edu.ada.wm2.lab6.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String productName;
    private BigDecimal price;
    private LocalDate expirationDate;

    // IMPORTANT: Keep this empty constructor for JPA
    public Product() {
    }

    public Product(String productName, BigDecimal price, LocalDate expirationDate) {
        this.productName = productName;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    // --- Keep your Getters and Setters below ---
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }

    public LocalDate getExpirationDate() { return expirationDate; }
    public void setExpirationDate(LocalDate expirationDate) { this.expirationDate = expirationDate; }
}
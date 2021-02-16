package ru.sapteh.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Manufacture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false,length = 50)
    @NonNull
    private String name;

    @ManyToOne
    @JoinColumn(name = "Product", nullable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "ProductSale", nullable = false)
    private ProductSale ProductSale;

    @Override
    public String toString() {
        return "User_Role{" +
                "id=" + id +
                ", registrationDate='" + name + '\'' +
                '}';
    }
}

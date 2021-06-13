package com.bolditsin.hibernatelessons.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="productstable")
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name ="title")
    private String title;
    @Column(name ="price")
    private int price;
}

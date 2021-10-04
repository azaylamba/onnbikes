package com.relevel.onnbikes.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RentalOrder {

    @Id
    private long rental_id;
}

package com.productservice.productservice.inheritancerelations.tableperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tpc_mentor")
public class Tpc_Mentor extends User {
    private double avgRating;
}

package com.example.tripmate_user_service.entity;

import jakarta.persistence.DiscriminatorValue;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

@Entity
@DiscriminatorValue("BUSINESS")
@Getter
@Setter
public class BusinessUser extends User {
    @Column(name = "business_license_id")
    private String businessLicenseId;

    @Override
    public String getRole() {
        return "BUSINESS";
    }
    
}

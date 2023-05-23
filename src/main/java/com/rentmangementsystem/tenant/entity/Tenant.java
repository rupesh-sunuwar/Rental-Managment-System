package com.rentmangementsystem.tenant.entity;


import com.rentmangementsystem.contact.entity.Contact;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tenant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tenantId;
    private String name;

    @OneToOne(cascade=CascadeType.ALL)
    private Contact contact;





}

package com.ale94.spring_mongo_student_api.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class AddressDocument {

    private String street;
    private String city;
    private String country;

}

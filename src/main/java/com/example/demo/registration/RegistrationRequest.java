package com.example.demo.registration;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class RegistrationRequest {
    private  String firstName;
    private  String lastName;
    private  String email;
    private  String password;


}

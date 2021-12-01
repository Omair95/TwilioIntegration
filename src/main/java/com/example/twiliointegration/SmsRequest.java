package com.example.twiliointegration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsRequest {

    @NonNull
    private String phoneNumber; // destination

    @NonNull
    private String message; // message
}

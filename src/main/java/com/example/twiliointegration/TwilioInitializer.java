package com.example.twiliointegration;

import com.twilio.Twilio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class TwilioInitializer {

    private final TwilioConfiguration twilioConfiguration;

    @Autowired
    public TwilioInitializer(TwilioConfiguration twilioConfiguration) {
        this.twilioConfiguration = twilioConfiguration;
        String accountSid = twilioConfiguration.getAccountSid();
        Twilio.init(
                accountSid, twilioConfiguration.getAuthToken()
        );

        log.info("Twilio initialized ... with account sid {}", accountSid);
    }
}

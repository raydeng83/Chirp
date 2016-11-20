package com.backend.config;

import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

/**
 * Created by z00382545 on 11/19/16.
 */

@Component
public class AuthFailureHandler extends SimpleUrlAuthenticationFailureHandler {
}

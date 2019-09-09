package com.me.resource.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties("security")
@Getter
@Setter
@Component
public class SecurityProperties {
	private JwtProperties jwt;

	private String clientId;
}

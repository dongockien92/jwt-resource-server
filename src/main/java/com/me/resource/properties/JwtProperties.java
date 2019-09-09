package com.me.resource.properties;

import org.springframework.core.io.Resource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JwtProperties {
	private Resource publicKey;
}

package com.jwtdata.jwtdata.payload;

import lombok.Data;

@Data
public class JwtAuthRequest {

	private String username;
	
	private String password;
}

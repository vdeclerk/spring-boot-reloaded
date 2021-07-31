package com.v15k.springbootreloaded.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.v15k.springbootreloaded.domain.AuthenticationRequest;
import com.v15k.springbootreloaded.domain.AuthenticationResponse;
import com.v15k.springbootreloaded.service.V15kUserDetailsService;
import com.v15k.springbootreloaded.util.JwtUtil;

@Controller
public class HomeController {

	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private V15kUserDetailsService v15kUserDetailsService;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@RequestMapping
	public String home(Model model) {
		return "index.html";
	}

	@PostMapping("/authenticate")
	public ResponseEntity<AuthenticationResponse> createauthenticationToken(
			@RequestBody AuthenticationRequest authenticationRequest
			) throws Exception {
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(
							authenticationRequest.getUsername(), 
							authenticationRequest.getPassword()
					)
			);
		} catch (BadCredentialsException e) {
			throw new Exception("Incorrect username or password", e);
		}
		
		final UserDetails userDetails = 
				v15kUserDetailsService.loadUserByUsername(
						authenticationRequest.getUsername());
		final String jwt = jwtUtil.generateToken(userDetails);
		return ResponseEntity.ok(new AuthenticationResponse(jwt));
	}
	
}

package com.baeldung.springsoap.gen.client;

import com.baeldung.springsoap.gen.GetCountryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class Controller {

    @Autowired
    private ClientService client;

    @GetMapping("/getCountry")
    public ResponseEntity<GetCountryResponse> getCountry(@RequestParam String name) {
        return ResponseEntity.status(HttpStatus.OK).body(client.getCountryResponse(name));
    }
}

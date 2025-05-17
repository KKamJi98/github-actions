package com.healthz;

import com.healthz.dto.ResponseCodeDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Controller
public class HealthzApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthzApplication.class, args);
	}

	@GetMapping("/healthz")
	public void healthz(Model model) {

		ResponseCodeDTO responseCodeDTO = new ResponseCodeDTO(1, "Service Is Running");
		model.addAttribute("responseCodeDTO", responseCodeDTO);

	}


}

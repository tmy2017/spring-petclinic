package org.springframework.samples.petclinic.vet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class YoController {
	@GetMapping("/yo")
	public String yo() {

        return "yo";
    }

}

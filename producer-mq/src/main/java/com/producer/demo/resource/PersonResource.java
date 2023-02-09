package com.producer.demo.resource;


import com.producer.demo.jms.Producer;
import com.producer.demo.model.Pessoa;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jms.JMSException;
import javax.naming.NamingException;

@RequiredArgsConstructor
@Controller
public class PersonResource {

	private final Producer producer;

	@GetMapping("/")
	public String index() {
		return "index.html";
	}

	@GetMapping("/cadastra-pessoas")
    private String cadastraPessoas(Model model){
		return "cadastra-pessoas.html";
    }
	
	@PostMapping(value="salvar")
	public String save(@RequestParam("name") String name, @RequestParam("age") int age, Model model) throws JMSException, NamingException {
		Pessoa pessoa = Pessoa.builder()
				.nome(name)
				.idade(age)
				.build();
		producer.send(pessoa);
		return "/cadastra-pessoas";
	}

}

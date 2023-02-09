package com.producer.demo.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pessoa {

	private int id;
	private String nome;
	private int idade;

}

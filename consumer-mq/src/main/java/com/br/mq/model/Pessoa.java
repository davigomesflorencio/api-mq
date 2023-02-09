package com.br.mq.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "pessoa")
@ToString
public class Pessoa {

	@GeneratedValue
	@Id
	private int id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "idade")
	private int idade;

}

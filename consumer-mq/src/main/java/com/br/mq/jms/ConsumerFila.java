package com.br.mq.jms;

import com.br.mq.repositories.PessoaRepository;
import com.br.mq.model.Pessoa;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class ConsumerFila {

    private final PessoaRepository personRepository;

    @JmsListener(destination = "${activemq.queue-name}")
    public void listen(String mensagem) {
        log.info(mensagem);
        Pessoa pessoa = new Pessoa();
        try {
            Gson gson = new Gson();
            pessoa = gson.fromJson(mensagem, Pessoa.class);
            personRepository.save(pessoa);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }

}

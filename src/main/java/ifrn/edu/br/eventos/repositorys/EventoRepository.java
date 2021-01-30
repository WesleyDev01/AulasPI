package ifrn.edu.br.eventos.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.edu.br.eventos.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {

}

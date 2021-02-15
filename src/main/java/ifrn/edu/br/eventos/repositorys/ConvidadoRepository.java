package ifrn.edu.br.eventos.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.edu.br.eventos.models.Convidado;
import ifrn.edu.br.eventos.models.Evento;

public interface ConvidadoRepository extends JpaRepository<Convidado, Long> {

	List<Convidado> findByEvento(Evento evento);

}

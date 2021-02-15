package ifrn.edu.br.eventos.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.edu.br.eventos.models.Convidado;

public interface ConvidadoRepository extends JpaRepository<Convidado, Long> {

}

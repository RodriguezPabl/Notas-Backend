package rodriguezpablo.nota.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rodriguezpablo.nota.model.Nota;

public interface NotaRepository extends JpaRepository<Nota, Long>{

}

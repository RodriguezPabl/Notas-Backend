package rodriguezpablo.nota.service;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import rodriguezpablo.nota.model.Nota;
import rodriguezpablo.nota.repository.NotaRepository;

@Service
public class NotaService {
	private final NotaRepository repo;
	
	public NotaService (NotaRepository repo) {
		this.repo = repo;
	}
	
	public List<Nota> listar() {
		return repo.findAll();
	}
	
	public Optional<Nota> obtener(Long id) {
		return repo.findById(id);
	}
	
	public Nota guardar(Nota nota) {
		return repo.save(nota);
	}
	
	public void eliminar(Long id) {
		repo.deleteById(id);
	}
	
}

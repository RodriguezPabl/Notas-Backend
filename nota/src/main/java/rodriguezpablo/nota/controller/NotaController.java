package rodriguezpablo.nota.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import rodriguezpablo.nota.model.Nota;
import rodriguezpablo.nota.service.NotaService;

@RestController
@RequestMapping("/notas")
public class NotaController {
	private final NotaService service;
	
	public NotaController(NotaService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Nota> listar() {
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Nota> obtener(@PathVariable Long id) {
		return service.obtener(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public Nota crear(@RequestBody Nota nota) {
		return service.guardar(nota);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Nota> actualizar(@PathVariable Long id, @RequestBody Nota nota) {
		return service.obtener(id).map(n -> {
			n.setTitulo(nota.getTitulo());
			n.setContenido(nota.getContenido());
			return ResponseEntity.ok(service.guardar(n));
		}).orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Long id) {
		if(service.obtener(id).isPresent()) {
			service.eliminar(id);
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build();
	}
}

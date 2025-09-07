package rodriguezpablo.nota.model;

import jakarta.persistence.*;
import java.time.LocalDateTime; 

@Entity
public class Nota {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	private String titulo;
	private String contenido;
	private LocalDateTime fechaCreacion;
	private LocalDateTime ultimaActualizacion;
	
	@PrePersist
	protected void onCreate() {
		fechaCreacion = LocalDateTime.now();
		ultimaActualizacion = LocalDateTime.now();
	}
	
	@PreUpdate
	protected void onUpdate() {
		ultimaActualizacion = LocalDateTime.now();
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getContenido() {
		return contenido;
	}
	
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}
	
	public LocalDateTime getUltimaActualizacion() {
		return ultimaActualizacion;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
 }

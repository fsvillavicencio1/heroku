package ec.edu.utpl.sic.gp.microservicio.dto;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Denuncia implements Serializable{
	private static final long serialVersionUID = 4894729030347835498L;
	
	@Id
	@GeneratedValue
    private Long id;
    private String tipo;
    private String ubicacion;
    private String descripcion;
    private boolean estado;
    
    public Denuncia() {}

    public Denuncia(Long id, String tipo, String ubicacion, String descripcion, boolean estado) {
        super();
    	this.id = id;
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Denuncia [id=");
        builder.append(id);
        builder.append(", tipo=");
        builder.append(tipo);
        builder.append(", ubicacion=");
        builder.append(ubicacion);
        builder.append(", descripcion=");
        builder.append(descripcion);
        builder.append(", estado=");
        builder.append(estado);
        builder.append("]");
        return builder.toString();
    }
}
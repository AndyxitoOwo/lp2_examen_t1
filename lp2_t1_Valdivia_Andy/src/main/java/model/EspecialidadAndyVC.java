package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbl_especialidad")
public class EspecialidadAndyVC {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_especialidad")
	private int idEspecialidad;
	@Column(name="titulo")
	private String titulo;
}

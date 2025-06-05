package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "tbl_equipo_dental")
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
public class EquipoDentalAndyVC {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="nro_equipo")
	private int nroEquipo;
	@Column(name="nombre")
	private String nombre;
	@Column(name="costo")
	private double costo;
	@Column(name="fecha_adquisicion",columnDefinition = "DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP")
	private LocalDate fechaAdquisicion;
	@Column(name="estado")
	private String estado;
	@JoinColumn(name = "id_dentista")
	@ManyToOne(fetch = FetchType.LAZY)
	private DentistaAndyVC idDentista;
}

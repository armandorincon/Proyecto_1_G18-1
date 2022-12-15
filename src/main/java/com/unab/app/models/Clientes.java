package com.unab.app.models;


@Entity
@Table(name = "cliente")
public class Clientes implements Serializable{
	
	/**
	 * 
	 */
private static final long seiaLVersionUID = 1L;

@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
@Column(name="id_cliente")
private Long id;

	


	
}

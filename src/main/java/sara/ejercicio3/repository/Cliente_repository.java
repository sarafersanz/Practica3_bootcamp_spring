package sara.ejercicio3.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import sara.ejercicio3.entities.Cliente;

public interface Cliente_repository extends JpaRepository<Cliente, Integer> {
	// Con @Repository le indico los metodos principales select, create, update, delete


	//Convención sobre convicción
	//Crud_repository permite realizar busquedas por campo según la entidad
	Optional<Cliente> findByNombreTorre(String nombre);

	boolean existsByNombreTorre(String nombre);

}

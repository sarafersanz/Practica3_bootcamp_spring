package sara.ejercicio3.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sara.ejercicio3.entities.Cliente;
import sara.ejercicio3.repository.Cliente_repository;


@Service

public class Cliente_service {
	//Inyección de dependecias (crea una instancia cuando lo requiera)
    @Autowired
    Cliente_repository torreRepository;

    //Por defecto el repositorio al extender de JPA trae el metodo por defecto
    public List<Cliente> listaTorre(){
        return  torreRepository.findAll();
    }

    public Optional<Cliente> getTorre(int idTorre){
        return  torreRepository.findById(idTorre);
    }

    public Optional<Cliente> getByNombreTorre(String nombreTorre){
        return torreRepository.findByNombreTorre(nombreTorre);
    }

    public void saveTorre(Cliente torre){
        torreRepository.save(torre);
    }

    public void deleteTorre(int idTorre){
        torreRepository.deleteById(idTorre);
    }

    public boolean existsByIdTorre(int idTorre){
        return torreRepository.existsById(idTorre);
    }

    public boolean existsByNombreTorre(String nombreTorre){
        return torreRepository.existsByNombreTorre(nombreTorre);
    }
}

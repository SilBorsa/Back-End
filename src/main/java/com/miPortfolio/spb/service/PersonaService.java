package com.miPortfolio.spb.service;

//logica del negocio

//import com.miPortfolio.spb.interfaz.IPersonaService;
import com.miPortfolio.spb.model.Persona;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.miPortfolio.spb.repository.PersonaRepository;
import java.util.Optional;

@Service
@Transactional
public class PersonaService { //implements IPersonaService{
    //traigo el repositorio para leer los campos
    @Autowired 
    PersonaRepository personaRepository;
    
    //se trae automaticamente con clic derecho implementes abstract methods
    //@Override
    //public List<Persona> getPersona() {
    //  return personaRepository.findAll();  
    //}
    
    public List<Persona> list(){
        return personaRepository.findAll();
    }

    public Optional<Persona> getOne(int idPersona){
        return personaRepository.findById(idPersona);
    }
    
     public Optional<Persona> getByNombrePersona(String nombrePersona) {
        return personaRepository.findByNombrePersona(nombrePersona);
    }
    
    //@Override
    public void save(Persona persona) {
      personaRepository.save(persona);
    }

    //@Override
    public void delete(int idPersona) {
      personaRepository.deleteById(idPersona);
    }
    
    public boolean existsById(int idPersona){
        return personaRepository.existsById(idPersona);
    }
    
    public boolean existsByNombrePersona(String nombrePersona){
        return personaRepository.existsByNombrePersona(nombrePersona);
    } 
}

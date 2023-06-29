package com.miPortfolio.spb.controller;

import com.miPortfolio.spb.dto.dtoPersona;
import com.miPortfolio.spb.model.Persona;
import com.miPortfolio.spb.security.controller.Mensaje;
import com.miPortfolio.spb.service.PersonaService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("persona")
@CrossOrigin(origins="http://localhost:4200")
public class PersonaController {
    @Autowired
    //IPersonaService ipersonaService;
    PersonaService personaService;
 
    //Listar
    @GetMapping("/listar")
    public ResponseEntity<List<Persona>> list(){
        List<Persona> list = personaService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    //Detallar
    @GetMapping("/detail/{idPersona}")
    public ResponseEntity<Persona> getById(@PathVariable("idPersona") int idPersona){
        if(!personaService.existsById(idPersona))
            return new ResponseEntity(new Mensaje("Ese id no existe en la tabla Persona!"), HttpStatus.NOT_FOUND);
        Persona persona = personaService.getOne(idPersona).get();
        return new ResponseEntity(persona, HttpStatus.OK);
    }
    
    //crear
    @PostMapping("/crear")
    public ResponseEntity<?> create(@RequestBody dtoPersona dtoPersona){
        if(StringUtils.isBlank(dtoPersona.getNombrePersona()))
            return new ResponseEntity(new Mensaje("Debe ingresar el nombre de la persona!"), HttpStatus.BAD_REQUEST);
        if(personaService.existsByNombrePersona(dtoPersona.getNombrePersona()))
            return new ResponseEntity(new Mensaje("Esta persona ya existe!"), HttpStatus.BAD_REQUEST);
        
        Persona persona = new Persona (dtoPersona.getNombrePersona(), 
                                       dtoPersona.getApellidoPersona(),
                                       dtoPersona.getSubTitulo(),
                                       dtoPersona.getEmailPersona(),
                                       dtoPersona.getCeluPersona(),
                                       dtoPersona.getAcercaPersona(),
                                       dtoPersona.getUrl_imgPersona());
        personaService.save(persona);
        return new ResponseEntity(new Mensaje("Habilidad blanda guardada!"), HttpStatus.OK);
    }
    
    //edicion
    @PutMapping("/editar/{idPersona}")
    public ResponseEntity<?> update(@PathVariable("idPersona") int idPersona, @RequestBody dtoPersona dtoPersona){
        if(!personaService.existsById(idPersona))
            return new ResponseEntity(new Mensaje("El id no existe en la tabla Persona"), HttpStatus.BAD_REQUEST);
        if(personaService.existsByNombrePersona(dtoPersona.getNombrePersona()) && personaService.getByNombrePersona(dtoPersona.getNombrePersona()).get().getIdPersona() != idPersona)
            return new ResponseEntity(new Mensaje("Esa persona ya existe!"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(dtoPersona.getNombrePersona()))
            return new ResponseEntity(new Mensaje("Debe ingresar el nombre de la persona"), HttpStatus.BAD_REQUEST);
        
        Persona persona = personaService.getOne(idPersona).get();
        persona.setNombrePersona(dtoPersona.getNombrePersona());
        persona.setApellidoPersona(dtoPersona.getApellidoPersona());
        persona.setSubTitulo(dtoPersona.getSubTitulo());
        persona.setEmailPersona(dtoPersona.getEmailPersona());
        persona.setCeluPersona(dtoPersona.getCeluPersona());
        persona.setAcercaPersona(dtoPersona.getAcercaPersona());
        persona.setUrl_imgPersona(dtoPersona.getUrl_imgPersona());
                
        personaService.save(persona);
        return new ResponseEntity(new Mensaje("Persona actualizada!"), HttpStatus.OK);
    }

    @DeleteMapping("/borrar/{idPersona}")
    public ResponseEntity<?> delete(@PathVariable("idPersona") int idPersona){
        if(!personaService.existsById(idPersona))
            return new ResponseEntity(new Mensaje("El id no existe en la tabla persona!"), HttpStatus.BAD_REQUEST);
        personaService.delete(idPersona);
        return new ResponseEntity(new Mensaje("Persona eliminada!"), HttpStatus.OK);
    }
    
}
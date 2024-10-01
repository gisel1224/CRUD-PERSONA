package nodo.crudPersona.controllers;


import nodo.crudPersona.models.Persona;
import nodo.crudPersona.repositories.PersonaRepository;
import nodo.crudPersona.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = "*")
public class PersonaController {

    @Autowired
    private PersonaRepository _personaRepository;

    @GetMapping("/index")
    public ResponseEntity<List<Persona>> index() {
        try {
            List<Persona> books = new PersonaService(_personaRepository).index();

            return new ResponseEntity<>(books, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/Create")
    public ResponseEntity<Persona> Create(@RequestBody Persona persona) {
        try {
            Persona book = new PersonaService(_personaRepository).saveAndFlush(persona);

            return new ResponseEntity<>(book, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/Update")
    public ResponseEntity<Persona> Update(@RequestParam int id, @RequestBody Persona persona) {
        try {
            Persona book = new PersonaService(_personaRepository).update(id, persona);

            return new ResponseEntity<>(book, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/Delete")
    public ResponseEntity<Persona> Delete(@RequestParam int id) {
        try {
            Persona book = new PersonaService(_personaRepository).delete(id);

            return new ResponseEntity<>(book, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/getByName")
    public ResponseEntity<List<Persona>> getByName(@RequestParam String nombre) {
        try {
            List<Persona> books = new PersonaService(_personaRepository).findByNombre(nombre);

            return new ResponseEntity<>(books, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/getByApellido")
    public ResponseEntity<List<Persona>> getByApellido(@RequestParam String apellido) {
        try {
            List<Persona> books = new PersonaService(_personaRepository).findByApellido(apellido);

            return new ResponseEntity<>(books, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/getByEdad")
    public ResponseEntity<List<Persona>> getByEdad(@RequestParam int edad) {
        try {
            List<Persona> books = new PersonaService(_personaRepository).findByEdad(edad);

            return new ResponseEntity<>(books, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/getByEmail")
    public ResponseEntity<List<Persona>> getByEmail(@RequestParam String email) {
        try {
            List<Persona> books = new PersonaService(_personaRepository).findByEmail(email);

            return new ResponseEntity<>(books, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/getByDNI")
    public ResponseEntity<List<Persona>> getByDNI(@RequestParam String DNI) {
        try {
            List<Persona> books = new PersonaService(_personaRepository).findByDNI(DNI);

            return new ResponseEntity<>(books, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/getByTipoDNI")
    public ResponseEntity<List<Persona>> getByTipoDNI(@RequestParam String Tipo_DNI) {
        try {
            List<Persona> books = new PersonaService(_personaRepository).findByTipoDNI(Tipo_DNI);

            return new ResponseEntity<>(books, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/getByGenero")
    public ResponseEntity<List<Persona>> getByGenero(@RequestParam String Genero) {
        try {
            List<Persona> books = new PersonaService(_personaRepository).findByGenero(Genero);

            return new ResponseEntity<>(books, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}


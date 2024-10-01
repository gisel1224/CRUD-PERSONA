package nodo.crudPersona.services;

import nodo.crudPersona.interfas.BasePersonaService;
import nodo.crudPersona.models.Persona;
import nodo.crudPersona.repositories.PersonaRepository;

import java.util.List;

public class PersonaService implements BasePersonaService {

    private PersonaRepository _personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        _personaRepository = personaRepository;
    }

    @Override
    public List<Persona> index() {
        return _personaRepository.index();
    }

    @Override
    public List<Persona> findById(int id) {
        return _personaRepository.findById(id);
    }

    @Override
    public List<Persona> findByNombre(String nombre) {
        return _personaRepository.findByNombre(nombre);
    }

    @Override
    public List<Persona> findByApellido(String apellido) {
        return _personaRepository.findByApellido(apellido);
    }

    @Override
    public List<Persona> findByEdad(int edad) {
        return _personaRepository.findByEdad(edad);
    }

    @Override
    public List<Persona> findByEmail(String email) {
        return _personaRepository.findByEmail(email);
    }

    @Override
    public List<Persona> findByDNI(String DNI) {
        return _personaRepository.findByDNI(DNI);
    }

    @Override
    public List<Persona> findByTipoDNI(String TipoDNI) {
        return _personaRepository.findByTipoDNI(TipoDNI);
    }

    @Override
    public List<Persona> findByGenero(String Genero) {
        return _personaRepository.findByGenero(Genero);
    }

    @Override
    public Persona saveAndFlush(Persona persona) {
        return _personaRepository.saveAndFlush(persona);
    }

    @Override
    public Persona update(int id, Persona persona) {
        List<Persona> personaList = _personaRepository.findById(id);
        if (personaList.size() > 0) {
            Persona personaToUpdate = personaList.get(0);

            personaToUpdate.setNombre(persona.getNombre());
            personaToUpdate.setApellido(persona.getApellido());
            personaToUpdate.setEdad(persona.getEdad());
            personaToUpdate.setEmail(persona.getEmail());
            personaToUpdate.setDNI(persona.getDNI());
            personaToUpdate.setTipo_DNI(persona.getTipo_DNI());
            personaToUpdate.setGenero(persona.getGenero());

            return _personaRepository.saveAndFlush(personaToUpdate);
        }
        return null;
    }

    @Override
    public Persona delete(int id) {
        List<Persona> personaList = _personaRepository.findById(id);
        if (personaList.size() > 0) {
            Persona personaToDelete = personaList.get(0);
            _personaRepository.delete(personaToDelete);
            return personaToDelete;
        }
        return null;
    }
}

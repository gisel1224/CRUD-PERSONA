package nodo.crudPersona.interfas;

import nodo.crudPersona.models.Persona;

import java.util.List;

public interface BasePersonaService {

    // Estos son los metodos de Read
    List<Persona> index();
    List<Persona> findById(int id);
    List<Persona> findByNombre(String nombre);
    List<Persona> findByApellido(String apellido);
    List<Persona> findByEdad(int edad);
    List<Persona> findByEmail(String email);
    List<Persona> findByDNI(String DNI);
    List<Persona> findByTipoDNI(String Tipo_DNI);
    List<Persona> findByGenero(String Genero);

    // Este es el metodo de Create
    Persona saveAndFlush(Persona persona);

    // Este es el metodo de Update
    Persona update(int id, Persona persona);

    // Este es el de Delete
    Persona delete(int id);
}

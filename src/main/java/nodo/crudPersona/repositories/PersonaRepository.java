package nodo.crudPersona.repositories;

import nodo.crudPersona.models.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonaRepository extends CrudRepository<Persona, Long> {

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM persona")
    List<Persona> index();

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM persona WHERE id = :id")
    List<Persona> findById(int id);

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM persona WHERE nombre LIKE %:nombre%")
    List<Persona> findByNombre(String nombre);

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM persona WHERE apellido LIKE %:apellido%")
    List<Persona> findByApellido(String apellido);

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM persona WHERE edad = :edad")
    List<Persona> findByEdad(int edad);

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM persona WHERE email LIKE %:email%")
    List<Persona> findByEmail(String email);

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM persona WHERE DNI LIKE %:DNI%")
    List<Persona> findByDNI(String DNI);

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM persona WHERE Tipo_DNI LIKE %:Tipo_DNI%")
    List<Persona> findByTipoDNI(String Tipo_DNI);

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM persona WHERE Genero LIKE %:Genero%")
    List<Persona> findByGenero(String Genero);

    Persona saveAndFlush(Persona persona);

}
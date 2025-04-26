package com.example.demo_hibeJpa.service;

import com.example.demo_hibeJpa.model.Persona;

import java.util.List;

public interface IPersonaService {
    //metodo para traer todas las personas
    public List<Persona> getPersonas();

    //metodo para dar alta una persona
    public void savePersona(Persona perso);

    //metodo para borrar persona
    public void deletePersona(Long id);

    //metodo para encontrar una sola persona
    public Persona findPersona(Long id);

    //metodo para editar una persona
    public void editPersona(Long idOriginal,
                            Long idNueva,
                            String nuevoNombre,
                            String nuevoApellido,
                            int nuevaEdad);
}

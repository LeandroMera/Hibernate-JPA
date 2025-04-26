package com.example.demo_hibeJpa.controller;

import com.example.demo_hibeJpa.model.Persona;
import com.example.demo_hibeJpa.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {
    @Autowired
    private IPersonaService persoServ;

    //endpoint para obtener todas las personas
    @GetMapping("/personas/traer")
    public List<Persona> getPersonas() {
        return persoServ.getPersonas();
    }

    //endpoint para crear una nueva persona
    @PostMapping("/personas/crear")
    public String savePersona(@RequestBody Persona perso) {
        persoServ.savePersona(perso);
        return "Persona creada correctamente";
    }

    //para dar de baja una persona
    @DeleteMapping("/personas/borrar/{id}")
    public String borrarPersona(@PathVariable Long id) {
        persoServ.deletePersona(id);
        return "Persona eliminada correctamente";
    }

    //para modificar una persona
    @PutMapping("/personas/editar/{idOriginal}")
    public Persona editarPersona(@PathVariable Long idOriginal,
               @RequestParam(required = false, name = "id")Long idNuena,
               @RequestParam(required = false, name = "nombre") String nuevoNombre,
               @RequestParam(required = false, name = "apellido") String nuevoApellido,
               @RequestParam(required = false, name = "edad") int nuevaEdad) {

        persoServ.editPersona(idOriginal, idNuena, nuevoNombre, nuevoApellido, nuevaEdad);

        Persona perso = persoServ.findPersona(idNuena);
        return perso;
    }
}

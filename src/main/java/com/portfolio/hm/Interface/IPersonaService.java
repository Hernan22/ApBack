package com.portfolio.hm.Interface;

import com.portfolio.hm.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer un lista de personas
    public List<Persona> getPersona();
    
    //guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //eliminar un objeto por ID
    public void deletePersona(Long id);
    
    //buscar una persona por ID
    public Persona findPersona(Long id);
}

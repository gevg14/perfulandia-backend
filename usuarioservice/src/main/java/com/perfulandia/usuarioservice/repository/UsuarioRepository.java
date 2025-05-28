package com.perfulandia.usuarioservice.repository;


import com.perfulandia.usuarioservice.model.Usuario;
//2 Importar JPA Repository para trabajar con CRUD
import org.springframework.data.jpa.repository.JpaRepository;

//Interfaz hereda de JPA y gestiona la entidad usuario con ID Long
//findAll()
//findById(id)
//save() guardar
//delete eliminar
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


}

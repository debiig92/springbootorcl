/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.prueba.repository;

import com.prueba.prueba.sentidades.DataTipoUsuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Debora
 */
@Repository
public interface DataTipoUsuarioDAO extends CrudRepository<DataTipoUsuario,Integer>{
    
}

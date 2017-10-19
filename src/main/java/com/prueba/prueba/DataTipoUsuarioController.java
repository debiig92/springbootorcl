/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.prueba;

import com.prueba.prueba.sentidades.DataTipoUsuario;
import com.prueba.prueba.repository.DataTipoUsuarioDAO;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Debora
 */
@Controller
public class DataTipoUsuarioController {
    
  @Autowired
   private DataTipoUsuarioDAO dataiu;
 
   @RequestMapping(value="/crearDataTipoUsuario")   
    public ModelAndView mostrar(){
    return new ModelAndView("DataTipoUsuario/crearDataTipoUsuario");
    }
    
    
 @RequestMapping(value="/datatipousuario/add" ,method=RequestMethod.POST)
    public ModelAndView guardar(@Valid DataTipoUsuario datatipousuario, BindingResult result){
        
    long acumulador=0;
    if(dataiu.count()==0){
        datatipousuario.setIddt(1);
       
        }
    else{
        acumulador=dataiu.count();
        int valor=(int) acumulador;
        datatipousuario.setIddt(valor+1);
       
      }
     ModelAndView modelandview= new ModelAndView("DataTipoUsuario/crearDataTipoUsuario");
     dataiu.save(datatipousuario);
     return modelandview;}
    }

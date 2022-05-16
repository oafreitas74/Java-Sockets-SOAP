/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */

package com.sd.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author oafre
 */
@WebService(serviceName="WSEscutas")
public class WSEscutas {

    /** This is a sample web service operation */
    @WebMethod(operationName = "inserirDados")
    public Boolean inserirDados(@WebParam(name = "tipo") String tipo, @WebParam(name = "nomeEscuta") String nomeEscuta, @WebParam(name = "nomeCeluda") String nomeCeluda, @WebParam(name = "dados") String dados) {
       
       GereBD bd = new GereBD();
       return bd.inserirDados(tipo, nomeEscuta, nomeCeluda, dados);
        
        
    }  
}

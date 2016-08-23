/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ifpe.jsf.beans;

import javax.annotation.ManagedBean;

/**
 *
 * @author Aluno
 */
@ManagedBean
public class HelloBean 
{
    public String getMessage()
    {
        return "Hello JavaServer Faces!";
    }
}

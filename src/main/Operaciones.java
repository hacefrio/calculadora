/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


/**
 *
 * @author Sebastian
 */
public class Operaciones {
    
    public static String Calcular(String entrada){
    ScriptEngineManager manager = new ScriptEngineManager(); 
    ScriptEngine interprete = manager.getEngineByName("js"); 
    String resultado="Error";
    try { 
      String formula = entrada; 
      resultado=String.valueOf(interprete.eval(formula)); 
    } catch(ScriptException se) { 
      se.printStackTrace(); 
    } 
    return resultado;
  }
    
}
    


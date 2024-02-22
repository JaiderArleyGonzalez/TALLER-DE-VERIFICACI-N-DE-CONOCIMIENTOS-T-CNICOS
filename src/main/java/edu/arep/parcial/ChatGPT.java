package edu.arep.parcial;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.lang.Integer.parseInt;

public class ChatGPT {
    private Field[] campos;
    private Method[] metodos;
    public ChatGPT(){
        
    }
    public void Class(String className) throws ClassNotFoundException{
        Class c = Class.forName(className);
        campos = c.getFields();
        metodos = c.getMethods();
        
    }
    

    public static Object invoke(String className, String methodName){
        try {
            Class<?> c = Class.forName(className);
            Method metodo = c.getDeclaredMethod(methodName, null);
            System.out.format("invoking ", c.getName());
            return metodo.invoke(null, null);
            
        } catch (ClassNotFoundException x) {
            x.printStackTrace();
        } catch (NoSuchMethodException x) {
            x.printStackTrace();
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ChatGPT.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(ChatGPT.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(ChatGPT.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public static Object unaryInvoke(String className, String methodName, String paramtype, String paramValue){
        try {
            Class<?> c = Class.forName(className);
            if(paramtype == "String"){
                Class[] argTypes = new Class[]{String.class};
                Method metodo = c.getDeclaredMethod(methodName, argTypes);
                System.out.format("invoking", c.getName());
                return metodo.invoke(null,  paramValue); 

            }else if(paramtype == "int"){
                Class[] argTypes = new Class[]{int.class};
                Method metodo = c.getDeclaredMethod(methodName, argTypes);
                System.out.format("invoking", c.getName());
                return metodo.invoke(null,  parseInt(paramValue) ); 
            }else if(paramtype == "Double"){
                Class[] argTypes = new Class[]{Double.class};
                Method metodo = c.getDeclaredMethod(methodName, argTypes);
                System.out.format("invoking", c.getName());
                return metodo.invoke(null, Double.parseDouble(paramValue));
            }
        } catch (ClassNotFoundException x) {
            x.printStackTrace();
        } catch (NoSuchMethodException x) {
            x.printStackTrace();
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ChatGPT.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(ChatGPT.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(ChatGPT.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Object binaryInvoke(String className, String methodName, String paramType1, String paramValue1, String paramType2, String paramValue2){
        try {
            Class<?> c = Class.forName(className);
            
            if(paramType1 == "String" && paramType2 == "String"){
                Class[] argTypes = new Class[]{String.class, String.class};
                Method metodo = c.getDeclaredMethod(methodName, argTypes);
                System.out.format("invoking", c.getName());
                return metodo.invoke(null,  paramValue1, paramValue2); 

            }else if(paramType1 == "String" && paramType2 == "int"){
                Class[] argTypes = new Class[]{String.class, int.class};
                Method metodo = c.getDeclaredMethod(methodName, argTypes);
                System.out.format("invoking", c.getName());
                return metodo.invoke(null,  paramValue1, parseInt(paramValue2)); 

            }else if(paramType1 == "String" && paramType2 == "Double"){
                Class[] argTypes = new Class[]{String.class, Double.class};
                Method metodo = c.getDeclaredMethod(methodName, argTypes);
                System.out.format("invoking", c.getName());
                return metodo.invoke(null,  paramValue1, Double.parseDouble(paramValue2)); 

            }else if(paramType1 == "int" && paramType2 == "String"){
                Class[] argTypes = new Class[]{int.class, String.class};
                Method metodo = c.getDeclaredMethod(methodName, argTypes);
                System.out.format("invoking", c.getName());
                return metodo.invoke(null,  parseInt(paramValue1), paramValue2); 
            }else if(paramType1=="int"  && paramType2 == "Double"){
                Class[] argTypes = new Class[]{int.class, Double.class};
                Method metodo = c.getDeclaredMethod(methodName, argTypes);
                System.out.format("invoking", c.getName());
                return metodo.invoke(null,  parseInt(paramValue1), Double.parseDouble(paramValue2)); 

            }else if(paramType1 == "int" && paramType2 == "int"){
                Class[] argTypes = new Class[]{int.class, int.class};
                Method metodo = c.getDeclaredMethod(methodName, argTypes);
                System.out.format("invoking", c.getName());
                return metodo.invoke(null,  parseInt(paramValue1), parseInt(paramValue2)); 

            }else if(paramType1 == "Double" && paramType2 == "int"){
                Class[] argTypes = new Class[]{Double.class, int.class};
                Method metodo = c.getDeclaredMethod(methodName, argTypes);
                System.out.format("invoking", c.getName());
                return metodo.invoke(null,  Double.parseDouble(paramValue1), parseInt(paramValue2)); 

            }else if(paramType1 == "Double" && paramType2 == "String"){
                Class[] argTypes = new Class[]{Double.class, String.class};
                Method metodo = c.getDeclaredMethod(methodName, argTypes);
                System.out.format("invoking", c.getName());
                return metodo.invoke(null,  Double.parseDouble(paramValue1), paramValue2); 
            }else if(paramType1 == "Double" && paramType2 == "Double"){
                Class[] argTypes = new Class[]{String.class, Double.class};
                Method metodo = c.getDeclaredMethod(methodName, argTypes);
                System.out.format("invoking", c.getName());
                return metodo.invoke(null,  Double.parseDouble(paramValue1), Double.parseDouble(paramValue2)); 

            }
            
        } catch (ClassNotFoundException x) {
            x.printStackTrace();
        } catch (NoSuchMethodException x) {
            x.printStackTrace();
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ChatGPT.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(ChatGPT.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(ChatGPT.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 3;
    }
}

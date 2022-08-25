/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.progra2.proyecto1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

/**
 *
 * @author dual4
 */
public class Proyecto1 {

    public static void main(String[] args) {
        int max=5000;
        int min=1000;
        int opcion;
        boolean salir = false;
        Scanner sn = new Scanner(System.in);
         List<clsVendedores> empleados = new ArrayList();
        
        clsVendedores vend = new clsVendedores("Irwin");
//        vend.setEnero((Math.floor(Math.random()*(max-min)+1)));
//        vend.setFebrero((Math.floor(Math.random()*(max-min)+1)));
//        vend.setMarzo((Math.floor(Math.random()*(max-min)+1)));
//        vend.setAbril((Math.floor(Math.random()*(max-min)+1)));
        empleados.add(vend);
        
        vend = new clsVendedores("Jeovani");
//        vend.setEnero((Math.floor(Math.random()*(max-min)+1)));
//        vend.setFebrero((Math.floor(Math.random()*(max-min)+1)));
//        vend.setMarzo((Math.floor(Math.random()*(max-min)+1)));
//        vend.setAbril((Math.floor(Math.random()*(max-min)+1)));
        empleados.add(vend);
        
        vend = new clsVendedores("Marvin");
//        vend.setEnero((Math.floor(Math.random()*(max-min)+1)));
//        vend.setFebrero((Math.floor(Math.random()*(max-min)+1)));
//        vend.setMarzo((Math.floor(Math.random()*(max-min)+1)));
//        vend.setAbril((Math.floor(Math.random()*(max-min)+1)));
        empleados.add(vend);
        
        vend = new clsVendedores("Eduardo");
//        vend.setEnero((Math.floor(Math.random()*(max-min)+1)));
//        vend.setFebrero((Math.floor(Math.random()*(max-min)+1)));
//        vend.setMarzo((Math.floor(Math.random()*(max-min)+1)));
//        vend.setAbril((Math.floor(Math.random()*(max-min)+1)));
        empleados.add(vend);
        
        vend = new clsVendedores("Jonatan");
//        vend.setEnero((Math.floor(Math.random()*(max-min)+1)));
//        vend.setFebrero((Math.floor(Math.random()*(max-min)+1)));
//        vend.setMarzo((Math.floor(Math.random()*(max-min)+1)));
//        vend.setAbril((Math.floor(Math.random()*(max-min)+1)));
        empleados.add(vend);
        
        vend = new clsVendedores("Ian");
//        vend.setEnero((Math.floor(Math.random()*(max-min)+1)));
//        vend.setFebrero((Math.floor(Math.random()*(max-min)+1)));
//        vend.setMarzo((Math.floor(Math.random()*(max-min)+1)));
//        vend.setAbril((Math.floor(Math.random()*(max-min)+1)));
        empleados.add(vend);
        
        vend = new clsVendedores("Alaia");
//        vend.setEnero((Math.floor(Math.random()*(max-min)+1)));
//        vend.setFebrero((Math.floor(Math.random()*(max-min)+1)));
//        vend.setMarzo((Math.floor(Math.random()*(max-min)+1)));
//        vend.setAbril((Math.floor(Math.random()*(max-min)+1)));
        empleados.add(vend);
        
        vend = new clsVendedores("Sindy");
//        vend.setEnero((Math.floor(Math.random()*(max-min)+1)));
//        vend.setFebrero((Math.floor(Math.random()*(max-min)+1)));
//        vend.setMarzo((Math.floor(Math.random()*(max-min)+1)));
//        vend.setAbril((Math.floor(Math.random()*(max-min)+1)));
        empleados.add(vend);
        
        
        double sumaEnero=0;
        double sumaFebrero=0;
        double sumaMarzo=0;
        double sumaAbril=0;
        double totVentas=0;
        double comi=0;
        double isr=0;
        double totLiquido=0;
//        double comisionesE=0;
//        double comisionesF=0;
//        double comisionesM=0;
//        double comisionesA=0;
        
        System.out.println("NOMBRE \tENERO\tFEBRERO\tMARZO\tABRIL\tTOT VENT  COM\tISR 5%\tLIQUIDO");
        for(clsVendedores v: empleados){
            v.setEnero((Math.floor(Math.random()*(max-min)+1)));
            v.setFebrero((Math.floor(Math.random()*(max-min)+1)));
            v.setMarzo((Math.floor(Math.random()*(max-min)+1)));
            v.setAbril((Math.floor(Math.random()*(max-min)+1)));
            
            v.setTotalVentas(v.getEnero()+v.getFebrero()+v.getMarzo()+v.getAbril());
            
            if(v.getEnero()<2001){
                v.setVeinte(v.getEnero()*0.2);
                v.setTrintacinco(0);
            }else if (v.getEnero()>2000){
                v.setTrintacinco(v.getEnero()*0.35);
                v.setVeinte(0);
             }
            else{
            return;
            }
            v.setComEn(Math.floor(v.getVeinte()+v.getTrintacinco()));
            
            if(v.getFebrero()<2001){
                v.setVeinte(v.getFebrero()*0.2);
                v.setTrintacinco(0);
            }else if (v.getFebrero()>2000){
                v.setTrintacinco(v.getFebrero()*0.35);
                v.setVeinte(0);
            }
            else{
            return;
            }
            v.setComFe(Math.floor(v.getVeinte()+v.getTrintacinco()));
            
            if(v.getMarzo()<2001){
                v.setVeinte(v.getMarzo()*0.2);
                v.setTrintacinco(0);
            }else if (v.getMarzo()>2000){
                v.setTrintacinco(v.getMarzo()*0.35);
                v.setVeinte(0);
            }
            else{
            return;
            }
            v.setComMa(Math.floor(v.getVeinte()+v.getTrintacinco()));
                       
            if(v.getAbril()<2001){
                v.setVeinte(v.getAbril()*0.2);
                v.setTrintacinco(0);
            }else if (v.getAbril()>2000){
                v.setTrintacinco(v.getAbril()*0.35);
                v.setVeinte(0);
            }
            else{
            return;
            }
            v.setComAb(Math.floor(v.getVeinte()+v.getTrintacinco()));
            
            v.setIsr(Math.floor(v.getTotalVentas()*0.05));
            
            v.setTotalComVentas(v.getComEn()+v.getComFe()+v.getComMa()+v.getComAb());
            
            v.setLiquido(Math.floor((v.getTotalVentas()-v.getIsr()+v.getTotalComVentas())));
            
            
            
            System.out.println(v.getNombre()+"\t"+v.getEnero()+"\t"+v.getFebrero()+"\t"+v.getMarzo()+"\t"+v.getAbril()+"\t"+v.getTotalVentas()+"\t"+v.getTotalComVentas()+"\t"+v.getIsr()+"\t"+v.getLiquido());
            
            
  
            
           
 
//            double mayor=0;
//            int nmayor=0;
//            double menor=5000;
//               int nmenor=0;
//                for (int k = 0; k < ve.length; k++) {
//             if(v.getLiquido()>mayor){
//                mayor=v.getLiquido();
//                nmayor=k;
//              }else if(v.getLiquido()<menor){
//                menor=v.getLiquido();
//                nmenor=k; 
//              }
//                }
                
                
            /*comisionesE=v.getVeinte()+v.getTrintacinco();
            v.setTotalComVentas(comisionesE);
            */
                               
            /*if(v.getFebrero()<=2000){
                v.setVeinte(v.getFebrero()*0.2);
                v.setTotalComVentas(v.getVeinte());
            }else{
                v.setTrintacinco(v.getFebrero()*0.35);
            }
            //comisiones=v.getVeinte()+v.getTrintacinco();
            //v.setTotalComVentas(comisiones);
           // comisiones=0;
            
            if(v.getMarzo()<=2000){
                v.setVeinte(v.getMarzo()*0.2);
                v.setTotalComVentas(v.getVeinte());
            }else{
                v.setTrintacinco(v.getMarzo()*0.35);
            }
            //comisiones=v.getVeinte()+v.getTrintacinco();
           // v.setTotalComVentas(comisiones);
           // comisiones=0;
            
             if(v.getAbril()<=2000){
                v.setVeinte(v.getAbril()*0.2);
                v.setTotalComVentas(v.getVeinte());
            }else{
                v.setTrintacinco(v.getAbril()*0.35);
            }
            //comisiones=v.getVeinte()+v.getTrintacinco();
          //  v.setTotalComVentas(comisiones);
          //  comisiones=0;
            */
            
            
            sumaEnero +=v.getEnero();
            sumaFebrero +=v.getFebrero();
            sumaMarzo +=v.getMarzo();
            sumaAbril +=v.getAbril();
            totVentas+=v.getTotalVentas();
            comi+=v.getTotalComVentas();
            isr+=v.getIsr();
            totLiquido+=v.getLiquido();
            
            
            
        }
        System.out.println("TOTAL   "+sumaEnero+"\t"+sumaFebrero+"\t"+sumaMarzo+"\t"+sumaAbril+"\t"+totVentas+"\t"+comi+"\t"+isr+"\t"+totLiquido);
        
        
        
        
        /*System.out.println("La suma de febrero es: "+sumaFebrero);
        System.out.println("La suma de marzo es: "+sumaMarzo);
        System.out.println("La suma de abril es: "+sumaAbril);
        System.out.println("La suma de abril es: "+sumaAbril);
        System.out.println("La suma de abril es: "+sumaAbril);
        System.out.println("La suma de abril es: "+sumaAbril);*/
        /*
        for (int i = 0; i < empleados.size(); i++) {
            System.out.println("Nombre "+empleados.get(i).getNombre());
            System.out.println("Mes Enero "+empleados.get(i).getEnero());
            System.out.println("Comi "+empleados.get(i).getComEn());
            System.out.println("Mes Febrero "+empleados.get(i).getFebrero());
            System.out.println("Comi "+empleados.get(i).getComFe());
            System.out.println("Mes Marzo "+empleados.get(i).getMarzo());
            System.out.println("Comi "+empleados.get(i).getComMa());
            System.out.println("Mes Abril "+empleados.get(i).getAbril());
            System.out.println("Comi "+empleados.get(i).getComAb());
            System.out.println("TOTAL DE VENTAS "+empleados.get(i).getTotalVentas());
            System.out.println("TOTAL DE COMISIONES "+ empleados.get(i).getTotalComVentas());
            System.out.println("ISR "+ empleados.get(i).getIsr());
            System.out.println("TOTAL LIQUIDO "+ empleados.get(i).getLiquido());
        }*/
        
       
        
        
        
        /*
        for (int i = 0; i < empleados.size(); i++) {
            System.out.println("Nombre "+empleados.get(i).getNombre());
            System.out.println("Mes "+empleados.get(i).getEnero());
        }*/
        
}
        
        
//         empleados.forEach(new Consumer<clsVendedores>() {
//            @Override
//            public void accept(clsVendedores empleados) {
//                System.out.println(empleados.getNombre());
//            }
        
        
        
        
//      for(clsVendedores v: empleados){
//            System.out.println("Nombres "+v.getNombre());
//            System.out.println("mes enero "+v.getEnero());
//        }
//    });
}


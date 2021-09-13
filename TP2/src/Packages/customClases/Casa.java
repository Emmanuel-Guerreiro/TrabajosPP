package Packages.customClases;
 public class Casa extends Edificio{
     private boolean plantaAlta;
     private int superficie;
     
     Casa(float axm, boolean plantaAlta, int superficie){
         super(axm);
         this.plantaAlta = plantaAlta;
         this.superficie = superficie;
     }

     public float valuar(){
         return this.superficie * avaluoXmtr;
     }
 }
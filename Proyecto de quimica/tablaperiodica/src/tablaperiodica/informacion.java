/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablaperiodica;
import java.util.ArrayList;
/**
 *
 * @author nl
 */
public class informacion {
    public static elemento obtener(int n){
        ArrayList elementos = new ArrayList();
        //// hidrogeno
        elemento e1= new elemento();
        e1.nombre="H";
        e1.numero=1;
        e1.pe="-252.7";
        e1.pf="-259.2";
        e1.den=0.071;
        e1.peso=1.00797;
        e1.val="1";
        e1.nombre1="1s";
        e1.name="Hidrógeno";
        elementos.add(e1);
        ///////////be
         elemento e2= new elemento();
        e2.nombre="He";
        e2.numero=2;
        e2.pe="-268.9";
        e2.pf="-269.7";
        e2.den=0.126;
        e2.peso=4.0028;
        e2.val="0";
        e2.nombre1="1s^2";
        e2.name="Helio";
        elementos.add(e2);
        /////li
       elemento e3= new elemento();
        e3.nombre="Li";
        e3.numero=3;
        e3.pe="1330";
        e3.pf="180.5";
        e3.den=0.53;
        e3.peso=6.941;
        e3.val="1";
        e3.nombre1="1s^2 2s^1";
        e3.name="Litio";
        elementos.add(e3);
        ///Be
        elemento e4= new elemento();
        e4.nombre="Be";
        e4.numero=4;
        e4.pe="2770";
        e4.pf="1277";
        e4.den=1.85;
        e4.peso=9.0122;
        e4.val="2";
        e4.nombre1="1s^2 2s^2";
        e4.name="Berilio";
        elementos.add(e4);
        ///B
       elemento e5= new elemento();
        e5.nombre="B";
        e5.numero=5;
        e5.pe="_";
        e5.pf="(2030)";
        e5.den=2.34;
        e5.peso=10.611;
        e5.val="3";
        e5.nombre1="1s^2 2s^2 2p^1";
        e5.name="Boro";
        elementos.add(e5);
        //k
          elemento e6= new elemento();
        e6.nombre="C";
        e6.numero=6;
        e6.pe="4830";
        e6.pf="3727";
        e6.den=2.26;
        e6.peso=12.01115;
        e6.val="2,+-4";
        e6.nombre1="1s^2 2s^2 2p^2";
        e6.name="Carbono";
        elementos.add(e6);
        
       ////n
          elemento e7= new elemento();
        e7.nombre="N";
        e7.numero=7;
        e7.pe="-183";
        e7.pf="-218.8";
        e7.den=0.81;
        e7.peso=14.0067;
        e7.val="1,2,+-3,4,5";
        e7.nombre1="1s^2 2s^2 2p^3";
        e7.name="Nitrógeno";
        elementos.add(e7);
        ///Rb
          elemento e8= new elemento();
        e8.nombre="O";
        e8.numero=8;
        e8.pe="-183";
        e8.pf="-218.8";
        e8.den=1.14;
        e8.peso=15.9994;
        e8.val="-2";
        e8.nombre1="1s^2 2s^2 2p^4";
        e8.name="Oxígeno";
        elementos.add(e8);
       
        //f
         elemento e9= new elemento();
        e9.nombre="F";
        e9.numero=9;
        e9.pe="-188.2";
        e9.pf="-219.6";
        e9.den=1.11;
        e9.peso=18.9964;
        e9.val="-1";
        e9.nombre1="1s^2 2s^2 2p^5";
        e9.name="Flúor";
        elementos.add(e9);
       
        //Ne
         elemento e10= new elemento();
        e10.nombre="Ne";
        e10.numero=10;
        e10.pe="-246";
        e10.pf="-248.6";
        e10.den=1.20;
        e10.peso=20.179;
        e10.val="0";
        e10.nombre1="1s^2 2s^2 2p^6";
        e10.name="Neón";
        elementos.add(e10);
        //Na
           elemento e11= new elemento();
        e11.nombre="Na";
        e11.numero=11;
        e11.pe="882";
        e11.pf="97.8";
        e11.den=0.97;
        e11.peso=22.9898;
        e11.val="1";
        e11.nombre1="[Ne]3s^1";
        e11.name="Sodio";
        elementos.add(e11);
        //Mg
        elemento e12= new elemento();
        e12.nombre="Mg";
        e12.numero=12;
        e12.pe="1107";
        e12.pf="650";
        e12.den=1.74;
        e12.peso=24.305;
        e12.val="2";
        e12.nombre1="[Ne]3s^2";
        e12.name="Magnesio";
        elementos.add(e12);
        //AL
         elemento e13= new elemento();
        e13.nombre="Al";
        e13.numero=13;
        e13.pe="2450";
        e13.pf="660";
        e13.den=2.70;
        e13.peso=28.9815;
        e13.val="3";
        e13.nombre1="[Ne]3s^2 3p^1";
        e13.name="Aluminio";
        elementos.add(e13);
        //Si
       elemento e14= new elemento();
        e14.nombre="Si";
        e14.numero=14;
        e14.pe="2680";
        e14.pf="1410";
        e14.den=2.33;
        e14.peso=28.086;
        e14.val="4";
        e14.nombre1="[Ne]3s^2 3p^2";
        e14.name="Silicio";
        elementos.add(e14);
        //P
       elemento e15= new elemento();
        e15.nombre="P";
        e15.numero=15;
        e15.pe="280";
        e15.pf="44.2";
        e15.den=1.82;
        e15.peso=30.9738;
        e15.val="+-3,5";
        e15.nombre1="[Ne]3s^2 3p^3";
        e15.name="Fósforo";
        elementos.add(e15);
        //S
         elemento e16= new elemento();
        e16.nombre="S";
        e16.numero=16;
        e16.pe="444.6";
        e16.pf="119.0";
        e16.den=2.07;
        e16.peso=32.064;
        e16.val="+-2,4,6";
        e16.nombre1="[Ne]3s^2 3p^4";
        e16.name="Azufre";
        elementos.add(e16);
        //Cl
         elemento e17= new elemento();
        e17.nombre="Cl";
        e17.numero=17;
        e17.pe="-34.7";
        e17.pf="101.0";
        e17.den=1.56;
        e17.peso=35.453;
        e17.val="+-1,3,5,7";
        e17.nombre1="[Ne]3s^2 3p^5";
        e17.name="Cloro";
        elementos.add(e17);
        //Ar   revisar !!!!!!
       elemento e18= new elemento();
        e18.nombre="Ar";
        e18.numero=18;
        e18.pe="-185.8";
        e18.pf="-189.4";
        e18.den=1.40;
        e18.peso=39.948;
        e18.val="0";
        e18.nombre1="[Ne]3s^2 3p^8";
        e18.name="Argón";
        elementos.add(e18);
        //K
        elemento e19= new elemento();
        e19.nombre="K";
        e19.numero=19;
        e19.pe="760";
        e19.pf="63.7";
        e19.den=0.86;
        e19.peso=39.096;
        e19.val="1";
        e19.nombre1="[Ar]4s^1";
        e19.name="Potasio";
        elementos.add(e19);
        //CA
       elemento e20= new elemento();
        e20.nombre="Ca";
        e20.numero=20;
        e20.pe="1440";
        e20.pf="838";
        e20.den=1.55;
        e20.peso=40.08;
        e20.val="2";
        e20.nombre1="[Ar]4s^2";
        e20.name="Calcio";
        elementos.add(e20);
        //Sc
        
        elemento e21= new elemento();
        e21.nombre="Sc";
        e21.numero=21;
        e21.pe="2730";
        e21.pf="1539";
        e21.den=3.0;
        e21.peso=44.956;
        e21.val="3";
        e21.nombre1="[Ar]3d^1 4s^2";
        e21.name="Escandio";
        elementos.add(e21);
        //Ti
         elemento e22= new elemento();
        e22.nombre="Ti";
        e22.numero=22;
        e22.pe="3260";
        e22.pf="1668";
        e22.den=4.51;
        e22.peso=47.90;
        e22.val="2,3,4";
        e22.nombre1="[Ar]3d^2 4s^2";
        e22.name="Titanio";
        elementos.add(e22);
        //V
        elemento e23= new elemento();
        e23.nombre="V";
        e23.numero=23;
        e23.pe="3450";
        e23.pf="1900";
        e23.den=4.51;
        e23.peso=50.942;
        e23.val="2,3,4,5";
        e23.nombre1="[Ar]3d³4s²";
        e23.name="Vanadio";
        elementos.add(e23);
        //Cr
        elemento e24= new elemento();
        e24.nombre="Cr";
        e24.numero=24;
        e24.pe="2665";
        e24.pf="1875";
        e24.den=7.19;
        e24.peso=51.996;
        e24.val="2,3,4,5,6";
        e24.nombre1="[Ar]3d⁵4s¹";
        e24.name="Cromo";
        elementos.add(e24);
        //Mn
         
        elemento e25= new elemento();
        e25.nombre="Mn";
        e25.numero=25;
        e25.pe="2150";
        e25.pf="1245";
        e25.den=7.43;
        e25.peso=54.938;
        e25.val="2,3,4,6,7";
        e25.nombre1="[Ar]3d⁵4s²";
        e25.name="Manganeso";
        elementos.add(e25);
        //Fe
         elemento e26= new elemento();
        e26.nombre="Fe";
        e26.numero=26;
        e26.pe="3000";
        e26.pf="1538";
        e26.den=7.86;
        e26.peso=55.847;
        e26.val="2,3";
        e26.nombre1="[Ar]3d⁶4s²";
        e26.name="Hierro";
        elementos.add(e26);
        //Co
         elemento e27= new elemento();
        e27.nombre="Co";
        e27.numero=27;
        e27.pe="2900";
        e27.pf="1495";
        e27.den=8.9;
        e27.peso=58.93;
        e27.val="2,3";
        e27.nombre1="[Ar]3d⁷4s²";
        e27.name="Cobalto";
        elementos.add(e27);
        //Ni
         elemento e28= new elemento();
        e28.nombre="Ni";
        e28.numero=28;
        e28.pe="2730";
        e28.pf="1453";
        e28.den=8.9;
        e28.peso=58.71;
        e28.val="2,3";
        e28.nombre1="[Ar]3d⁸4s²";
        e28.name="Níquel";
        elementos.add(e28);
        //Cu
        elemento e29= new elemento();
        e29.nombre="Cu";
        e29.numero=29;
        e29.pe="2595";
        e29.pf="1083";
        e29.den=8.96;
        e29.peso=63.54;
        e29.val="1,2";
        e29.nombre1="[Ar]3d¹⁰4s¹";
        e29.name="Cobre";
        elementos.add(e29);
        //Zn
         elemento e30=new elemento();
        e30.nombre="Zn";
        e30.numero=30;
        e30.pe="906";
        e30.pf="416,5";
        e30.den=7.14;
        e30.peso=65.37;
        e30.val="2";
        e30.nombre1="[Ar]3d¹⁰4s²";
        e30.name="Cinc";
        elementos.add(e30);
        //Ga
        elemento e31=new elemento();
        e31.nombre="Ga";
        e31.numero=31;
        e31.pe="2237";
        e31.pf="29,8";
        e31.den=5.91;
        e31.peso=69.72;
        e31.val="3";
        e31.nombre1="[Ar]3d¹⁰4s²4p¹";
        e31.name="Galio";
        elementos.add(e31);
        //Ge
        elemento e32=new elemento();
        e32.nombre="Ge";
        e32.numero=32;
        e32.pe="2830";
        e32.pf="937,4";
        e32.den=5.32;
        e32.peso=72.59;
        e32.val="4";
        e32.nombre1="[Ar]3d¹⁰4s²4p²";
        e32.name="Germanio";
        elementos.add(e32);
        //As
        elemento e33=new elemento();
        e33.nombre="As";
        e33.numero=33;
        e33.pe="613";
        e33.pf="817";
        e33.den=5.72;
        e33.peso=74.922;
        e33.val="+-5,5";
        e33.nombre1="[Ar]3d¹⁰4s²4p³";
        e33.name="Arsénico";
        elementos.add(e33);
        //Se
         elemento e34=new elemento();
        e34.nombre="Se";
        e34.numero=34;
        e34.pe="685";
        e34.pf="217";
        e34.den=4.79;
        e34.peso=78.96;
        e34.val="+-2,4,6";
        e34.nombre1="[Ar]3d¹⁰4s²4p⁴";
        e34.name="Selenio";
        elementos.add(e34);
        //Br
         elemento e35=new elemento();
        e35.nombre="Br";
        e35.numero=35;
        e35.pe="58";
        e35.pf="-7.2";
        e35.den=3.12;
        e35.peso=79.909;
        e35.val="+-1,3,5,7";
        e35.nombre1="[Ar]3d¹⁰4s²4p⁵";
        e35.name="Bromo";
        elementos.add(e35);
        //Kr
        elemento e36=new elemento();
        e36.nombre="Kr";
        e36.numero=36;
        e36.pe="-152";
        e36.pf="-157,3";
        e36.den=2.6;
        e36.peso=83.80;
        e36.val="0";
        e36.nombre1="[Ar]3d¹⁰4s²4p⁶";
        e36.name="Criptón";
        elementos.add(e36);
        // Rb
         elemento e37=new elemento();
        e37.nombre="Rb";
        e37.numero=37;
        e37.pe="688";
        e37.pf="38,9";
        e37.den=1.53;
        e37.peso=85.47;
        e37.val="1";
        e37.nombre1="[Kr]5s¹";
        e37.name="Rubidio";
        elementos.add(e37);
        //Sr
         elemento e38=new elemento();
        e38.nombre="Sr";
        e38.numero=38;
        e38.pe="1380";
        e38.pf="768";
        e38.den=1.55;
        e38.peso=40.08;
        e38.val="2";
        e38.nombre1="[Kr]5s²";
        e38.name="Estroncio";
        elementos.add(e38);
        //Y
         elemento e39=new elemento();
        e39.nombre="Y";
        e39.numero=39;
        e39.pe="2927";
        e39.pf="1509";
        e39.den=4.47;
        e39.peso=88.906;
        e39.val="3";
        e39.nombre1="[Kr]4d¹5s²";
        e39.name="Itrio";
        elementos.add(e39);
       //Zr
         elemento e40=new elemento();
        e40.nombre="Zr";
        e40.numero=40;
        e40.pe="3580";
        e40.pf="1852";
        e40.den=6.49;
        e40.peso=91.22;
        e40.val="2,3,4";
        e40.nombre1="[Kr]4d²5s²";
        e40.name="Circonio";
        elementos.add(e40);
        //Nb
          elemento e41=new elemento();
        e41.nombre="Nb";
        e41.numero=41;
        e41.pe="3300";
        e41.pf="2468";
        e41.den=8.4;
        e41.peso=92.906;
        e41.val="2,3,4,5";
        e41.nombre1="[Kr]4d⁴5s¹";
        e41.name="Niobio";
        elementos.add(e41);
        //Mo
         elemento e42=new elemento();
        e42.nombre="Mo";
        e42.numero=42;
        e42.pe="5560";
        e42.pf="2610";
        e42.den=10.2;
        e42.peso=95.94;
        e42.val="2,3,4,5,6";
        e42.nombre1="[Kr]4d⁵5s¹";
        e42.name="Molibdeno";
        elementos.add(e42);
        //Tc
         elemento e43=new elemento();
        e43.nombre="Tc";
        e43.numero=43;
        e43.pe="-";
        e43.pf="21,40";
        e43.den=11.5;
        e43.peso=97;
        e43.val="7";
        e43.nombre1="[Kr]4d⁵5s²";
        e43.name="Tecnecio";
        elementos.add(e43);
        //Ru
         elemento e44=new elemento();
        e44.nombre="Ru";
        e44.numero=44;
        e44.pe="4900";
        e44.pf="2500";
        e44.den=12.2;
        e44.peso=101.07;
        e44.val="2,3,4,6,8.";
        e44.nombre1="[Kr]4d⁷5s¹";
        e44.name="Rutenio";
        elementos.add(e44);
        //Comienza a corregir---------------------
         elemento e45=new elemento();
        e45.nombre="Ru";
        e45.numero=45;
        e45.pe="4900";
        e45.pf="2500";
        e45.den=12.2;
        e45.peso=101.07;
        e45.val="2,3,4,6,8.";
        e45.nombre1="[Kr]4d⁷5s¹";
        e45.name="Rutenio";
        elementos.add(e45);
        //
         elemento e46=new elemento();
        e46.nombre="Ru";
        e46.numero=46;
        e46.pe="4900";
        e46.pf="2500";
        e46.den=12.2;
        e46.peso=101.07;
        e46.val="2,3,4,6,8.";
        e46.nombre1="[Kr]4d⁷5s¹";
        e46.name="Rutenio";
        elementos.add(e46);
        //
         elemento e47=new elemento();
        e47.nombre="Ru";
        e47.numero=44;
        e47.pe="4900";
        e47.pf="2500";
        e47.den=12.2;
        e47.peso=101.07;
        e47.val="2,3,4,6,8.";
        e47.nombre1="[Kr]4d⁷5s¹";
        e47.name="Rutenio";
        elementos.add(e47);
        //
         elemento e48=new elemento();
        e48.nombre="Ru";
        e48.numero=44;
        e48.pe="4900";
        e48.pf="2500";
        e48.den=12.2;
        e48.peso=101.07;
        e48.val="2,3,4,6,8.";
        e48.nombre1="[Kr]4d⁷5s¹";
        e48.name="Rutenio";
        elementos.add(e48);
        
        return (elemento)elementos.get(n-1);
        
        
        
    }
    
}

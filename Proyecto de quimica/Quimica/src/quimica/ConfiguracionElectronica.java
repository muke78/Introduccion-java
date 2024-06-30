/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quimica;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author jose_
 */
public class ConfiguracionElectronica extends javax.swing.JFrame {

    private void limpiarCampos() {

        txtNombre.setText("");
        txtElemento.setText("");
        txtNumero.setText("");
        txtOrbital.setText("");
        txtOrientacion.setText("");
        txtSpin.setText("");
        txtConfiguracion.setText("");
        txtFamilia.setText("");
        txtGrupo.setText("");
        txtAtomico.setText("");
        txtPeriodo.setText("");
        txtPeso.setText("");
        txtEstado.setText("");
    }

    /**
     * Creates new form ConfiguracionElectronica
     */
    public ConfiguracionElectronica() {
        initComponents();
        
         txtNombre.setBackground(new Color(0,0,0,64));
        txtElemento.setBackground(new Color(0,0,0,64));
        txtNumero.setBackground(new Color(0,0,0,64));
        txtOrbital.setBackground(new Color(0,0,0,64));
        txtOrientacion.setBackground(new Color(0,0,0,64));
        txtSpin.setBackground(new Color(0,0,0,64));
        txtConfiguracion.setBackground(new Color(0,0,0,64));
        txtFamilia.setBackground(new Color(0,0,0,64));
        txtGrupo.setBackground(new Color(0,0,0,64));
        txtAtomico.setBackground(new Color(0,0,0,64));
        txtPeriodo.setBackground(new Color(0,0,0,64));
        txtPeso.setBackground(new Color(0,0,0,64));
        txtEstado.setBackground(new Color(0,0,0,64));
        
        
        
    }

    String Elemento = "";
    int H;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu7 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BoxUno = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtElemento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtConfiguracion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtFamilia = new javax.swing.JTextField();
        txtOrbital = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtGrupo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtAtomico = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtOrientacion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSpin = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPeriodo = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jButton120 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu7.setText("jMenu7");
        jPopupMenu1.add(jMenu7);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        setMinimumSize(new java.awt.Dimension(700, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Configuracion Electronica");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(252, 37, 182, 17);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Elemento =");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 70, 70, 16);

        BoxUno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P", "S", "Cl", "Ar", "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr", "Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I", "Xe", "Cs", "Ba", "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu", "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn", "Fr", "Ra", "Ac", "Th", "Pa", "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No", "Lr", "Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds", "Rg", "Cn" }));
        BoxUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxUnoActionPerformed(evt);
            }
        });
        getContentPane().add(BoxUno);
        BoxUno.setBounds(324, 65, 90, 26);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(270, 100, 120, 32);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombre del elemento");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(200, 150, 120, 16);

        txtNombre.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtNombre);
        txtNombre.setBounds(320, 140, 160, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Kernel:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 200, 60, 16);

        txtElemento.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txtElemento.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtElemento);
        txtElemento.setBounds(100, 189, 170, 30);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Su configuracion Electronica es:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 430, 190, 16);

        txtConfiguracion.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtConfiguracion.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtConfiguracion);
        txtConfiguracion.setBounds(210, 420, 460, 30);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("n:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 240, 30, 16);

        txtNumero.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txtNumero.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtNumero);
        txtNumero.setBounds(100, 227, 170, 30);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Familia:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(316, 200, 60, 16);

        txtFamilia.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txtFamilia.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtFamilia);
        txtFamilia.setBounds(390, 190, 160, 30);

        txtOrbital.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txtOrbital.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtOrbital);
        txtOrbital.setBounds(100, 265, 170, 30);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Grupo:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(320, 240, 50, 16);

        txtGrupo.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txtGrupo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtGrupo);
        txtGrupo.setBounds(390, 230, 160, 30);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Numero atomico:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(290, 270, 100, 20);

        txtAtomico.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txtAtomico.setForeground(new java.awt.Color(255, 255, 255));
        txtAtomico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAtomicoActionPerformed(evt);
            }
        });
        getContentPane().add(txtAtomico);
        txtAtomico.setBounds(390, 270, 160, 30);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("l:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 280, 30, 16);

        txtOrientacion.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txtOrientacion.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtOrientacion);
        txtOrientacion.setBounds(100, 303, 170, 30);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("m:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 320, 30, 16);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("s:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 350, 30, 16);

        txtSpin.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txtSpin.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtSpin);
        txtSpin.setBounds(100, 341, 170, 30);

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Peso Atomico:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(30, 390, 100, 16);

        txtPeso.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txtPeso.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtPeso);
        txtPeso.setBounds(100, 379, 170, 30);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Periodo:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(320, 310, 60, 20);

        txtPeriodo.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txtPeriodo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtPeriodo);
        txtPeriodo.setBounds(390, 310, 160, 30);

        txtEstado.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txtEstado.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtEstado);
        txtEstado.setBounds(390, 350, 160, 30);

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Estado:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(320, 350, 60, 16);

        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(280, 460, 110, 32);

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Aqui:");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(420, 480, 90, 32);

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Conoce todo sobre configuracion electronica");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(155, 492, 255, 16);

        jButton120.setBackground(new java.awt.Color(20, 166, 230));
        jButton120.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton120.setText("Menu");
        jButton120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton120ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton120);
        jButton120.setBounds(530, 470, 140, 42);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pri/ato.jpg"))); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(0, 0, 700, 540);

        jMenu3.setText("Archivo");

        jMenuItem1.setText("Salir");
        jMenu3.add(jMenuItem1);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edicion");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Ver");

        jMenuItem2.setText("Zoom");
        jMenu5.add(jMenuItem2);

        jMenuItem3.setText("Fuente");
        jMenu5.add(jMenuItem3);
        jMenu5.add(jSeparator1);

        jMenuItem4.setText("Separador");
        jMenu5.add(jMenuItem4);

        jMenuBar2.add(jMenu5);

        jMenu6.setText("Mensaje");

        jMenuItem5.setText("Ayuda");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem5);

        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        
       JOptionPane.showMessageDialog(null, "Escoge un elemento quimico para saber su configuracion electronica", "Mensaje",
               JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Ventana obj = new Ventana();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int i = BoxUno.getSelectedIndex();

        if (i == 0) {
            txtNombre.setText("Hidrógeno");
            txtElemento.setText("");
            txtNumero.setText("1");
            txtOrbital.setText("0");
            txtOrientacion.setText("0");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s1");
            txtFamilia.setText("A");
            txtGrupo.setText("I");
            txtAtomico.setText("1");
            txtPeriodo.setText("1");
            txtPeso.setText("1.00874");
            txtEstado.setText("Gaseoso");
        } else if (i == 1) {
            txtNombre.setText("Helio");
            txtElemento.setText("2He=1s1");
            txtNumero.setText("1");
            txtOrbital.setText("0");
            txtOrientacion.setText("0");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s1");
            txtFamilia.setText("A");
            txtGrupo.setText("VIII");
            txtAtomico.setText("2");
            txtPeriodo.setText("1");
            txtPeso.setText("4.0026");
            txtEstado.setText("Gaseoso");
        } else if (i == 2) {
            txtNombre.setText("Litio");
            txtElemento.setText("2He");
            txtNumero.setText("2");
            txtOrbital.setText("0");
            txtOrientacion.setText("0");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s1");
            txtFamilia.setText("A");
            txtGrupo.setText("I");
            txtAtomico.setText("3");
            txtPeriodo.setText("2");
            txtPeso.setText("6.938");
            txtEstado.setText("Sólido");
        } else if (i == 3) {
            txtNombre.setText("Berilio");
            txtElemento.setText("2He=2s2");
            txtNumero.setText("2");
            txtOrbital.setText("0");
            txtOrientacion.setText("0");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2");
            txtFamilia.setText("A");
            txtGrupo.setText("I");
            txtAtomico.setText("4");
            txtPeriodo.setText("2");
            txtPeso.setText("9.012");
            txtEstado.setText("Sólido");
        } else if (i == 4) {
            txtNombre.setText("Boro");
            txtElemento.setText("2He=2p1");
            txtNumero.setText("2");
            txtOrbital.setText("1");
            txtOrientacion.setText("-1");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p1");
            txtFamilia.setText("A");
            txtGrupo.setText("III");
            txtAtomico.setText("5");
            txtPeriodo.setText("2");
            txtPeso.setText("10.806");
            txtEstado.setText("Sólido");
        } else if (i == 5) {
            txtNombre.setText("Carbono");
            txtElemento.setText("2He=2p2");
            txtNumero.setText("2");
            txtOrbital.setText("1");
            txtOrientacion.setText("0");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p2");
            txtFamilia.setText("A");
            txtGrupo.setText("IV");
            txtAtomico.setText("6");
            txtPeriodo.setText("2");
            txtPeso.setText("12.011");
            txtEstado.setText("Sólido");
        } else if (i == 6) {
            txtNombre.setText("Nitrógeno");
            txtElemento.setText("22He=2p3");
            txtNumero.setText("2");
            txtOrbital.setText("1");
            txtOrientacion.setText("1");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p3");
            txtFamilia.setText("A");
            txtGrupo.setText("V");
            txtAtomico.setText("7");
            txtPeriodo.setText("2");
            txtPeso.setText("14.006");
            txtEstado.setText("Gaseoso");

        } else if (i == 7) {
            txtNombre.setText("Oxígeno");
            txtElemento.setText("2He=2p4");
            txtNumero.setText("2");
            txtOrbital.setText("1");
            txtOrientacion.setText("-1");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p4");
            txtFamilia.setText("A");
            txtGrupo.setText("VI");
            txtAtomico.setText("8");
            txtPeriodo.setText("2");
            txtPeso.setText("15.999");
            txtEstado.setText("Gaseoso");

        } else if (i == 8) {
            txtNombre.setText("Fluor");
            txtElemento.setText("2He=2p5");
            txtNumero.setText("2");
            txtOrbital.setText("1");
            txtOrientacion.setText("0");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p5");
            txtFamilia.setText("A");
            txtGrupo.setText("VII");
            txtAtomico.setText("9");
            txtPeriodo.setText("2");
            txtPeso.setText("18.998");
            txtEstado.setText("Gaseoso");

        } else if (i == 9) {
            txtNombre.setText("Neon");
            txtElemento.setText("10Ne");
            txtNumero.setText("2");
            txtOrbital.setText("1");
            txtOrientacion.setText("1");
            txtSpin.setText("1/2");
            txtConfiguracion.setText("1s1 2s2 2p6");
            txtFamilia.setText("A");
            txtGrupo.setText("VIII");
            txtAtomico.setText("10");
            txtPeriodo.setText("2");
            txtPeso.setText("20.179");
            txtEstado.setText("Gaseoso");

        } else if (i == 10) {
            txtNombre.setText("Sodio");
            txtElemento.setText("10Ne=3s1");
            txtNumero.setText("3");
            txtOrbital.setText("0");
            txtOrientacion.setText("0");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s1 2s2 2p6 3s1");
            txtFamilia.setText("A");
            txtGrupo.setText("I");
            txtAtomico.setText("11");
            txtPeriodo.setText("3");
            txtPeso.setText("22.9897");
            txtEstado.setText("Sólido");
        } else if (i == 11) {
            txtNombre.setText("Magnesio");
            txtElemento.setText("10Ne=3s2");
            txtNumero.setText("3");
            txtOrbital.setText("0");
            txtOrientacion.setText("0");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s1 2s2 2p6 3s2");
            txtFamilia.setText("A");
            txtGrupo.setText("II");
            txtAtomico.setText("12");
            txtPeriodo.setText("3");
            txtPeso.setText("24.305");
            txtEstado.setText("Sólido");

        } else if (i == 12) {
            txtNombre.setText("Aluminio");
            txtElemento.setText("10Ne=3p1");
            txtNumero.setText("3");
            txtOrbital.setText("1");
            txtOrientacion.setText("-1");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p1");
            txtFamilia.setText("A");
            txtGrupo.setText("III");
            txtAtomico.setText("13");
            txtPeriodo.setText("3");
            txtPeso.setText("26.981");
            txtEstado.setText("Sólido");

        } else if (i == 13) {
            txtNombre.setText("Silicio");
            txtElemento.setText("10Ne=3p2");
            txtNumero.setText("3");
            txtOrbital.setText("1");
            txtOrientacion.setText("0");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p2");
            txtFamilia.setText("A");
            txtGrupo.setText("IV");
            txtAtomico.setText("14");
            txtPeriodo.setText("3");
            txtPeso.setText("28.085");
            txtEstado.setText("Sólido");

        } else if (i == 14) {
            txtNombre.setText("Fosforo");
            txtElemento.setText("10Ne=3p3");
            txtNumero.setText("3");
            txtOrbital.setText("1");
            txtOrientacion.setText("1");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p3");
            txtFamilia.setText("A");
            txtGrupo.setText("V");
            txtAtomico.setText("15");
            txtPeriodo.setText("3");
            txtPeso.setText("30.973");
            txtEstado.setText("Sólido");

        } else if (i == 15) {
            txtNombre.setText("Azufre");
            txtElemento.setText("10Ne=3p4");
            txtNumero.setText("3");
            txtOrbital.setText("1");
            txtOrientacion.setText("-1");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p4");
            txtFamilia.setText("A");
            txtGrupo.setText("VI");
            txtAtomico.setText("16");
            txtPeriodo.setText("3");
            txtPeso.setText("32.059");
            txtEstado.setText("Sólido");

        } else if (i == 16) {
            txtNombre.setText("Cloro");
            txtElemento.setText("10Ne=3p5");
            txtNumero.setText("3");
            txtOrbital.setText("1");
            txtOrientacion.setText("0");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p5");
            txtFamilia.setText("A");
            txtGrupo.setText("VII");
            txtAtomico.setText("17");
            txtPeriodo.setText("3");
            txtPeso.setText("35.446");
            txtEstado.setText("Gaseoso");

        } else if (i == 17) {
            txtNombre.setText("Argón");
            txtElemento.setText("18Ar");
            txtNumero.setText("3");
            txtOrbital.setText("1");
            txtOrientacion.setText("1");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p6");
            txtFamilia.setText("A");
            txtGrupo.setText("VIII");
            txtAtomico.setText("18");
            txtPeriodo.setText("3");
            txtPeso.setText("39.948");
            txtEstado.setText("Gaseoso");

        } else if (i == 18) {
            txtNombre.setText("Potasio");
            txtElemento.setText("18Ar=4s1");
            txtNumero.setText("4");
            txtOrbital.setText("0");
            txtOrientacion.setText("0");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p6 4s1");
            txtFamilia.setText("A");
            txtGrupo.setText("I");
            txtAtomico.setText("19");
            txtPeriodo.setText("4");
            txtPeso.setText("39.0983");
            txtEstado.setText("Sólido");

        } else if (i == 19) {
            txtNombre.setText("Calcio");
            txtElemento.setText("18Ar=4s2");
            txtNumero.setText("4");
            txtOrbital.setText("0");
            txtOrientacion.setText("0");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p6 4s2");
            txtFamilia.setText("A");
            txtGrupo.setText("II");
            txtAtomico.setText("20");
            txtPeriodo.setText("4");
            txtPeso.setText("40.078");
            txtEstado.setText("Sólido");

        } else if (i == 20) {
            txtNombre.setText("Escandio");
            txtElemento.setText("18Ar=3d1");
            txtNumero.setText("3");
            txtOrbital.setText("2");
            txtOrientacion.setText("-2");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p6 4s2 3d1");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("21");
            txtPeriodo.setText("4");
            txtPeso.setText("44.955");
            txtEstado.setText("Sólido");

        } else if (i == 21) {
            txtNombre.setText("Titanio");
            txtElemento.setText("18Ar=3d2");
            txtNumero.setText("3");
            txtOrbital.setText("2");
            txtOrientacion.setText("-1");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p6 4s2 3d2");
            txtFamilia.setText("B");
            txtGrupo.setText("IV");
            txtAtomico.setText("22");
            txtPeriodo.setText("4");
            txtPeso.setText("47.867");
            txtEstado.setText("Sólido");

        } else if (i == 22) {
            txtNombre.setText("Vanadio");
            txtElemento.setText("18Ar=3d3");
            txtNumero.setText("3");
            txtOrbital.setText("2");
            txtOrientacion.setText("0");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p6 4s2 3d3");
            txtFamilia.setText("B");
            txtGrupo.setText("V");
            txtAtomico.setText("23");
            txtPeriodo.setText("4");
            txtPeso.setText("50.941");
            txtEstado.setText("Sólido");

        } else if (i == 23) {
            txtNombre.setText("Cromo");
            txtElemento.setText("18Ar=3d5");
            txtNumero.setText("3");
            txtOrbital.setText("2");
            txtOrientacion.setText("2");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p6 4s1 3d5");
            txtFamilia.setText("B");
            txtGrupo.setText("VI");
            txtAtomico.setText("24");
            txtPeriodo.setText("4");
            txtPeso.setText("51.996");
            txtEstado.setText("Sólido");

        } else if (i == 24) {
            txtNombre.setText("Manganeso");
            txtElemento.setText("18Ar=3d5");
            txtNumero.setText("3");
            txtOrbital.setText("2");
            txtOrientacion.setText("2");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p6 4s2 3d5");
            txtFamilia.setText("B");
            txtGrupo.setText("VII");
            txtAtomico.setText("25");
            txtPeriodo.setText("4");
            txtPeso.setText("54.938");
            txtEstado.setText("Sólido");

        } else if (i == 25) {
            txtNombre.setText("Hierro");
            txtElemento.setText("18Ar=3d6");
            txtNumero.setText("3");
            txtOrbital.setText("2");
            txtOrientacion.setText("-2");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p6 4s2 3d6");
            txtFamilia.setText("B");
            txtGrupo.setText("VIII");
            txtAtomico.setText("26");
            txtPeriodo.setText("4");
            txtPeso.setText("55.845");
            txtEstado.setText("Sólido");

        } else if (i == 26) {
            txtNombre.setText("Cobalto");
            txtElemento.setText("18Ar=3d7");
            txtNumero.setText("3");
            txtOrbital.setText("2");
            txtOrientacion.setText("-1");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p6 4s2 3d7");
            txtFamilia.setText("B");
            txtGrupo.setText("VIII");
            txtAtomico.setText("27");
            txtPeriodo.setText("4");
            txtPeso.setText("58.933");
            txtEstado.setText("Sólido");

        } else if (i == 27) {
            txtNombre.setText("Níquel");
            txtElemento.setText("18Ar=3d8");
            txtNumero.setText("3");
            txtOrbital.setText("2");
            txtOrientacion.setText("0");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p6 4s2 3d8");
            txtFamilia.setText("B");
            txtGrupo.setText("VIII");
            txtAtomico.setText("28");
            txtPeriodo.setText("4");
            txtPeso.setText("58.693");
            txtEstado.setText("Sólido");

        } else if (i == 28) {
            txtNombre.setText("Cobre");
            txtElemento.setText("18Ar=3d9");
            txtNumero.setText("3");
            txtOrbital.setText("2");
            txtOrientacion.setText("2");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p6 4s1 3d9");
            txtFamilia.setText("B");
            txtGrupo.setText("I");
            txtAtomico.setText("29");
            txtPeriodo.setText("4");
            txtPeso.setText("63.546");
            txtEstado.setText("Sólido");

        } else if (i == 29) {
            txtNombre.setText("Zinc");
            txtElemento.setText("18Ar=3d10");
            txtNumero.setText("3");
            txtOrbital.setText("2");
            txtOrientacion.setText("2");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p6 4s2 3d10");
            txtFamilia.setText("B");
            txtGrupo.setText("II");
            txtAtomico.setText("30");
            txtPeriodo.setText("4");
            txtPeso.setText("65.38");
            txtEstado.setText("Sólido");

        } else if (i == 30) {
            txtNombre.setText("Galio");
            txtElemento.setText("18Ar=4p1");
            txtNumero.setText("4");
            txtOrbital.setText("1");
            txtOrientacion.setText("-1");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p1");
            txtFamilia.setText("A");
            txtGrupo.setText("III");
            txtAtomico.setText("31");
            txtPeriodo.setText("4");
            txtPeso.setText("69.723");
            txtEstado.setText("Sólido");

        } else if (i == 31) {
            txtNombre.setText("Germanio");
            txtElemento.setText("18Ar=4p2");
            txtNumero.setText("4");
            txtOrbital.setText("1");
            txtOrientacion.setText("0");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p2");
            txtFamilia.setText("A");
            txtGrupo.setText("IV");
            txtAtomico.setText("32");
            txtPeriodo.setText("4");
            txtPeso.setText("72.630");
            txtEstado.setText("Sólido");

        } else if (i == 32) {
            txtNombre.setText("Arsénico");
            txtElemento.setText("18Ar=4p3");
            txtNumero.setText("4");
            txtOrbital.setText("1");
            txtOrientacion.setText("1");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p3");
            txtFamilia.setText("A");
            txtGrupo.setText("V");
            txtAtomico.setText("33");
            txtPeriodo.setText("4");
            txtPeso.setText("74.921");
            txtEstado.setText("Sólido");

        } else if (i == 33) {
            txtNombre.setText("Selenio");
            txtElemento.setText("18Ar=4p4");
            txtNumero.setText("4");
            txtOrbital.setText("1");
            txtOrientacion.setText("-1");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p4");
            txtFamilia.setText("A");
            txtGrupo.setText("VI");
            txtAtomico.setText("34");
            txtPeriodo.setText("4");
            txtPeso.setText("78.971");
            txtEstado.setText("Sólido");

        } else if (i == 34) {
            txtNombre.setText("Bromo");
            txtElemento.setText("18Ar=4p5");
            txtNumero.setText("4");
            txtOrbital.setText("1");
            txtOrientacion.setText("0");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p5");
            txtFamilia.setText("A");
            txtGrupo.setText("VII");
            txtAtomico.setText("35");
            txtPeriodo.setText("4");
            txtPeso.setText("79.904");
            txtEstado.setText("Líquido");

        } else if (i == 35) {
            txtNombre.setText("Kriptón");
            txtElemento.setText("36Kr");
            txtNumero.setText("4");
            txtOrbital.setText("1");
            txtOrientacion.setText("1");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6");
            txtFamilia.setText("A");
            txtGrupo.setText("VIII");
            txtAtomico.setText("36");
            txtPeriodo.setText("4");
            txtPeso.setText("83.798");
            txtEstado.setText("Gaseoso");

        } else if (i == 36) {
            txtNombre.setText("Rubidio");
            txtElemento.setText("36Kr=5s1");
            txtNumero.setText("5");
            txtOrbital.setText("0");
            txtOrientacion.setText("0");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s1 2s2 2p6 3s2 3p64s2 3d10 4p6 5s1");
            txtFamilia.setText("A");
            txtGrupo.setText("I");
            txtAtomico.setText("37");
            txtPeriodo.setText("5");
            txtPeso.setText("85.4678");
            txtEstado.setText("Sólido");

        } else if (i == 37) {
            txtNombre.setText("Estroncio");
            txtElemento.setText("36Kr=5s2");
            txtNumero.setText("5");
            txtOrbital.setText("0");
            txtOrientacion.setText("0");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6 5s2");
            txtFamilia.setText("A");
            txtGrupo.setText("II");
            txtAtomico.setText("38");
            txtPeriodo.setText("5");
            txtPeso.setText("87.62");
            txtEstado.setText("Sólido ");

        } else if (i == 38) {
            txtNombre.setText("Itrio");
            txtElemento.setText("36Kr=4d1");
            txtNumero.setText("4");
            txtOrbital.setText("2");
            txtOrientacion.setText("-2");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6 5s2 4d1");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("39");
            txtPeriodo.setText("5");
            txtPeso.setText("88.905");
            txtEstado.setText("Sólido");

        } else if (i == 39) {
            txtNombre.setText("Zirconio");
            txtElemento.setText("36Kr=4d2");
            txtNumero.setText("4");
            txtOrbital.setText("2");
            txtOrientacion.setText("-1");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6 5s2 4d2");
            txtFamilia.setText("B");
            txtGrupo.setText("IV");
            txtAtomico.setText("40");
            txtPeriodo.setText("5");
            txtPeso.setText("91.224");
            txtEstado.setText("Sólido");

        } else if (i == 40) {
            txtNombre.setText("Niobio");
            txtElemento.setText("36Kr=4d4");
            txtNumero.setText("4");
            txtOrbital.setText("2");
            txtOrientacion.setText("1");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6 5s1 4d4");
            txtFamilia.setText("B");
            txtGrupo.setText("V");
            txtAtomico.setText("41");
            txtPeriodo.setText("5");
            txtPeso.setText("92.906");
            txtEstado.setText("Sólido");

        } else if (i == 41) {
            txtNombre.setText("Molibdeno");
            txtElemento.setText("36Kr=4d5");
            txtNumero.setText("4");
            txtOrbital.setText("2");
            txtOrientacion.setText("2");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6 5s1 4d5");
            txtFamilia.setText("B");
            txtGrupo.setText("VI");
            txtAtomico.setText("42");
            txtPeriodo.setText("5");
            txtPeso.setText("95.95");
            txtEstado.setText("Sólido");

        } else if (i == 42) {
            txtNombre.setText("Tecnecio");
            txtElemento.setText("36Kr=4d7");
            txtNumero.setText("4");
            txtOrbital.setText("2");
            txtOrientacion.setText("-1");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6 5s1 4d5");
            txtFamilia.setText("B");
            txtGrupo.setText("VIII");
            txtAtomico.setText("43");
            txtPeriodo.setText("5");
            txtPeso.setText("98.0");
            txtEstado.setText("Artificial");

        } else if (i == 43) {
            txtNombre.setText("Rutenio");
            txtElemento.setText("36Kr=4d7");
            txtNumero.setText("4");
            txtOrbital.setText("2");
            txtOrientacion.setText("-1");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6 5s1 4d7");
            txtFamilia.setText("B");
            txtGrupo.setText("VIII");
            txtAtomico.setText("44");
            txtPeriodo.setText("5");
            txtPeso.setText("101.07");
            txtEstado.setText("Sólido");

        } else if (i == 44) {
            txtNombre.setText("Ro0dio");
            txtElemento.setText("36Kr=4d8");
            txtNumero.setText("4");
            txtOrbital.setText("2");
            txtOrientacion.setText("0");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6 5s1 4d8");
            txtFamilia.setText("B");
            txtGrupo.setText("VIII");
            txtAtomico.setText("45");
            txtPeriodo.setText("5");
            txtPeso.setText("102.9055");
            txtEstado.setText("Sólido");

        } else if (i == 45) {
            txtNombre.setText("Paladio");
            txtElemento.setText("36Kr=4d10");
            txtNumero.setText("4");
            txtOrbital.setText("2");
            txtOrientacion.setText("2");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6 4d10");
            txtFamilia.setText("B");
            txtGrupo.setText("VIII");
            txtAtomico.setText("46");
            txtPeriodo.setText("5");
            txtPeso.setText("106.42");
            txtEstado.setText("Sólido");

        } else if (i == 46) {
            txtNombre.setText("Plata");
            txtElemento.setText("36Kr=4d9");
            txtNumero.setText("4");
            txtOrbital.setText("2");
            txtOrientacion.setText("2");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d9");
            txtFamilia.setText("B");
            txtGrupo.setText("I");
            txtAtomico.setText("47");
            txtPeriodo.setText("5");
            txtPeso.setText("107.8682");
            txtEstado.setText("Sólido");

        } else if (i == 47) {
            txtNombre.setText("Cadmio");
            txtElemento.setText("36Kr=4d10");
            txtNumero.setText("4");
            txtOrbital.setText("2");
            txtOrientacion.setText("2");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10");
            txtFamilia.setText("B");
            txtGrupo.setText("II");
            txtAtomico.setText("48");
            txtPeriodo.setText("5");
            txtPeso.setText("112.414");
            txtEstado.setText("Sólido");

        } else if (i == 48) {
            txtNombre.setText("Indio");
            txtElemento.setText("");
            txtNumero.setText("5");
            txtOrbital.setText("1");
            txtOrientacion.setText("-1");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p1");
            txtFamilia.setText("A");
            txtGrupo.setText("III");
            txtAtomico.setText("49");
            txtPeriodo.setText("5");
            txtPeso.setText("114.818");
            txtEstado.setText("Sólido");

        } else if (i == 49) {
            txtNombre.setText("Estaño");
            txtElemento.setText("36Kr=5p2");
            txtNumero.setText("5");
            txtOrbital.setText("1");
            txtOrientacion.setText("0");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p2");
            txtFamilia.setText("A");
            txtGrupo.setText("IV");
            txtAtomico.setText("50");
            txtPeriodo.setText("5");
            txtPeso.setText("118.71");
            txtEstado.setText("Sólido");

        } else if (i == 50) {
            txtNombre.setText("Antimonio");
            txtElemento.setText("36Kr=5p3");
            txtNumero.setText("5");
            txtOrbital.setText("1");
            txtOrientacion.setText("1");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p3");
            txtFamilia.setText("A");
            txtGrupo.setText("V");
            txtAtomico.setText("51");
            txtPeriodo.setText("5");
            txtPeso.setText("121.76");
            txtEstado.setText("");

        } else if (i == 51) {
            txtNombre.setText("Telurio");
            txtElemento.setText("36Kr=5p4");
            txtNumero.setText("5");
            txtOrbital.setText("1");
            txtOrientacion.setText("-1");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p4");
            txtFamilia.setText("A");
            txtGrupo.setText("VI");
            txtAtomico.setText("52");
            txtPeriodo.setText("5");
            txtPeso.setText("127.6");
            txtEstado.setText("Sólido");

        } else if (i == 52) {
            txtNombre.setText("Yodo");
            txtElemento.setText("36Kr=5p5");
            txtNumero.setText("5");
            txtOrbital.setText("1");
            txtOrientacion.setText("0");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p5");
            txtFamilia.setText("A");
            txtGrupo.setText("VII");
            txtAtomico.setText("53");
            txtPeriodo.setText("5");
            txtPeso.setText("126.90447");
            txtEstado.setText("Sólido");

        } else if (i == 53) {
            txtNombre.setText("Xenón");
            txtElemento.setText("54Xe");
            txtNumero.setText("5");
            txtOrbital.setText("1");
            txtOrientacion.setText("1");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6");
            txtFamilia.setText("A");
            txtGrupo.setText("VIII");
            txtAtomico.setText("54");
            txtPeriodo.setText("5");
            txtPeso.setText("131.293");
            txtEstado.setText("Gaseoso");

        } else if (i == 54) {
            txtNombre.setText("Cesio");
            txtElemento.setText("Xe=6s1");
            txtNumero.setText("6");
            txtOrbital.setText("0");
            txtOrientacion.setText("0");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s1 2s2 2p6 3s2 3p64s2 3d10 4p6 5s2 4d10 5p6 6s1");
            txtFamilia.setText("A");
            txtGrupo.setText("I");
            txtAtomico.setText("55");
            txtPeriodo.setText("6");
            txtPeso.setText("132.9054");
            txtEstado.setText("Sólido");

        } else if (i == 55) {
            txtNombre.setText("Bario");
            txtElemento.setText("Xe=6s2");
            txtNumero.setText("6");
            txtOrbital.setText("0");
            txtOrientacion.setText("0");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2");
            txtFamilia.setText("A");
            txtGrupo.setText("II");
            txtAtomico.setText("56");
            txtPeriodo.setText("6");
            txtPeso.setText("137.327");
            txtEstado.setText("Sólido");

        } else if (i == 56) {
            txtNombre.setText("Lantano");
            txtElemento.setText("");
            txtNumero.setText("4");
            txtOrbital.setText("3");
            txtOrientacion.setText("-3");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("57");
            txtPeriodo.setText("6");
            txtPeso.setText("138.9055");
            txtEstado.setText("Sólido");

        } else if (i == 57) {
            txtNombre.setText("Cerio");
            txtElemento.setText("Xe=4f2");
            txtNumero.setText("4");
            txtOrbital.setText("3");
            txtOrientacion.setText("-2");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f2");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("58");
            txtPeriodo.setText("6");
            txtPeso.setText("140.116");
            txtEstado.setText("Sólido");

        } else if (i == 58) {
            txtNombre.setText("Praseodimio");
            txtElemento.setText("Xe=4f3");
            txtNumero.setText("4");
            txtOrbital.setText("3");
            txtOrientacion.setText("-1");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f3");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("59");
            txtPeriodo.setText("6");
            txtPeso.setText("140.90765");
            txtEstado.setText("Sólido");

        } else if (i == 59) {
            txtNombre.setText("Neodimio");
            txtElemento.setText("Xe=4f4");
            txtNumero.setText("4");
            txtOrbital.setText("3");
            txtOrientacion.setText("0");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f4");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("60");
            txtPeriodo.setText("6");
            txtPeso.setText("144.24");
            txtEstado.setText("Sólido");

        } else if (i == 60) {
            txtNombre.setText("Prometio");
            txtElemento.setText("Xe=4f5");
            txtNumero.setText("4");
            txtOrbital.setText("3");
            txtOrientacion.setText("1");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f5");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("61");
            txtPeriodo.setText("6");
            txtPeso.setText("145");
            txtEstado.setText("Artificial");

        } else if (i == 61) {
            txtNombre.setText("Samario");
            txtElemento.setText("Xe=4f6");
            txtNumero.setText("4");
            txtOrbital.setText("3");
            txtOrientacion.setText("2");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f6");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("62");
            txtPeriodo.setText("6");
            txtPeso.setText("150.36");
            txtEstado.setText("Sólido");

        } else if (i == 62) {
            txtNombre.setText("Europio");
            txtElemento.setText("Xe=4f7");
            txtNumero.setText("4");
            txtOrbital.setText("3");
            txtOrientacion.setText("3");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f7");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("63");
            txtPeriodo.setText("6");
            txtPeso.setText("151.964");
            txtEstado.setText("Sólido");

        } else if (i == 63) {
            txtNombre.setText("Gadolino");
            txtElemento.setText("Xe=4f8");
            txtNumero.setText("4");
            txtOrbital.setText("3");
            txtOrientacion.setText("-3");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f8");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("64");
            txtPeriodo.setText("6");
            txtPeso.setText("157.25");
            txtEstado.setText("Sólido");

        } else if (i == 64) {
            txtNombre.setText("Terbio");
            txtElemento.setText("Xe=4f9");
            txtNumero.setText("4");
            txtOrbital.setText("3");
            txtOrientacion.setText("-2");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f9");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("65");
            txtPeriodo.setText("6");
            txtPeso.setText("158.92535");
            txtEstado.setText("Sólido");

        } else if (i == 65) {
            txtNombre.setText("Disprosio");
            txtElemento.setText("Xe=4f10");
            txtNumero.setText("4");
            txtOrbital.setText("3");
            txtOrientacion.setText("-1");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f10");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("66");
            txtPeriodo.setText("6");
            txtPeso.setText("162.5");
            txtEstado.setText("Sólido");

        } else if (i == 66) {
            txtNombre.setText("Holmio");
            txtElemento.setText("Xe=4f12");
            txtNumero.setText("4");
            txtOrbital.setText("3");
            txtOrientacion.setText("0");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f11");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("67");
            txtPeriodo.setText("6");
            txtPeso.setText("164.93033");
            txtEstado.setText("Sólido");

        } else if (i == 67) {
            txtNombre.setText("Erbio");
            txtElemento.setText("Xe=4f12");
            txtNumero.setText("4");
            txtOrbital.setText("3");
            txtOrientacion.setText("1");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f12");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("68");
            txtPeriodo.setText("6");
            txtPeso.setText("167.259");
            txtEstado.setText("Sólido");

        } else if (i == 68) {
            txtNombre.setText("Tulio");
            txtElemento.setText("Xe=4f13");
            txtNumero.setText("4");
            txtOrbital.setText("3");
            txtOrientacion.setText("2");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f13");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("69");
            txtPeriodo.setText("6");
            txtPeso.setText("168.93421");
            txtEstado.setText("Sólido");

        } else if (i == 69) {
            txtNombre.setText("Iterbio");
            txtElemento.setText("Xe=4f14");
            txtNumero.setText("4");
            txtOrbital.setText("3");
            txtOrientacion.setText("3");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("70");
            txtPeriodo.setText("6");
            txtPeso.setText("173.045");
            txtEstado.setText("Sólido");

        } else if (i == 70) {
            txtNombre.setText("Lutecio");
            txtElemento.setText("Xe=5d1");
            txtNumero.setText("5");
            txtOrbital.setText("2");
            txtOrientacion.setText("-2");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d1");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("71");
            txtPeriodo.setText("6");
            txtPeso.setText("174.9668");
            txtEstado.setText("Sólido");

        } else if (i == 71) {
            txtNombre.setText("Hafnio");
            txtElemento.setText("Xe=5d2");
            txtNumero.setText("5");
            txtOrbital.setText("2");
            txtOrientacion.setText("-1");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d2");
            txtFamilia.setText("B");
            txtGrupo.setText("IV");
            txtAtomico.setText("72");
            txtPeriodo.setText("6");
            txtPeso.setText("178.49");
            txtEstado.setText("Sólido");

        } else if (i == 72) {
            txtNombre.setText("Tantalio");
            txtElemento.setText("Xe=5d3");
            txtNumero.setText("5");
            txtOrbital.setText("2");
            txtOrientacion.setText("0");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d3");
            txtFamilia.setText("B");
            txtGrupo.setText("V");
            txtAtomico.setText("73");
            txtPeriodo.setText("6");
            txtPeso.setText("180.9479");
            txtEstado.setText("Sólido");

        } else if (i == 73) {
            txtNombre.setText("Volframio");
            txtElemento.setText("Xe=5d4");
            txtNumero.setText("5");
            txtOrbital.setText("2");
            txtOrientacion.setText("1");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d4");
            txtFamilia.setText("B");
            txtGrupo.setText("VI");
            txtAtomico.setText("74");
            txtPeriodo.setText("6");
            txtPeso.setText("183.84");
            txtEstado.setText("Sólido");

        } else if (i == 74) {
            txtNombre.setText("Renio");
            txtElemento.setText("Xe=5d5");
            txtNumero.setText("5");
            txtOrbital.setText("2");
            txtOrientacion.setText("2");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d5");
            txtFamilia.setText("B");
            txtGrupo.setText("VII");
            txtAtomico.setText("75");
            txtPeriodo.setText("6");
            txtPeso.setText("186.207");
            txtEstado.setText("Sólido");

        } else if (i == 75) {
            txtNombre.setText("Osmio");
            txtElemento.setText("Xe=5d6");
            txtNumero.setText("5");
            txtOrbital.setText("2");
            txtOrientacion.setText("-2");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d6");
            txtFamilia.setText("B");
            txtGrupo.setText("VIII");
            txtAtomico.setText("76");
            txtPeriodo.setText("6");
            txtPeso.setText("190.23");
            txtEstado.setText("Sólido");

        } else if (i == 76) {
            txtNombre.setText("Iridio");
            txtElemento.setText("Xe=5d7");
            txtNumero.setText("5");
            txtOrbital.setText("2");
            txtOrientacion.setText("-1");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d7");
            txtFamilia.setText("B");
            txtGrupo.setText("VIII");
            txtAtomico.setText("77");
            txtPeriodo.setText("6");
            txtPeso.setText("192.217");
            txtEstado.setText("Sólido");

        } else if (i == 77) {
            txtNombre.setText("Plátino");
            txtElemento.setText("Xe=5d8");
            txtNumero.setText("5");
            txtOrbital.setText("2");
            txtOrientacion.setText("0");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d8");
            txtFamilia.setText("B");
            txtGrupo.setText("VIII");
            txtAtomico.setText("78");
            txtPeriodo.setText("6");
            txtPeso.setText("195.078");
            txtEstado.setText("Sólido");

        } else if (i == 78) {
            txtNombre.setText("Oro");
            txtElemento.setText("Xe=5d9");
            txtNumero.setText("5");
            txtOrbital.setText("2");
            txtOrientacion.setText("1");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d9");
            txtFamilia.setText("B");
            txtGrupo.setText("I");
            txtAtomico.setText("79");
            txtPeriodo.setText("6");
            txtPeso.setText("196.96655");
            txtEstado.setText("Sólido");

        } else if (i == 79) {
            txtNombre.setText("Mercurio");
            txtElemento.setText("Xe=5d10");
            txtNumero.setText("5");
            txtOrbital.setText("2");
            txtOrientacion.setText("2");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10");
            txtFamilia.setText("B");
            txtGrupo.setText("II");
            txtAtomico.setText("80");
            txtPeriodo.setText("6");
            txtPeso.setText("200.59");
            txtEstado.setText("Líquido");

        } else if (i == 80) {
            txtNombre.setText("Talio");
            txtElemento.setText("Xe=6p1");
            txtNumero.setText("6");
            txtOrbital.setText("1");
            txtOrientacion.setText("-1");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p1");
            txtFamilia.setText("A");
            txtGrupo.setText("III");
            txtAtomico.setText("81");
            txtPeriodo.setText("6");
            txtPeso.setText("204.3833");
            txtEstado.setText("Sólido");

        } else if (i == 81) {
            txtNombre.setText("Plomo");
            txtElemento.setText("Xe=6p2");
            txtNumero.setText("6");
            txtOrbital.setText("1");
            txtOrientacion.setText("0");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p2");
            txtFamilia.setText("A");
            txtGrupo.setText("IV");
            txtAtomico.setText("82");
            txtPeriodo.setText("6");
            txtPeso.setText("207.2");
            txtEstado.setText("Sólido");

        } else if (i == 82) {
            txtNombre.setText("Bismuto");
            txtElemento.setText("Xe=6p3");
            txtNumero.setText("6");
            txtOrbital.setText("1");
            txtOrientacion.setText("1");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p3");
            txtFamilia.setText("A");
            txtGrupo.setText("V");
            txtAtomico.setText("83");
            txtPeriodo.setText("6");
            txtPeso.setText("208.98038");
            txtEstado.setText("Sólido");

        } else if (i == 83) {
            txtNombre.setText("Polonio");
            txtElemento.setText("Xe=6p4");
            txtNumero.setText("6");
            txtOrbital.setText("1");
            txtOrientacion.setText("-1");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p4");
            txtFamilia.setText("A");
            txtGrupo.setText("VI");
            txtAtomico.setText("84");
            txtPeriodo.setText("6");
            txtPeso.setText("209");
            txtEstado.setText("Sólido");

        } else if (i == 84) {
            txtNombre.setText("Astato");
            txtElemento.setText("Xe=6p5");
            txtNumero.setText("6");
            txtOrbital.setText("1");
            txtOrientacion.setText("0");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p5");
            txtFamilia.setText("A");
            txtGrupo.setText("VII");
            txtAtomico.setText("85");
            txtPeriodo.setText("6");
            txtPeso.setText("210");
            txtEstado.setText("Sólido");

        } else if (i == 85) {
            txtNombre.setText("Radón");
            txtElemento.setText("86Rn");
            txtNumero.setText("6");
            txtOrbital.setText("1");
            txtOrientacion.setText("0");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p6");
            txtFamilia.setText("A");
            txtGrupo.setText("VII");
            txtAtomico.setText("86");
            txtPeriodo.setText("6");
            txtPeso.setText("210");
            txtEstado.setText("Gaseoso");

        } else if (i == 86) {
            txtNombre.setText("Francio");
            txtElemento.setText("86Rn=7s1");
            txtNumero.setText("7");
            txtOrbital.setText("0");
            txtOrientacion.setText("0");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p6 7s1");
            txtFamilia.setText("A");
            txtGrupo.setText("I");
            txtAtomico.setText("87");
            txtPeriodo.setText("7");
            txtPeso.setText("223.0");
            txtEstado.setText("Sólido");

        } else if (i == 87) {
            txtNombre.setText("Radio");
            txtElemento.setText("86Rn=7s2");
            txtNumero.setText("7");
            txtOrbital.setText("0");
            txtOrientacion.setText("0");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p6 7s2");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("88");
            txtPeriodo.setText("7");
            txtPeso.setText("226");
            txtEstado.setText("Sólido");

        } else if (i == 88) {
            txtNombre.setText("Actinio");
            txtElemento.setText("86Rn=5f1");
            txtNumero.setText("5");
            txtOrbital.setText("3");
            txtOrientacion.setText("-3");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p6 7s2 6d1 5f1");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("89");
            txtPeriodo.setText("7");
            txtPeso.setText("227");
            txtEstado.setText("Sólido");

        } else if (i == 89) {
            txtNombre.setText("Torio");
            txtElemento.setText("86Rn=5f2");
            txtNumero.setText("5");
            txtOrbital.setText("3");
            txtOrientacion.setText("-2");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p6 7s2 6d1 5f2");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("90");
            txtPeriodo.setText("7");
            txtPeso.setText("232.0381");
            txtEstado.setText("Sólido");

        } else if (i == 90) {
            txtNombre.setText("Protactino");
            txtElemento.setText("86Rn=5f3");
            txtNumero.setText("5");
            txtOrbital.setText("3");
            txtOrientacion.setText("-1");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p6 7s2 6d1 5f3");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("91");
            txtPeriodo.setText("7");
            txtPeso.setText("231.03588");
            txtEstado.setText("Sólido");

        } else if (i == 91) {
            txtNombre.setText("Uranio");
            txtElemento.setText("86Rn=5f5");
            txtNumero.setText("5");
            txtOrbital.setText("3");
            txtOrientacion.setText("0");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p6 7s2 6d1 5f4");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("92");
            txtPeriodo.setText("7");
            txtPeso.setText("238.02891");
            txtEstado.setText("Sólido");

        } else if (i == 92) {
            txtNombre.setText("Neptunio");
            txtElemento.setText("86Rn=5f5");
            txtNumero.setText("5");
            txtOrbital.setText("3");
            txtOrientacion.setText("1");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p6 7s2 6d1 5f5");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("93");
            txtPeriodo.setText("7");
            txtPeso.setText("237");
            txtEstado.setText("Artificial");

        } else if (i == 93) {
            txtNombre.setText("Plutonio");
            txtElemento.setText("86Rn=5f6");
            txtNumero.setText("5");
            txtOrbital.setText("3");
            txtOrientacion.setText("2");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p6 7s2 6d1 5f6");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("94");
            txtPeriodo.setText("7");
            txtPeso.setText("237");
            txtEstado.setText("Artificial");

        } else if (i == 94) {
            txtNombre.setText("Americio");
            txtElemento.setText("86Rn=5f7");
            txtNumero.setText("5");
            txtOrbital.setText("3");
            txtOrientacion.setText("3");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p6 7s2 6d1 5f7");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("95");
            txtPeriodo.setText("7");
            txtPeso.setText("243");
            txtEstado.setText("Artificial");

        } else if (i == 95) {
            txtNombre.setText("Curio");
            txtElemento.setText("86Rn=5f8");
            txtNumero.setText("5");
            txtOrbital.setText("3");
            txtOrientacion.setText("-3");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p6 7s2 6d1 5f8");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("96");
            txtPeriodo.setText("7");
            txtPeso.setText("247");
            txtEstado.setText("Artificial");

        } else if (i == 96) {
            txtNombre.setText("Berkelio");
            txtElemento.setText("86Rn=5f9");
            txtNumero.setText("5");
            txtOrbital.setText("3");
            txtOrientacion.setText("-2");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p6 7s2 6d1 5f9");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("97");
            txtPeriodo.setText("7");
            txtPeso.setText("247");
            txtEstado.setText("Artificial");

        } else if (i == 97) {
            txtNombre.setText("Californio");
            txtElemento.setText("86Rn=5f10");
            txtNumero.setText("5");
            txtOrbital.setText("3");
            txtOrientacion.setText("-1");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p6 7s2 6d1 5f10");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("98");
            txtPeriodo.setText("7");
            txtPeso.setText("");
            txtEstado.setText("Artificial");

        } else if (i == 98) {
            txtNombre.setText("Einstenio");
            txtElemento.setText("86Rn=5f11");
            txtNumero.setText("5");
            txtOrbital.setText("3");
            txtOrientacion.setText("0");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p6 7s2 6d1 5f11");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("99");
            txtPeriodo.setText("7");
            txtPeso.setText("252");
            txtEstado.setText("Artificial");

        } else if (i == 99) {
            txtNombre.setText("Fermio");
            txtElemento.setText("86Rn=5f12");
            txtNumero.setText("5");
            txtOrbital.setText("3");
            txtOrientacion.setText("1");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p6 7s2 6d1 5f12");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("100");
            txtPeriodo.setText("7");
            txtPeso.setText("257");
            txtEstado.setText("Artificial");

        } else if (i == 100) {
            txtNombre.setText("Mendelevio");
            txtElemento.setText("86Rn=5f13");
            txtNumero.setText("5");
            txtOrbital.setText("3");
            txtOrientacion.setText("2");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p6 7s2 6d1 5f13");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("101");
            txtPeriodo.setText("7");
            txtPeso.setText("258");
            txtEstado.setText("Artificial");

        } else if (i == 101) {
            txtNombre.setText("Nobelio");
            txtElemento.setText("86Rn=5f14");
            txtNumero.setText("5");
            txtOrbital.setText("3");
            txtOrientacion.setText("3");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p6 7s2 6d1 5f14");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("102");
            txtPeriodo.setText("7");
            txtPeso.setText("262");
            txtEstado.setText("Artificial");

        } else if (i == 102) {
            txtNombre.setText("Laurencio");
            txtElemento.setText("86Rn=5f15");
            txtNumero.setText("6");
            txtOrbital.setText("2");
            txtOrientacion.setText("-2");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p6 7s2 6d1 5f15");
            txtFamilia.setText("B");
            txtGrupo.setText("III");
            txtAtomico.setText("103");
            txtPeriodo.setText("7");
            txtPeso.setText("264");
            txtEstado.setText("Artificial");

        } else if (i == 103) {
            txtNombre.setText("Rutherfordio");
            txtElemento.setText("86Rn=6d2");
            txtNumero.setText("6");
            txtOrbital.setText("2");
            txtOrientacion.setText("-1");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p6 7s2 5f15 6d2");
            txtFamilia.setText("B");
            txtGrupo.setText("IV");
            txtAtomico.setText("104");
            txtPeriodo.setText("7");
            txtPeso.setText("261");
            txtEstado.setText("Artificial");

        } else if (i == 104) {
            txtNombre.setText("Dubnio");
            txtElemento.setText("86Rn=6d3");
            txtNumero.setText("6");
            txtOrbital.setText("2");
            txtOrientacion.setText("0");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p6 7s2 5f15 6d3");
            txtFamilia.setText("B");
            txtGrupo.setText("V");
            txtAtomico.setText("105");
            txtPeriodo.setText("7");
            txtPeso.setText("262");
            txtEstado.setText("Artificial");

        } else if (i == 105) {
            txtNombre.setText("Seaborgio");
            txtElemento.setText("86Rn=6d4");
            txtNumero.setText("6");
            txtOrbital.setText("2");
            txtOrientacion.setText("1");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p6 7s2 5f15 6d4");
            txtFamilia.setText("B");
            txtGrupo.setText("V");
            txtAtomico.setText("106");
            txtPeriodo.setText("7");
            txtPeso.setText("266");
            txtEstado.setText("Artificial");

        } else if (i == 106) {
            txtNombre.setText("Bohrio");
            txtElemento.setText("86Rn=6d5");
            txtNumero.setText("6");
            txtOrbital.setText("2");
            txtOrientacion.setText("2");
            txtSpin.setText("+1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p6 7s2 5f15 6d5");
            txtFamilia.setText("B");
            txtGrupo.setText("VII");
            txtAtomico.setText("107");
            txtPeriodo.setText("7");
            txtPeso.setText("264");
            txtEstado.setText("Artificial");

        } else if (i == 107) {
            txtNombre.setText("Hassio");
            txtElemento.setText("86Rn=6d6");
            txtNumero.setText("6");
            txtOrbital.setText("2");
            txtOrientacion.setText("-2");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p6 7s2 5f15 6d6");
            txtFamilia.setText("B");
            txtGrupo.setText("VIII");
            txtAtomico.setText("108");
            txtPeriodo.setText("7");
            txtPeso.setText("");
            txtEstado.setText("Artificial");

        } else if (i == 108) {
            txtNombre.setText("Meitnerio");
            txtElemento.setText("86Rn=6d7");
            txtNumero.setText("6");
            txtOrbital.setText("2");
            txtOrientacion.setText("-1");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p6 7s2 5f15 6d7");
            txtFamilia.setText("B");
            txtGrupo.setText("VIII");
            txtAtomico.setText("109");
            txtPeriodo.setText("7");
            txtPeso.setText("268");
            txtEstado.setText("Artificial");

        } else if (i == 109) {
            txtNombre.setText("Darmstadtio");
            txtElemento.setText("86Rn=6d8");
            txtNumero.setText("6");
            txtOrbital.setText("2");
            txtOrientacion.setText("0");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p6 7s2 5f15 6d8");
            txtFamilia.setText("B");
            txtGrupo.setText("VIII");
            txtAtomico.setText("110");
            txtPeriodo.setText("7");
            txtPeso.setText("281");
            txtEstado.setText("Artificial");

        } else if (i == 110) {
            txtNombre.setText("Roentgenio");
            txtElemento.setText("86Rn=6d9");
            txtNumero.setText("6");
            txtOrbital.setText("2");
            txtOrientacion.setText("1");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p6 7s2 5f15 6d9");
            txtFamilia.setText("B");
            txtGrupo.setText("I");
            txtAtomico.setText("111");
            txtPeriodo.setText("7");
            txtPeso.setText("272");
            txtEstado.setText("Artificial");

        } else if (i == 111) {
            txtNombre.setText("Copernico");
            txtElemento.setText("86Rn=6d10");
            txtNumero.setText("6");
            txtOrbital.setText("2");
            txtOrientacion.setText("2");
            txtSpin.setText("-1/2");
            txtConfiguracion.setText("1s2 2s2 2p6 3s2 2p6 3s2 3p6 4s2 3s10 4p6 5s2 4d10 5p6 6s2 5d1 4f14 5d10 6p6 7s2 5f15 6d10");
            txtFamilia.setText("B");
            txtGrupo.setText("II");
            txtAtomico.setText("112");
            txtPeriodo.setText("7");
            txtPeso.setText("285");
            txtEstado.setText("Artificial");

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void BoxUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxUnoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_BoxUnoActionPerformed

    private void txtAtomicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAtomicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAtomicoActionPerformed

    private void jButton120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton120ActionPerformed
        // TODO add your handling code here:
        Principal obj = new Principal();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton120ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfiguracionElectronica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxUno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton120;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField txtAtomico;
    private javax.swing.JTextField txtConfiguracion;
    private javax.swing.JTextField txtElemento;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFamilia;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtOrbital;
    private javax.swing.JTextField txtOrientacion;
    private javax.swing.JTextField txtPeriodo;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtSpin;
    // End of variables declaration//GEN-END:variables
}

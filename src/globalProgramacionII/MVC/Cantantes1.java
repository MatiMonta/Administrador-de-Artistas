/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package globalProgramacionII.MVC;

/**
 *
 * @author Matias
 */
import globalProgramacionII.Artista;
import globalProgramacionII.Canario;
import globalProgramacionII.Gallo;
import globalProgramacionII.MVC.Modelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Cantantes1 extends javax.swing.JDialog {

    /**
     * Creates new form Cantantes1
     */
        ArrayList<Artista> artistas= new ArrayList();
        ArrayList<Canario> canarios= new ArrayList();
        ArrayList<Gallo> gallos= new ArrayList();
        Modelo model=new Modelo();
    public Cantantes1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        
        ArrayList<Artista> artistas=model.art.getDatos();
        for (Artista a : artistas) {
            cajaCantantes.addItem(a.nombre);
        }
        ArrayList<Canario> canarios= model.can.getDatos();
        for (Canario c : canarios) {
            cajaCantantes.addItem(c.nombre);
        }
        ArrayList<Gallo> gallos= model.gall.getDatos();
        for (Gallo g : gallos) {
            cajaCantantes.addItem(g.nombre);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cajaCantantes = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        horarioT = new java.awt.TextField();
        nombreT = new java.awt.TextField();
        edadT = new java.awt.TextField();
        tipoT = new java.awt.TextField();
        instrumentoT = new java.awt.TextField();
        eliminarBoton = new java.awt.Button();
        modificarBoton = new java.awt.Button();
        salirBoton = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cajaCantantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cantantes" }));
        cajaCantantes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cajaCantantesItemStateChanged(evt);
            }
        });
        cajaCantantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaCantantesActionPerformed(evt);
            }
        });
        jPanel1.add(cajaCantantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 89, 190, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setText("Seleccione un Cantante");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 6, -1, -1));

        jLabel1.setText("Horario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        jLabel4.setText("Edad");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        jLabel5.setText("TIpo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        jLabel6.setText("Instrumento");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        horarioT.setEditable(false);
        horarioT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horarioTActionPerformed(evt);
            }
        });
        jPanel1.add(horarioT, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 140, 20));

        nombreT.setEditable(false);
        nombreT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTActionPerformed(evt);
            }
        });
        jPanel1.add(nombreT, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 140, -1));

        edadT.setEditable(false);
        edadT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadTActionPerformed(evt);
            }
        });
        jPanel1.add(edadT, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 140, -1));

        tipoT.setEditable(false);
        tipoT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoTActionPerformed(evt);
            }
        });
        jPanel1.add(tipoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 140, 20));

        instrumentoT.setEditable(false);
        instrumentoT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instrumentoTActionPerformed(evt);
            }
        });
        jPanel1.add(instrumentoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 140, 20));

        eliminarBoton.setLabel("Eliminar");
        eliminarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBotonActionPerformed(evt);
            }
        });
        jPanel1.add(eliminarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, -1, -1));

        modificarBoton.setLabel("Modificar");
        jPanel1.add(modificarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, -1));

        salirBoton.setLabel("Salir");
        salirBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBotonActionPerformed(evt);
            }
        });
        jPanel1.add(salirBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void instrumentoTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instrumentoTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_instrumentoTActionPerformed

    private void tipoTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoTActionPerformed

    private void edadTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadTActionPerformed

    private void nombreTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTActionPerformed

    private void horarioTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horarioTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horarioTActionPerformed

    private void cajaCantantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaCantantesActionPerformed
    
        for (Artista a : artistas) {
            if(cajaCantantes.getSelectedItem().toString().equals(a.nombre.toString()))
            {
                nombreT.setText(a.nombre);
                tipoT.setText(a.usa[0].tipo);
                instrumentoT.setText(a.usa[0].nombre);
                horarioT.setText(a.cuando.tipo);
            }
        }
    }//GEN-LAST:event_cajaCantantesActionPerformed

    private void cajaCantantesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cajaCantantesItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED)
        {
            if(this.cajaCantantes.getSelectedIndex()>0)
            {
                
                ArrayList<Artista> a= model.art.getDatos();
                    for (Artista artista : a) {
                        if(cajaCantantes.getSelectedItem().equals(artista.nombre))
                        {
                            nombreT.setText(artista.nombre);
                            tipoT.setText(artista.usa[0].tipo);
                            instrumentoT.setText(artista.usa[0].nombre);
                            horarioT.setText(artista.cuando.tipo);
                            int edad= artista.calcularEdad();
                            edadT.setText(""+edad+" A??os");
                        }
                    }
                ArrayList<Canario> canario= model.can.getDatos();
                    for (Canario c : canario) {
                        if(cajaCantantes.getSelectedItem().equals(c.nombre))
                        {
                            nombreT.setText(c.nombre);
                            horarioT.setText(c.cuando.tipo);
                        }
                    }
                ArrayList<Gallo> gallo= model.gall.getDatos();
                    for (Gallo g : gallo) {
                        if(cajaCantantes.getSelectedItem().equals(g.nombre))
                        {
                            nombreT.setText(g.nombre);
                            horarioT.setText(g.cuando.tipo);
                        }
                    }
            }
        }
    }//GEN-LAST:event_cajaCantantesItemStateChanged

    private void salirBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBotonActionPerformed
        JFrame f = new JFrame();
        int opcion= JOptionPane.showConfirmDialog(f, "Esta seguro de que desea salir?");
        if(opcion==0)
        {
            JOptionPane.showMessageDialog(f, "Se ha cerrado el programa con exito");
            System.exit(0);
        }

    }//GEN-LAST:event_salirBotonActionPerformed

    private void eliminarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBotonActionPerformed
        eliminarBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Artista> a= model.art.getDatos();
            for (Artista artista : a) {
                if(cajaCantantes.getSelectedItem().equals(artista.nombre))
                {
                    model.art.borrarDato(artista);
                }
            }
        ArrayList<Canario> canario= model.can.getDatos();
            for (Canario c : canario) {
                if(cajaCantantes.getSelectedItem().equals(c.nombre))
                {
                    model.can.borrarDato(c);
                }
            }
        ArrayList<Gallo> gallo= model.gall.getDatos();
            for (Gallo g : gallo) {
                if(cajaCantantes.getSelectedItem().equals(g.nombre))
                {
                    model.gall.borrarDato(g);
                }
            }
                JOptionPane.showMessageDialog(null, "Eliminado con Exito");
            }
        });
    }//GEN-LAST:event_eliminarBotonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cantantes1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cantantes1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cantantes1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cantantes1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Cantantes1 dialog = new Cantantes1(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> cajaCantantes;
    public java.awt.TextField edadT;
    public java.awt.Button eliminarBoton;
    public java.awt.TextField horarioT;
    public java.awt.TextField instrumentoT;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public java.awt.Button modificarBoton;
    public java.awt.TextField nombreT;
    public java.awt.Button salirBoton;
    public java.awt.TextField tipoT;
    // End of variables declaration//GEN-END:variables
}

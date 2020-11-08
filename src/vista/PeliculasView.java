package vista;

import clases.User;
import clases.Tipos;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import se_controlador.MotorController;

/**
 *
 * @author Usuario
 */
public class PeliculasView extends javax.swing.JFrame {
    private MotorController motor;
    
    public PeliculasView() {
        initComponents();
        this.setVisible(true);
        //motor = new MotorController();
    }
        public void setMotorController(MotorController motorController) {
        this.motor = motorController;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        CB_Genero = new javax.swing.JComboBox();
        CB_Formato = new javax.swing.JComboBox();
        CB_MoodFormato = new javax.swing.JComboBox();
        btn_BuscarMood = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        CB_Mood = new javax.swing.JComboBox();
        CB_Duracion = new javax.swing.JComboBox();
        btn_BuscarGenero1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Result = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btn_limpiar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asistente de Peliculas");
        setBackground(java.awt.Color.white);

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jLabel1.setText("BIENVENIDO, A CONTINUACION EN BASE A SUS PREFERENCIAS LE RECOMENDAREMOS LA MEJOR PELICULA PARA USTED");

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        jLabel2.setText("ASISTENTE DE PELICULAS");

        jLabel3.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jLabel3.setText("Según género");

        CB_Genero.setBackground(new java.awt.Color(153, 153, 153));
        CB_Genero.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        CB_Genero.setForeground(new java.awt.Color(255, 255, 255));
        CB_Genero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Acción", "Amor", "Comedia", "Aventura" }));

        CB_Formato.setBackground(new java.awt.Color(153, 153, 153));
        CB_Formato.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        CB_Formato.setForeground(new java.awt.Color(255, 255, 255));
        CB_Formato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "LiveAction", "Animada", "Tradicional" }));

        CB_MoodFormato.setBackground(new java.awt.Color(153, 153, 153));
        CB_MoodFormato.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        CB_MoodFormato.setForeground(new java.awt.Color(255, 255, 255));
        CB_MoodFormato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Live action", "Animada", "Tradicional" }));

        btn_BuscarMood.setBackground(new java.awt.Color(0, 0, 0));
        btn_BuscarMood.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        btn_BuscarMood.setForeground(new java.awt.Color(255, 255, 255));
        btn_BuscarMood.setText("Buscar");
        btn_BuscarMood.setFocusCycleRoot(true);
        btn_BuscarMood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarMoodActionPerformed(evt);
            }
        });

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jLabel4.setText("Según su estado de ánimo");

        CB_Mood.setBackground(new java.awt.Color(153, 153, 153));
        CB_Mood.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        CB_Mood.setForeground(new java.awt.Color(255, 255, 255));
        CB_Mood.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Neutral", "Triste", "Feliz" }));

        CB_Duracion.setBackground(new java.awt.Color(153, 153, 153));
        CB_Duracion.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        CB_Duracion.setForeground(new java.awt.Color(255, 255, 255));
        CB_Duracion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Media", "Larga" }));

        btn_BuscarGenero1.setBackground(new java.awt.Color(0, 0, 0));
        btn_BuscarGenero1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        btn_BuscarGenero1.setForeground(new java.awt.Color(255, 255, 255));
        btn_BuscarGenero1.setText("Buscar");
        btn_BuscarGenero1.setFocusCycleRoot(true);
        btn_BuscarGenero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarGenero1ActionPerformed(evt);
            }
        });

        txt_Result.setColumns(20);
        txt_Result.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        txt_Result.setRows(5);
        jScrollPane1.setViewportView(txt_Result);

        jLabel5.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jLabel5.setText("Formato");

        jLabel6.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jLabel6.setText("Género");

        jLabel7.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jLabel7.setText("Su ánimo");

        jLabel8.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jLabel8.setText("Duración");

        jLabel9.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jLabel9.setText("Formato");

        txt_user.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel11.setText("Usuario:");

        btn_limpiar.setBackground(new java.awt.Color(0, 0, 0));
        btn_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        jLabel10.setText("(Media -90min - Larga +90min)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CB_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CB_Duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CB_Formato, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5))
                                .addGap(300, 300, 300))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btn_limpiar)
                                        .addGap(35, 35, 35))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btn_BuscarGenero1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(121, 121, 121)))))
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_BuscarMood, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CB_Mood, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CB_MoodFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CB_Mood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CB_MoodFormato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(33, 33, 33)
                                .addComponent(btn_limpiar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CB_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CB_Duracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(4, 4, 4)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(CB_Formato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_BuscarGenero1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_BuscarMood, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
 
    private void btn_BuscarGenero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarGenero1ActionPerformed
        //------------------------btn BUSCAR GENERO------------------------
        showResult("");
         if(!txt_user.getText().isEmpty()){
            txt_user.setBackground(Color.white);
            txt_user.setEditable(false);
            Tipos tipo = new Tipos();
            User user = new User();

            String user_name = txt_user.getText();
            String genero = String.valueOf(CB_Genero.getSelectedItem());
            String formato = String.valueOf(CB_Formato.getSelectedItem());
            String duracion = String.valueOf(CB_Duracion.getSelectedItem());
            
            tipo.setTipo_genero(genero);
            tipo.setTipo_formato(formato);
            tipo.setTipo_duracion(duracion);
            user.setUser(user_name);
            try {
                motor.setTipoPelicula(tipo, user);
                motor.ejecutar();
            } catch (IOException ex) {
                Logger.getLogger(PeliculasView.class.getName()).log(Level.SEVERE, null, ex);
            }
            //motor.setPeliculaGenero(genero, formato, duracion);
         }else{
             txt_user.setBackground(Color.red);
             JOptionPane.showMessageDialog(rootPane, "Falta nombre de usuario"); //componente padre & text to show
         }
      
    }//GEN-LAST:event_btn_BuscarGenero1ActionPerformed
    public void showResult(String res){        
       txt_Result.setText(res);
    }
    
    private void btn_BuscarMoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarMoodActionPerformed
        //--------------------------btn BUSCAR ANIMO--------------------------
        showResult("");
        if(!txt_user.getText().isEmpty()){
            txt_user.setBackground(Color.white);
            txt_user.setEditable(false);
            Tipos tipo = new Tipos();
            User user = new User();

            String user_name = txt_user.getText();
            String mood = String.valueOf(CB_Mood.getSelectedItem());
            String formato = String.valueOf(CB_MoodFormato.getSelectedItem());

            tipo.setTipo_mood(mood);
            tipo.setTipo_formato(formato);
            user.setUser(user_name);
             try {
                motor.setTipoPelicula(tipo, user);//mando los dos objetos
                motor.ejecutar();//ejecuto
            } catch (IOException ex) {
                Logger.getLogger(PeliculasView.class.getName()).log(Level.SEVERE, null, ex);
            }
            //txt_Result.setText(moodResult);
        }else{
            txt_user.setBackground(Color.red);
             JOptionPane.showMessageDialog(rootPane, "Falta nombre de usuario"); //componente padre & text to show
        }
        
    }//GEN-LAST:event_btn_BuscarMoodActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        showResult("");
    }//GEN-LAST:event_btn_limpiarActionPerformed

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
            java.util.logging.Logger.getLogger(PeliculasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeliculasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeliculasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeliculasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeliculasView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CB_Duracion;
    private javax.swing.JComboBox CB_Formato;
    private javax.swing.JComboBox CB_Genero;
    private javax.swing.JComboBox CB_Mood;
    private javax.swing.JComboBox CB_MoodFormato;
    private javax.swing.JButton btn_BuscarGenero1;
    private javax.swing.JButton btn_BuscarMood;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public javax.swing.JTextArea txt_Result;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
package ED;

import javax.swing.JOptionPane;
/**
 *
 * @author lucas
 */
public class InterfacePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form InterfacePrincipal
     */
    public InterfacePrincipal() {
        super("Testando Lista Simplesmente Encadeada"); //Modifica o título da JFrame
        initComponents();        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcoes_de_listas = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sel_ListaSeq = new javax.swing.JRadioButton();
        sel_LSE = new javax.swing.JRadioButton();
        sel_pilha = new javax.swing.JRadioButton();
        sel_fila = new javax.swing.JRadioButton();
        btn_ok = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sel_arv = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Estruturas de Dados");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Em Interface Gráfica");

        opcoes_de_listas.add(sel_ListaSeq);
        sel_ListaSeq.setText("Lista Sequencial");

        opcoes_de_listas.add(sel_LSE);
        sel_LSE.setText("Lista Simpl. Encad.");

        opcoes_de_listas.add(sel_pilha);
        sel_pilha.setText("Pilha");

        opcoes_de_listas.add(sel_fila);
        sel_fila.setText("Fila");

        btn_ok.setText("Iniciar");
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });

        jLabel1.setText("Selecione um tipo de Estrutura:");

        opcoes_de_listas.add(sel_arv);
        sel_arv.setText("Arvore");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btn_ok))
                    .addComponent(sel_LSE)
                    .addComponent(sel_ListaSeq)
                    .addComponent(sel_pilha)
                    .addComponent(sel_fila)
                    .addComponent(sel_arv))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sel_ListaSeq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sel_LSE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sel_pilha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sel_fila)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sel_arv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(btn_ok)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        if(sel_ListaSeq.isSelected()){
            ListaSeqJFrame novaListaSeq = new ListaSeqJFrame();
            novaListaSeq.setVisible(true);
        }
        if(sel_LSE.isSelected()){
            LSEJFrame novaListaEncad = new LSEJFrame();
            novaListaEncad.setVisible(true);
        }
        if(sel_pilha.isSelected()){
           PilhaJFrame novaPilha = new PilhaJFrame();
           novaPilha.setVisible(true);
        }
        if(sel_fila.isSelected()){
            Filas novaFila = new Filas();
            novaFila.setVisible(true);
        }
        if(sel_arv.isSelected()){
            ABPJFrame novaArv = new ABPJFrame();
            novaArv.setVisible(true);
        }
    }//GEN-LAST:event_btn_okActionPerformed
          
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
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfacePrincipal().setVisible(true);                
            }
        });
        
        
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.ButtonGroup opcoes_de_listas;
    private javax.swing.JRadioButton sel_LSE;
    private javax.swing.JRadioButton sel_ListaSeq;
    private javax.swing.JRadioButton sel_arv;
    private javax.swing.JRadioButton sel_fila;
    private javax.swing.JRadioButton sel_pilha;
    // End of variables declaration//GEN-END:variables
}

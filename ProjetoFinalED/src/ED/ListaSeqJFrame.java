/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ED;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Santos
 */
public class ListaSeqJFrame extends javax.swing.JFrame {
    
    
    ListaSeq lista;
    JButton arrayBotoes[];
    
    public void limpaBotoes(){
        for(int i=0; i< arrayBotoes.length; i++){
            arrayBotoes[i].setText(" ");
        }
    }
    
    public void atualizaBotoes(){
        for(int i=0; i<lista.tamanho(); i++){
            arrayBotoes[i].setText(Integer.toString(lista.elemento(i+1)));
        }
    }
    
    public void voltaCorOriginal(){
        for(int i=0; i<lista.tamanho(); i++){
            arrayBotoes[i].setBackground(Color.LIGHT_GRAY);
        }
    }

    /**
     * Creates new form ListaSeqSwing
     */
    public ListaSeqJFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campo_tamanho = new javax.swing.JTextField();
        btn_criar = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campo_valor = new javax.swing.JTextField();
        campo_posicao = new javax.swing.JTextField();
        btn_inserir = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_remover = new javax.swing.JButton();
        painel_botoes = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista Sequencial");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Criar Lista"));

        jLabel1.setText("Tamanho:");

        btn_criar.setText("Criar");
        btn_criar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_criarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_criar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campo_tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_criar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Operações"));

        jLabel2.setText("Valor:");

        jLabel3.setText("Posição:");

        btn_inserir.setText("Inserir");
        btn_inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inserirActionPerformed(evt);
            }
        });

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_remover.setText("Remover");
        btn_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addComponent(campo_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campo_posicao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btn_inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(campo_posicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(campo_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_inserir)
                        .addComponent(btn_remover)
                        .addComponent(btn_buscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painel_botoes.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout painel_botoesLayout = new javax.swing.GroupLayout(painel_botoes);
        painel_botoes.setLayout(painel_botoesLayout);
        painel_botoesLayout.setHorizontalGroup(
            painel_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        painel_botoesLayout.setVerticalGroup(
            painel_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addComponent(painel_botoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painel_botoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_criarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_criarActionPerformed
               try{
                int tamanho = Integer.parseInt(campo_tamanho.getText());
                painel_botoes.removeAll();
                lista = new ListaSeq(tamanho);

                // 
                arrayBotoes = new JButton[tamanho];
                int coluna = 40;
                for(int i=0; i<tamanho; i++){
                    arrayBotoes[i] = new JButton();
                    arrayBotoes[i].setText(" ");
                    arrayBotoes[i].setBounds(coluna, 20, 50, 40);
                    painel_botoes.add(arrayBotoes[i]);
                    painel_botoes.repaint();
                    //painel_botoes.setVisible(true);
                    coluna += 50;
                    campo_tamanho.setText("");
                }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "ERRO! Insira apenas Números Inteiros!");
            campo_tamanho.setText("");
        }
    }//GEN-LAST:event_btn_criarActionPerformed

    private void btn_inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inserirActionPerformed
        try{
               int posicao = Integer.parseInt(campo_posicao.getText());
               int valor = Integer.parseInt(campo_valor.getText());
               voltaCorOriginal();
       
                if(lista.cheia()){
                     JOptionPane.showMessageDialog(null, "Erro! Lista Cheia!/ Posição Inválida!");
                }else{
                         lista.insere(posicao, valor);
                         atualizaBotoes();
                }
       }catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "ERRO! Insira apenas Números Inteiros!");
           campo_valor.setText("");
           campo_posicao.setText("");
       }
        campo_valor.setText("");
        campo_posicao.setText("");
    }//GEN-LAST:event_btn_inserirActionPerformed

    private void btn_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removerActionPerformed
       try{
               int posicao = Integer.parseInt(campo_posicao.getText());
               voltaCorOriginal();
               if(lista.vazia()){
                   JOptionPane.showMessageDialog(null, "Erro! Lista Vazia!");
               }else{
                   lista.remove(posicao);
               }
               limpaBotoes();
               atualizaBotoes();
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "ERRO! Insira apenas Números Inteiros!");
            campo_valor.setText("");
            campo_posicao.setText("");
        }
        campo_valor.setText("");
        campo_posicao.setText("");
    }//GEN-LAST:event_btn_removerActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        voltaCorOriginal();
        try{
                // BUSCA PELA POSICAO
                if(campo_valor.getText().isEmpty()){
                    int posicao = Integer.parseInt(campo_posicao.getText());
                    if(posicao <= lista.tamanho() && posicao >= 0){
                        arrayBotoes[posicao-1].setBackground(Color.yellow);
                    }else{
                        JOptionPane.showMessageDialog(null, "Posicao Vazia ou Invalida!!");
                    }
                }

                // BUSCA PELO VALOR
                if(campo_posicao.getText().isEmpty()){
                    int valor = Integer.parseInt(campo_valor.getText());
                    boolean encontrou = false;

                    for(int i=1; i<=lista.tamanho(); i++){
                        if(valor == lista.elemento(i)){
                            arrayBotoes[lista.posicao(valor)-1].setBackground(Color.yellow);
                            encontrou = true;
                        }
                    }
            
                    if(!encontrou){
                        JOptionPane.showMessageDialog(null, "O Valor não está na lista!!");
                    }
                }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "ERRO! Insira apenas Números Inteiros!");
        }

        
        campo_valor.setText("");
        campo_posicao.setText("");
    }//GEN-LAST:event_btn_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(ListaSeqJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaSeqJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaSeqJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaSeqJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaSeqJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JToggleButton btn_criar;
    private javax.swing.JButton btn_inserir;
    private javax.swing.JButton btn_remover;
    private javax.swing.JTextField campo_posicao;
    private javax.swing.JTextField campo_tamanho;
    private javax.swing.JTextField campo_valor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel painel_botoes;
    // End of variables declaration//GEN-END:variables
}

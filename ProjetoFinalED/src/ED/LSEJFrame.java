package ED;

import com.sun.javafx.scene.control.skin.ButtonSkin;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author vinic
 */
public class LSEJFrame extends javax.swing.JFrame {
    /**
     * Creates new form LSEJFrame
     */
    public LSEJFrame() {
        initComponents(); 
        inicia();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        inserir = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        remover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane(jPanel3);
        jPanel3 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista Simplemente Encadeada");
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        inserir.setText("Inserir");
        inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        remover.setText("Remover");
        remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(inserir)
                .addGap(18, 18, 18)
                .addComponent(buscar)
                .addGap(18, 18, 18)
                .addComponent(remover)
                .addContainerGap(418, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inserir)
                    .addComponent(buscar)
                    .addComponent(remover))
                .addContainerGap())
        );

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(151, 679));
        jPanel3.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        LSE lista = new LSE();  
        JButton[] buttons ; 
        int flag =0;
        JLabel[] setas ;
    private void removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerActionPerformed
        
        int posição = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição desejada:"));
        if(posição <= lista.tamanho()){
            retira(posição);
            System.out.println(lista.tamanho());
        }else
            JOptionPane.showMessageDialog(null, "Posição não encontrada");
               
    }//GEN-LAST:event_removerActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
       
        int elemento = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do elemento a ser removido:"));
        if(posição(elemento) == -1){
            JOptionPane.showMessageDialog(null,"O elemento não está na lista");
        }else
            JOptionPane.showMessageDialog(null,"O elemento está na posição " +
            Integer.toString(posição(elemento)));        
    }//GEN-LAST:event_buscarActionPerformed

    private void inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirActionPerformed
        try{
            int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor desejado:"));
            int posição = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição desejada:"));

            insere(valor, posição);
            System.out.println(lista.tamanho());
            controleDaVisibilidadeBotões();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro.");
        }
    }//GEN-LAST:event_inserirActionPerformed
                   
    private boolean removeInicioLista(){
        if(lista.removeInicioLista()){
            alteraNomeDosBotões();
            copiaListaParaBotões();
            controleDaVisibilidadeBotões();
            apagaSetas();
            return true;  
        }else{
            //System.out.println("Remoção No Inicio Falhou");            
        }
        return false;    
    }
    
    private boolean removeNaLista(int posição){
        if(lista.removeNaLista(posição)){
            alteraNomeDosBotões();
            copiaListaParaBotões();
            controleDaVisibilidadeBotões();
            apagaSetas();
            return true;
        }else{
            //System.out.println("Remoção na Lista Falhou");
        }
        return false;
    }  
    
    public boolean retira (int posição){
    	// Lista vazia 
	    if (lista.vazia()) {
                //System.out.println("ListaVazia");
	    	return false;
	    }
	    // Remoção do elemento da cabeça da lista 
	    if (posição == 1){
                //System.out.println("RemoveInicioLista");
	        return removeInicioLista();
	    }
	    // Remoção em outro lugar da lista
	    else{
                //System.out.println("RemoveNaLista");
	        return removeNaLista(posição);
	    }
    }
        
    private int posição(int elemento) {      
            int aux = lista.posicao(elemento);
            if (aux == -1){
                //JOptionPane.showMessageDialog(null, "Posição inválida"); 
                return -1;
            }else {
                return aux; 
            }        
    }
    
    private boolean insereNoInicio(int valor){       
            if(lista.insereInicioLista(valor)){
                copiaListaParaBotões();
                controleDaVisibilidadeBotões();
                return true;
            }else{
                //System.out.println("Falhou no Inicio");
                return false;
            }          
    }
    
    private boolean insereFimLista(int valor){
        if(lista.insereFimLista(valor)){
            copiaListaParaBotões();
            controleDaVisibilidadeBotões();
            return true;
        }else{
            //System.out.println("Falhou no Fim");
            return false;
        }
    }
    
    private boolean insereMeioLista(int posição, int valor){
        if(lista.insereMeioLista(posição, valor)){
            copiaListaParaBotões();
            controleDaVisibilidadeBotões();
            return true;
        }else{
            //System.out.println("Falhou no Meio");
            return false;
        }
    }
    
    private boolean insere(int valor, int posição){
        try{
            if (lista.vazia() && posição != 1){
                JOptionPane.showMessageDialog(null,"Dados incorretos");
                return false;
             }
            if(flag == 1){  
                 if ((posição == 1)){
                //System.out.println("InsereNoInicio");
                return insereNoInicio(valor);             }
                
            }
            if ((posição == 1) && (buttons[1].getText()=="vazio")){
                JOptionPane.showMessageDialog(null,"Dados incorretos");
                return false;
            }
                else if ((posição == lista.tamanho()+1)){
                    //System.out.println("InsereFimLista");
                    return insereFimLista(valor);
                }
              
               else{
                    //System.out.println("InsereMeioLista");
                    return insereMeioLista(posição  , valor);
               }
        }catch(Exception e){
               JOptionPane.showMessageDialog(null, "Ocorreu um erro.");
               return false;
        }
        
    }
    
    private void copiaListaParaBotões(){
        for(int i =0 ; i<lista.tamanho();i++){
            buttons[i].setText(Integer.toString(lista.busca(i+1))); 
        }
    }
    
    private void alteraNomeDosBotões(){
         for(int i =0 ; i<buttons.length;i++){
            buttons[i].setText("vazio"); 
        }
    }
    
    public void apagaSetas(){
        for(int i = 0; i < buttons.length -1; i++){
            if(i < buttons.length){
                if(buttons[i+1].isVisible()){
                    setas[i].setVisible(true);
                }else{
                    setas[i].setVisible(false);
                }
            }
        }
    }
    
    /*
    private void apagaBotões(){
         for(int i =0 ; i<buttons.length;i++){
            buttons[i]=null; 
        }
    }
    */
    
    private void controleDaVisibilidadeBotões(){
        for(int i=0;i<buttons.length ; i++){
            if (buttons[i].getText().contains("vazio")){
                buttons[i].setVisible(false);
                
            }else{
                if(i>0){
                    setas[i-1].setVisible(true);
                }
                buttons[i].setVisible(true);
            }
        }
    }
        
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
            java.util.logging.Logger.getLogger(LSEJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LSEJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LSEJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LSEJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LSEJFrame().setVisible(true);
            }
        });       
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JButton inserir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton remover;
    // End of variables declaration//GEN-END:variables

    private void inicia() {
                buttons = new JButton[7];
                setas = new JLabel[6];

                for(int i=0 ; i< 7; i++){
                    if(i<6){
                        setas[i] = new JLabel(new ImageIcon("src//Imagem//seta.jpg"));
                        setas[i].setBounds(90+90*i, 55, 30, 30);
                        setas[i].setVisible(false);
                        jPanel3.add(setas[i]);
                    }
                    buttons[i] = new JButton("vazio");
                    buttons[i].setBounds(30+90*i,50,60,40);
                    buttons[i].setBackground(Color.LIGHT_GRAY);
                    buttons[i].setForeground(Color.black);
                    buttons[i].setRolloverEnabled(false);
                    buttons[i].setFocusTraversalPolicyProvider(false);
                    buttons[i].setFont(new Font("Tahoma",Font.BOLD,15));
                    buttons[i].setVisible(false);
                    jPanel3.add(buttons[i]); // adiciona botão ao painel
                    
                }
                jPanel3.revalidate();//método para atualizar o painel 
                flag++;
    }
}

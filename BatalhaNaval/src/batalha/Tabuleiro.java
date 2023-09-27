
package batalha;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

/**
 *
 * @author jota_gomes
 */
public class Tabuleiro extends javax.swing.JFrame {
    
    JPanel paineisH[][];
    JPanel paineisIA[][];
    
    public Tabuleiro() {
        initComponents();
        this.paineisH = new JPanel[5][10];
        this.paineisIA = new JPanel[5][10];
        
        meuInitComponents();
    }
    
    public void meuInitComponents(){
        criaPaineis();
    }
    
    /*
    private void adicionarEventoMouseClicked(JPanel painel) {
        painel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JPanel painelClicado = (JPanel) e.getSource();
                painelClicado.setBackground(Color.blue);
            }
        });
    }*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelIA = new javax.swing.JPanel();
        jPanelH = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(102, 102, 102));

        jPanelIA.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanelIALayout = new javax.swing.GroupLayout(jPanelIA);
        jPanelIA.setLayout(jPanelIALayout);
        jPanelIALayout.setHorizontalGroup(
            jPanelIALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelIALayout.setVerticalGroup(
            jPanelIALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
        );

        jPanelH.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanelHLayout = new javax.swing.GroupLayout(jPanelH);
        jPanelH.setLayout(jPanelHLayout);
        jPanelHLayout.setHorizontalGroup(
            jPanelHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 563, Short.MAX_VALUE)
        );
        jPanelHLayout.setVerticalGroup(
            jPanelHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setText("  A");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel2.setText("B");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 26)); // NOI18N
        jLabel3.setText("1");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 26)); // NOI18N
        jLabel4.setText("2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelIA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel3)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel4)))
                .addContainerGap(656, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(jPanelH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
          
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
            java.util.logging.Logger.getLogger(Tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabuleiro().setVisible(true);
            }
        });
    }
    
    public void criaPaineis() {
        int larguraPainelPequeno = 53; // 
        int alturaPainelPequeno = 53; // 

        int espacamentoHorizontal = 3; // Sem espaçamento horizontal
        int espacamentoVertical = 3; // Sem espaçamento vertical
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                JPanel painelPequenoIA = new JPanel();
                painelPequenoIA.setBackground(Color.lightGray); // Define a cor de fundo
                painelPequenoIA.setBounds(j * (larguraPainelPequeno + espacamentoHorizontal) + espacamentoHorizontal,
                        i * (alturaPainelPequeno + espacamentoVertical) + espacamentoVertical,
                        larguraPainelPequeno,
                        alturaPainelPequeno);
                
                jPanelIA.add(painelPequenoIA); // Adiciona ao painel da IA
                paineisIA[i][j] = painelPequenoIA; // Adiciona o painel à matriz da IA
            }
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                JPanel painelPequenoH = new JPanel();
                painelPequenoH.setBackground(Color.lightGray); // Define a cor de fundo
                painelPequenoH.setBounds(j * (larguraPainelPequeno + espacamentoHorizontal) + espacamentoHorizontal,
                        i * (alturaPainelPequeno + espacamentoVertical) + espacamentoVertical,
                        larguraPainelPequeno,
                        alturaPainelPequeno);
                
                jPanelH.add(painelPequenoH); // Adiciona ao painel do Player         
                paineisH[i][j] = painelPequenoH; // Adiciona o painel à matriz da Player
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelH;
    private javax.swing.JPanel jPanelIA;
    // End of variables declaration//GEN-END:variables
}
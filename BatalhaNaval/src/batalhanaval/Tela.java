package batalhanaval;

import batalhanaval.jogadores.Jogador;
import batalhanaval.jogadores.Maquina;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;

/**
 *
 * @author jota_gomes 
 */
public class Tela extends javax.swing.JFrame {
    JPanel paineisH[][];
    JPanel paineisIA[][];
    Tabuleiro tabuleiro;
    Partida partida;
    
    public Tela() {
        initComponents();
        this.paineisH = new JPanel[5][10];
        this.paineisIA = new JPanel[5][10];
        
        Jogador[] jogadores = definirJogadores();
        this.partida = new Partida(jogadores);
        this.tabuleiro = new Tabuleiro(5,10);
        
        meuInitComponents();
    }
    
    public void meuInitComponents(){
        criaPaineis();
    }
    
    private Jogador[] definirJogadores() {
        Jogador[] jogadores = new Jogador[2];
       
        jogadores[0] = new Jogador(0);
        jogadores[1] = new Maquina(1);
        
        return jogadores;
    }
    
    public void definirEmbarcacoes(String info) {
        try {
            int linha;
            int coluna;

            if (info.length() == 2) {
                char letra = info.charAt(0);
                char digito = info.charAt(1);

                if (letra >= 'A' && letra <= 'E' && digito >= '1' && digito <= '5') {
                    linha = letra - 'A' + 1; // Converte a letra para um valor de linha (A=1, B=2, etc.)
                    coluna = digito - '0'; // Converte o dígito para um valor de coluna (1, 2, etc.)
                } else {

                }
            } else {

            }

        } catch (NumberFormatException ex) {
            System.err.println("Erro: " + ex.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        principal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        portaavioesTxt = new javax.swing.JTextField();
        fragataTxt = new javax.swing.JTextField();
        cruzadorTxt = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        iniciarBtn = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        horizontal1 = new javax.swing.JRadioButton();
        horizontal2 = new javax.swing.JRadioButton();
        horizontal3 = new javax.swing.JRadioButton();
        vertical1 = new javax.swing.JRadioButton();
        vertical2 = new javax.swing.JRadioButton();
        vertical3 = new javax.swing.JRadioButton();
        jLabel39 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        iniciarBtn1 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        acertoIA = new javax.swing.JLabel();
        acertoP = new javax.swing.JLabel();
        jPanelIA = new javax.swing.JPanel();
        jPanelH = new javax.swing.JPanel();

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("7");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("8");

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("8");

        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        principal.setBackground(new java.awt.Color(51, 153, 255));
        principal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        principal.setToolTipText("");

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("1");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("2");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("3");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("4");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("5");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("6");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("7");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("8");

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("9");

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("10");

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("10");

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("9");

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("8");

        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("7");

        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("6");

        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("5");

        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("4");

        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("3");

        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("2");

        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("1");

        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("A");

        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("B");

        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("C");

        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("D");

        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("A");

        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("B");

        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("C");

        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("D");

        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("E");

        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("E");

        jLabel35.setBackground(new java.awt.Color(0, 0, 0));
        jLabel35.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Porta-aviões (4x):");

        portaavioesTxt.setBackground(new java.awt.Color(255, 255, 255));
        portaavioesTxt.setForeground(new java.awt.Color(0, 0, 0));
        portaavioesTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                portaavioesTxtKeyReleased(evt);
            }
        });

        fragataTxt.setBackground(new java.awt.Color(255, 255, 255));
        fragataTxt.setForeground(new java.awt.Color(0, 0, 0));
        fragataTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fragataTxtKeyReleased(evt);
            }
        });

        cruzadorTxt.setBackground(new java.awt.Color(255, 255, 255));
        cruzadorTxt.setForeground(new java.awt.Color(0, 0, 0));
        cruzadorTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cruzadorTxtKeyReleased(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("Fragata (3x):");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Cruzador (2x):");

        iniciarBtn.setBackground(new java.awt.Color(255, 255, 255));
        iniciarBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        iniciarBtn.setForeground(new java.awt.Color(0, 0, 0));
        iniciarBtn.setText("INICIAR");
        iniciarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarBtnActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("Posicão inicial:");

        horizontal1.setBackground(new java.awt.Color(51, 153, 255));
        horizontal1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        horizontal1.setForeground(new java.awt.Color(0, 0, 0));
        horizontal1.setText("H");
        horizontal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horizontal1ActionPerformed(evt);
            }
        });

        horizontal2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        horizontal2.setForeground(new java.awt.Color(0, 0, 0));
        horizontal2.setText("H");
        horizontal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horizontal2ActionPerformed(evt);
            }
        });

        horizontal3.setBackground(new java.awt.Color(51, 153, 255));
        horizontal3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        horizontal3.setForeground(new java.awt.Color(0, 0, 0));
        horizontal3.setText("H");

        vertical1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        vertical1.setForeground(new java.awt.Color(0, 0, 0));
        vertical1.setText("V");

        vertical2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        vertical2.setForeground(new java.awt.Color(0, 0, 0));
        vertical2.setText("V");

        vertical3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        vertical3.setForeground(new java.awt.Color(0, 0, 0));
        vertical3.setText("V");

        jLabel39.setBackground(new java.awt.Color(0, 0, 0));
        jLabel39.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("Disparo em:");

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));

        iniciarBtn1.setBackground(new java.awt.Color(255, 255, 255));
        iniciarBtn1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        iniciarBtn1.setForeground(new java.awt.Color(0, 0, 0));
        iniciarBtn1.setText("ATIRAR!");
        iniciarBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarBtn1ActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("Acertos IA:");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setText("Acertos Player:");

        acertoIA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        acertoIA.setForeground(new java.awt.Color(0, 0, 0));
        acertoIA.setText("0");

        acertoP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        acertoP.setForeground(new java.awt.Color(0, 0, 0));
        acertoP.setText("0");

        jPanelIA.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanelIALayout = new javax.swing.GroupLayout(jPanelIA);
        jPanelIA.setLayout(jPanelIALayout);
        jPanelIALayout.setHorizontalGroup(
            jPanelIALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
        );
        jPanelIALayout.setVerticalGroup(
            jPanelIALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 243, Short.MAX_VALUE)
        );

        jPanelH.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanelHLayout = new javax.swing.GroupLayout(jPanelH);
        jPanelH.setLayout(jPanelHLayout);
        jPanelHLayout.setHorizontalGroup(
            jPanelHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
        );
        jPanelHLayout.setVerticalGroup(
            jPanelHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 243, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel15)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(principalLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(principalLayout.createSequentialGroup()
                                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(principalLayout.createSequentialGroup()
                                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel26)
                                                .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel32))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanelH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanelIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(65, 65, 65)))
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalLayout.createSequentialGroup()
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(principalLayout.createSequentialGroup()
                                    .addComponent(jLabel40)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(acertoIA))
                                .addGroup(principalLayout.createSequentialGroup()
                                    .addComponent(jLabel41)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(acertoP))
                                .addGroup(principalLayout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(jLabel39)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(principalLayout.createSequentialGroup()
                                    .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(principalLayout.createSequentialGroup()
                                                .addComponent(jLabel36)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel35)))
                                        .addComponent(jLabel37))
                                    .addGap(18, 18, 18)
                                    .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cruzadorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fragataTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(portaavioesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(iniciarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(principalLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(principalLayout.createSequentialGroup()
                                        .addComponent(horizontal2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(vertical2))
                                    .addGroup(principalLayout.createSequentialGroup()
                                        .addComponent(horizontal3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(vertical3))
                                    .addComponent(iniciarBtn1))
                                .addContainerGap(80, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, principalLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(horizontal1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vertical1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(principalLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel38)
                        .addContainerGap())))
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addComponent(jLabel9)))
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel13)))
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(principalLayout.createSequentialGroup()
                                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fragataTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(horizontal1)
                                    .addComponent(vertical1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel37)
                                    .addComponent(horizontal2)
                                    .addComponent(vertical2)
                                    .addComponent(cruzadorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel35)
                                    .addComponent(horizontal3)
                                    .addComponent(vertical3)
                                    .addComponent(portaavioesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel36))
                        .addGap(68, 68, 68)
                        .addComponent(iniciarBtn))
                    .addGroup(principalLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel24)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel26)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel27)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel28)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel33))
                    .addGroup(principalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanelH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel30)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel31)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel32)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel34)
                                .addGap(65, 65, 65))))
                    .addGroup(principalLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iniciarBtn1))
                        .addGap(93, 93, 93)
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(acertoIA)
                            .addComponent(jLabel40))
                        .addGap(18, 18, 18)
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(acertoP))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iniciarBtn1ActionPerformed

    private void horizontal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horizontal2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horizontal2ActionPerformed

    private void horizontal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horizontal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horizontal1ActionPerformed

    private void iniciarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iniciarBtnActionPerformed

    private void fragataTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fragataTxtKeyReleased
        if (evt.getKeyChar() == '\n') {
            String infoUser = fragataTxt.getText().trim(); // Remove espaços em branco
            definirEmbarcacoes(infoUser);
        }
    }//GEN-LAST:event_fragataTxtKeyReleased

    private void cruzadorTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cruzadorTxtKeyReleased
        if (evt.getKeyChar() == '\n') {
            String infoUser = cruzadorTxt.getText().trim(); // Remove espaços em branco
            definirEmbarcacoes(infoUser);
        }
    }//GEN-LAST:event_cruzadorTxtKeyReleased

    private void portaavioesTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_portaavioesTxtKeyReleased
        if (evt.getKeyChar() == '\n') {
            String infoUser = portaavioesTxt.getText().trim(); // Remove espaços em branco
            definirEmbarcacoes(infoUser);
        }
    }//GEN-LAST:event_portaavioesTxtKeyReleased

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }
    
    public void criaPaineis() {
        int larguraPainelPequeno = 45; // 
        int alturaPainelPequeno = 45; // 

        int espacamentoHorizontal = 3; // Sem espaçamento horizontal
        int espacamentoVertical = 3; // Sem espaçamento vertical
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                JPanel painelPequenoIA = new JPanel();
                painelPequenoIA.setBackground(Color.white); // Define a cor de fundo
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
                painelPequenoH.setBackground(Color.white); // Define a cor de fundo
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
    private javax.swing.JLabel acertoIA;
    private javax.swing.JLabel acertoP;
    private javax.swing.JTextField cruzadorTxt;
    private javax.swing.JTextField fragataTxt;
    private javax.swing.JRadioButton horizontal1;
    private javax.swing.JRadioButton horizontal2;
    private javax.swing.JRadioButton horizontal3;
    private javax.swing.JButton iniciarBtn;
    private javax.swing.JButton iniciarBtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelH;
    private javax.swing.JPanel jPanelIA;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField portaavioesTxt;
    private javax.swing.JPanel principal;
    private javax.swing.JRadioButton vertical1;
    private javax.swing.JRadioButton vertical2;
    private javax.swing.JRadioButton vertical3;
    // End of variables declaration//GEN-END:variables
}

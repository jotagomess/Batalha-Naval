package batalhanaval;

import batalhanaval.navios.Navio;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author jota_gomes 
 */
public class Tela extends javax.swing.JFrame {
    JPanel[][] paineisP;
    JPanel[][] paineisIA;
    Partida partida;
    boolean orientacao = false;
    
    public Tela() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.paineisP = new JPanel[5][10];
        this.paineisIA = new JPanel[5][10];
        this.partida = new Partida();
        
        meuInitComponents();
    }
    
    public void meuInitComponents(){
        criaPaineis();
        
        acertoIA.setVisible(false);
        acertoP.setVisible(false);
    }

    public boolean definirEmbarcacoes(String info, Navio navio, boolean orientacao) {
        try {
            int linha;
            int coluna;

            char letra = Character.toUpperCase(info.charAt(0));
            int digito = Integer.parseInt(info.substring(1));

            if (letra >= 'A' && letra <= 'E' && digito >= 1 && digito <= 10) {
                linha = letra - 'A'; // Converte a letra para um valor de linha (A=1, B=2, etc.)
                coluna = digito - 1; // Converte o dígito para um valor de coluna (1, 2, etc.)
                
                System.out.println(linha + " " + coluna);
                this.partida.defineEmbarcacoes(linha, coluna, navio);
                return true;

            } else {
                JOptionPane.showMessageDialog(this, "Formato de entrada inválido", "Erro na entrada", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Valor de entrada inválido (Exemplo: 'A3','B2','C4')",
                    "Erro na entrada", JOptionPane.ERROR_MESSAGE);
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, "O valor informado excede o tabuleiro",
                    "Erro na entrada", JOptionPane.ERROR_MESSAGE);
        }

        return false;
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
        fragataH = new javax.swing.JRadioButton();
        cruzadorH = new javax.swing.JRadioButton();
        portaavioesH = new javax.swing.JRadioButton();
        fragataV = new javax.swing.JRadioButton();
        cruzadorV = new javax.swing.JRadioButton();
        portaavioesV = new javax.swing.JRadioButton();
        jLabel39 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        iniciarBtn1 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        acertoIA = new javax.swing.JLabel();
        acertoP = new javax.swing.JLabel();
        jPanelIA = new javax.swing.JPanel();
        jPanelP = new javax.swing.JPanel();
        resetarBtn = new javax.swing.JButton();

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
        iniciarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciarBtnMouseClicked(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("Posicão inicial:");

        fragataH.setBackground(new java.awt.Color(51, 153, 255));
        fragataH.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        fragataH.setForeground(new java.awt.Color(0, 0, 0));
        fragataH.setText("H");
        fragataH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fragataHActionPerformed(evt);
            }
        });

        cruzadorH.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        cruzadorH.setForeground(new java.awt.Color(0, 0, 0));
        cruzadorH.setText("H");
        cruzadorH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cruzadorHActionPerformed(evt);
            }
        });

        portaavioesH.setBackground(new java.awt.Color(51, 153, 255));
        portaavioesH.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        portaavioesH.setForeground(new java.awt.Color(0, 0, 0));
        portaavioesH.setText("H");
        portaavioesH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portaavioesHActionPerformed(evt);
            }
        });

        fragataV.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        fragataV.setForeground(new java.awt.Color(0, 0, 0));
        fragataV.setText("V");
        fragataV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fragataVActionPerformed(evt);
            }
        });

        cruzadorV.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        cruzadorV.setForeground(new java.awt.Color(0, 0, 0));
        cruzadorV.setText("V");
        cruzadorV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cruzadorVActionPerformed(evt);
            }
        });

        portaavioesV.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        portaavioesV.setForeground(new java.awt.Color(0, 0, 0));
        portaavioesV.setText("V");
        portaavioesV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portaavioesVActionPerformed(evt);
            }
        });

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

        jPanelP.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanelPLayout = new javax.swing.GroupLayout(jPanelP);
        jPanelP.setLayout(jPanelPLayout);
        jPanelPLayout.setHorizontalGroup(
            jPanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
        );
        jPanelPLayout.setVerticalGroup(
            jPanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 243, Short.MAX_VALUE)
        );

        resetarBtn.setBackground(new java.awt.Color(255, 255, 255));
        resetarBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        resetarBtn.setForeground(new java.awt.Color(0, 0, 0));
        resetarBtn.setText("RESETAR");
        resetarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetarBtnMouseClicked(evt);
            }
        });

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
                                        .addGap(0, 12, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanelP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanelIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(65, 65, 65)))
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalLayout.createSequentialGroup()
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(principalLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(portaavioesV)
                                .addContainerGap(115, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, principalLayout.createSequentialGroup()
                                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(iniciarBtn1)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(fragataH, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fragataV))
                                    .addGroup(principalLayout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(cruzadorV)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(principalLayout.createSequentialGroup()
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(principalLayout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(jLabel38))
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
                                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(portaavioesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(fragataTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                        .addComponent(cruzadorTxt)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(portaavioesH)
                                    .addComponent(cruzadorH)))
                            .addGroup(principalLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(resetarBtn)
                                .addGap(26, 26, 26)
                                .addComponent(iniciarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addGap(37, 37, 37)
                        .addComponent(jLabel38)
                        .addGap(18, 18, 18)
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fragataTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36)
                            .addComponent(fragataH)
                            .addComponent(fragataV))
                        .addGap(10, 10, 10)
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(principalLayout.createSequentialGroup()
                                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel37)
                                    .addComponent(cruzadorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel35)
                                    .addComponent(portaavioesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(portaavioesH)
                                    .addComponent(portaavioesV)))
                            .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cruzadorH)
                                .addComponent(cruzadorV)))
                        .addGap(60, 60, 60)
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resetarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iniciarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGap(65, 65, 65))
                    .addGroup(principalLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(acertoIA)
                            .addComponent(jLabel40))
                        .addGap(18, 18, 18)
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(acertoP))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel39)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(iniciarBtn1))
                            .addComponent(jPanelP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))))
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

    private void fragataTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fragataTxtKeyReleased
        if (evt.getKeyChar() == '\n') {
            if (fragataH.isSelected() || fragataV.isSelected()) {
                String infoUser = fragataTxt.getText().trim(); // Remove espaços em branco
                Navio fragata = new Navio("Fragata", 3);
                orientacao = fragataH.isSelected();

                if (definirEmbarcacoes(infoUser, fragata, orientacao)) {
                    fragataTxt.setText(infoUser);
                    fragataTxt.setEnabled(false);
                    fragataH.setEnabled(false);
                    fragataV.setEnabled(false);
                } else {
                    fragataTxt.setText("");
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Selecione uma orientação antes de posicionar a embarcação.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_fragataTxtKeyReleased

    private void cruzadorTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cruzadorTxtKeyReleased
        if (evt.getKeyChar() == '\n') {
            if (cruzadorH.isSelected() || cruzadorV.isSelected()) {
                String infoUser = cruzadorTxt.getText().trim(); // Remove espaços em branco
                Navio fragata = new Navio("Fragata", 3);
                orientacao = cruzadorH.isSelected();

                if (definirEmbarcacoes(infoUser, fragata, orientacao)) {
                    cruzadorTxt.setText(infoUser);
                    cruzadorTxt.setEnabled(false);
                    cruzadorH.setEnabled(false);
                    cruzadorV.setEnabled(false);
                } else {
                    cruzadorTxt.setText("");
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Selecione uma orientação antes de posicionar a embarcação.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_cruzadorTxtKeyReleased

    private void portaavioesTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_portaavioesTxtKeyReleased
        if (evt.getKeyChar() == '\n') {
            if (portaavioesH.isSelected() || portaavioesV.isSelected()) {
                String infoUser = portaavioesTxt.getText().trim(); // Remove espaços em branco
                Navio fragata = new Navio("Fragata", 3);
                orientacao = cruzadorH.isSelected();

                if (definirEmbarcacoes(infoUser, fragata, orientacao)) {
                    portaavioesTxt.setText(infoUser);
                    portaavioesTxt.setEnabled(false);
                    portaavioesH.setEnabled(false);
                    portaavioesV.setEnabled(false);
                } else {
                    portaavioesTxt.setText("");
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Selecione uma orientação antes de posicionar a embarcação.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_portaavioesTxtKeyReleased

    private void iniciarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarBtnMouseClicked
        if (fragataTxt.isEnabled() || cruzadorTxt.isEnabled() || portaavioesTxt.isEnabled()) {
            JOptionPane.showMessageDialog(this, "Você não posicionou todos os navios!",
                    "Erro na entrada", JOptionPane.ERROR_MESSAGE);
        } else {
            iniciarBtn.setVisible(false);
            resetarBtn.setVisible(false);
            acertoIA.setVisible(true);
            acertoP.setVisible(true);
        }
    }//GEN-LAST:event_iniciarBtnMouseClicked

    private void fragataHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fragataHActionPerformed
        fragataV.setSelected(false);
        orientacao = false;
    }//GEN-LAST:event_fragataHActionPerformed

    private void cruzadorHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cruzadorHActionPerformed
        cruzadorV.setSelected(false);
        orientacao = false;
    }//GEN-LAST:event_cruzadorHActionPerformed

    private void portaavioesHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portaavioesHActionPerformed
        portaavioesV.setSelected(false);
        orientacao = false;
    }//GEN-LAST:event_portaavioesHActionPerformed

    private void fragataVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fragataVActionPerformed
        fragataH.setSelected(false);
        orientacao = true;
    }//GEN-LAST:event_fragataVActionPerformed

    private void cruzadorVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cruzadorVActionPerformed
        cruzadorH.setSelected(false);
        orientacao = true;
    }//GEN-LAST:event_cruzadorVActionPerformed

    private void portaavioesVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portaavioesVActionPerformed
        portaavioesH.setSelected(false);
        orientacao = true;
    }//GEN-LAST:event_portaavioesVActionPerformed

    private void resetarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetarBtnMouseClicked
        int opcao = JOptionPane.showConfirmDialog(this, 
                "Tem certeza que deseja redefinir suas opções?", "Aviso", JOptionPane.OK_CANCEL_OPTION, JOptionPane.OK_CANCEL_OPTION);
        if (opcao == JOptionPane.OK_OPTION) {
            fragataTxt.setText(""); cruzadorTxt.setText(""); portaavioesTxt.setText("");
            fragataTxt.setEnabled(true); cruzadorTxt.setEnabled(true); portaavioesTxt.setEnabled(true);
            fragataH.setSelected(false); cruzadorH.setSelected(false); portaavioesH.setSelected(false);
            fragataV.setSelected(false); cruzadorV.setSelected(false); portaavioesV.setSelected(false);
            fragataH.setEnabled(true); cruzadorH.setEnabled(true); portaavioesH.setEnabled(true);
            fragataV.setEnabled(true); cruzadorV.setEnabled(true); portaavioesV.setEnabled(true);
        }
    }//GEN-LAST:event_resetarBtnMouseClicked
     
    public static void main(String args[]) {
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
                
                jPanelP.add(painelPequenoH); // Adiciona ao painel do Player         
                paineisP[i][j] = painelPequenoH; // Adiciona o painel à matriz da Player
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acertoIA;
    private javax.swing.JLabel acertoP;
    private javax.swing.JRadioButton cruzadorH;
    private javax.swing.JTextField cruzadorTxt;
    private javax.swing.JRadioButton cruzadorV;
    private javax.swing.JRadioButton fragataH;
    private javax.swing.JTextField fragataTxt;
    private javax.swing.JRadioButton fragataV;
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
    private javax.swing.JPanel jPanelIA;
    private javax.swing.JPanel jPanelP;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton portaavioesH;
    private javax.swing.JTextField portaavioesTxt;
    private javax.swing.JRadioButton portaavioesV;
    private javax.swing.JPanel principal;
    private javax.swing.JButton resetarBtn;
    // End of variables declaration//GEN-END:variables
}

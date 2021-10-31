package com.mycompany.calcular_resistor;

import java.awt.Color;

public class ViewCalculaResistor extends javax.swing.JFrame {

    private ModelResistor modelResistor;

    public ViewCalculaResistor() {
        initComponents();
        inicializarValores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jpPrincipal = new javax.swing.JPanel();
        jpDados = new javax.swing.JPanel();
        jlPrimeiroAnel = new javax.swing.JLabel();
        jcbPrimeiroAnel = new javax.swing.JComboBox<>();
        jcbSegundoAnel = new javax.swing.JComboBox<>();
        jlSegundoAnel = new javax.swing.JLabel();
        jcbQuartoAnel = new javax.swing.JComboBox<>();
        jlQuartoAnel = new javax.swing.JLabel();
        jcbTerceiroAnel = new javax.swing.JComboBox<>();
        jlTerceiroAnel = new javax.swing.JLabel();
        jpResultado = new javax.swing.JPanel();
        btnCalcular = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        jtfMessagem = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        jtfResultado = new javax.swing.JTextField();
        jlResultado = new javax.swing.JLabel();
        jlMensagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calcular Resistor");
        setAlwaysOnTop(true);
        setName("frameCalcularResistor"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jpPrincipal.setName("pnlCentral"); // NOI18N
        jpPrincipal.setLayout(new java.awt.GridBagLayout());

        jpDados.setToolTipText("");
        jpDados.setName("pnlDadosResistor"); // NOI18N
        jpDados.setLayout(new java.awt.GridBagLayout());

        jlPrimeiroAnel.setText("1º Anel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 13, 0, 0);
        jpDados.add(jlPrimeiroAnel, gridBagConstraints);

        jcbPrimeiroAnel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 13, 13, 0);
        jpDados.add(jcbPrimeiroAnel, gridBagConstraints);

        jcbSegundoAnel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 13, 0);
        jpDados.add(jcbSegundoAnel, gridBagConstraints);

        jlSegundoAnel.setText("2º Anel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 18, 0, 0);
        jpDados.add(jlSegundoAnel, gridBagConstraints);

        jcbQuartoAnel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 13, 13);
        jpDados.add(jcbQuartoAnel, gridBagConstraints);

        jlQuartoAnel.setText("4º Anel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 18, 0, 0);
        jpDados.add(jlQuartoAnel, gridBagConstraints);

        jcbTerceiroAnel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 23, 13, 0);
        jpDados.add(jcbTerceiroAnel, gridBagConstraints);

        jlTerceiroAnel.setText("3º Anel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 23, 0, 0);
        jpDados.add(jlTerceiroAnel, gridBagConstraints);

        jpPrincipal.add(jpDados, new java.awt.GridBagConstraints());

        jpResultado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jpResultado.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 40));

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        jpResultado.add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 40));

        jtfMessagem.setEditable(false);
        jtfMessagem.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jpResultado.add(jtfMessagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 180, 30));

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jpResultado.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 40));

        jtfResultado.setEditable(false);
        jpResultado.add(jtfResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 150, 30));

        jlResultado.setText("Resultado:");
        jpResultado.add(jlResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, -1));

        jlMensagem.setText("Mensagem:");
        jpResultado.add(jlMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, -1, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        jpPrincipal.add(jpResultado, gridBagConstraints);

        getContentPane().add(jpPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        fecharAplicacao();
    }//GEN-LAST:event_formWindowClosing

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        if (jcbPrimeiroAnel.getSelectedIndex() == -1 || jcbSegundoAnel.getSelectedIndex() == -1 || jcbTerceiroAnel.getSelectedIndex() == -1 || jcbQuartoAnel.getSelectedIndex() == -1) {
            jlMensagem.setText("Alerta:");
            jtfMessagem.setText("Selecione os aneis!");
        } else {
            modelResistor.setPrimeiroAnel(getValorCor(jcbPrimeiroAnel.getSelectedItem().toString()));
            modelResistor.setSegundoAnel(getValorCor(jcbSegundoAnel.getSelectedItem().toString()));
            modelResistor.setTerceiroAnel(getValorCor(jcbTerceiroAnel.getSelectedItem().toString()));
            modelResistor.setQuartoAnel(getValorCor(jcbQuartoAnel.getSelectedItem().toString()));
            try {
                Integer primeiroESegundo = Integer.parseInt(modelResistor.getPrimeiroAnel() + "" + modelResistor.getSegundoAnel());
                Double terceiro = modelResistor.getTerceiroAnel();
                double calculo;
                if (modelResistor.getPrimeiroAnel() == 0 || modelResistor.getSegundoAnel() == 0) {
                    calculo = terceiro;
                } else {
                    calculo = (terceiro * primeiroESegundo);
                }
                jtfResultado.setText(calculo + "");
                jlMensagem.setText("Tolerância:");
                jtfMessagem.setText(modelResistor.getQuartoAnel() + "%");
            } catch (NumberFormatException e) {
                System.out.println(String.format("Erro ao calcular o valor do resistor. Erro: %s.", e.getMessage()));
            }
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        // TODO add your handling code here:
        fecharAplicacao();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        jcbPrimeiroAnel.setSelectedIndex(-1);
        jcbSegundoAnel.setSelectedIndex(-1);
        jcbTerceiroAnel.setSelectedIndex(-1);
        jcbQuartoAnel.setSelectedIndex(-1);
        jtfMessagem.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox<String> jcbPrimeiroAnel;
    private javax.swing.JComboBox<String> jcbQuartoAnel;
    private javax.swing.JComboBox<String> jcbSegundoAnel;
    private javax.swing.JComboBox<String> jcbTerceiroAnel;
    private javax.swing.JLabel jlMensagem;
    private javax.swing.JLabel jlPrimeiroAnel;
    private javax.swing.JLabel jlQuartoAnel;
    private javax.swing.JLabel jlResultado;
    private javax.swing.JLabel jlSegundoAnel;
    private javax.swing.JLabel jlTerceiroAnel;
    private javax.swing.JPanel jpDados;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpResultado;
    private javax.swing.JTextField jtfMessagem;
    private javax.swing.JTextField jtfResultado;
    // End of variables declaration//GEN-END:variables

    private void fecharAplicacao() {
        System.out.println("Finalizando a aplicação.");
        this.dispose();
        System.exit(0);
    }

    private void getNomesCores() {
        for (CorEnum c : CorEnum.values()) {
            //Ignorando as cores prata e outro
            if (c.getValor() != -2 && c.getValor() != -1) {
                jcbPrimeiroAnel.addItem(c.name());
                jcbSegundoAnel.addItem(c.name());
            }
            //Ignorando as cores cinza e branco
            if (c.getValor() != 8 && c.getValor() != 9) {
                jcbTerceiroAnel.addItem(c.name());
            }
            //Ignorando as cores preto, verde, azul, violeta, cinza e branco
            if (c.getValor() != 0 && c.getValor() != 5 && c.getValor() != 6 && c.getValor() != 7 && c.getValor() != 8 && c.getValor() != 9) {
                jcbQuartoAnel.addItem(c.name());
            }
        }
    }

    private Integer getValorCor(String cor) {
        return CorEnum.valueOf(cor).getValor();
    }

    private void inicializarValores() {
        //Centralizar o formulário.
        setLocationRelativeTo(null);
        //Inicializando o Model
        modelResistor = new ModelResistor();
        //Limpa ComboBox
        jcbPrimeiroAnel.removeAllItems();
        jcbSegundoAnel.removeAllItems();
        jcbTerceiroAnel.removeAllItems();
        jcbQuartoAnel.removeAllItems();
        //Preenche ComboBox
        getNomesCores();
        //Inicializa ComboBox
        jcbPrimeiroAnel.setSelectedIndex(-1);
        jcbSegundoAnel.setSelectedIndex(-1);
        jcbTerceiroAnel.setSelectedIndex(-1);
        jcbQuartoAnel.setSelectedIndex(-1);

        jtfMessagem.setForeground(Color.RED);
    }
}

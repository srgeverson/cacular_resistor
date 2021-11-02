package calcular_resistor;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalcularResistorView extends JFrame implements ActionListener {

    private ModelResistor modelResistor;

    private JButton jbCalcular;
    private JButton jbFechar;
    private JButton jbLimpar;
    private JComboBox<String> jcbPrimeiroAnel;
    private JComboBox<String> jcbQuartoAnel;
    private JComboBox<String> jcbSegundoAnel;
    private JComboBox<String> jcbTerceiroAnel;
    private JLabel jlPrimeiroAnel;
    private JLabel jlQuartoAnel;
    private JLabel jlResultado;
    private JLabel jlSegundoAnel;
    private JLabel jlTerceiroAnel;
    private JPanel jpDados;
    private JPanel jpResultado;
    private JTextField jtfResultado;

    public CalcularResistorView() {
        this.setTitle("Calcular Resistor");
        this.setSize(450, 250);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(dados(), BorderLayout.CENTER);
        this.getContentPane().add(resultado(), BorderLayout.SOUTH);
        inicializarValores();
    }

    private JPanel dados() {
        jlPrimeiroAnel = new JLabel("1º Anel: ");
        jcbPrimeiroAnel = new JComboBox<>();
        jlSegundoAnel = new JLabel("2º Anel: ");
        jcbSegundoAnel = new JComboBox<>();
        jlTerceiroAnel = new JLabel("3º Anel: ");
        jcbTerceiroAnel = new JComboBox<>();
        jlQuartoAnel = new JLabel("4º Anel: ");
        jcbQuartoAnel = new JComboBox<>();

        jpDados = new JPanel();
        jpDados.setBorder(BorderFactory.createTitledBorder("Dados"));
        jpDados.add(jlPrimeiroAnel);
        jpDados.add(jlSegundoAnel);
        jpDados.add(jlTerceiroAnel);
        jpDados.add(jlQuartoAnel);
        jpDados.add(jcbPrimeiroAnel);
        jpDados.add(jcbSegundoAnel);
        jpDados.add(jcbTerceiroAnel);
        jpDados.add(jcbQuartoAnel);
        jpDados.setLayout(new GridLayout(2, 4));

        return jpDados;
    }

    private JPanel resultado() {
        jbFechar = new JButton("Fechar");
        jbLimpar = new JButton("Limpar");
        jbCalcular = new JButton("Calcular");
        jlResultado = new JLabel("Resultado: ");
        jtfResultado = new JTextField();
        jtfResultado.setEditable(false);

        jpResultado = new JPanel();
        jpResultado.setBorder(BorderFactory.createTitledBorder("Resultado"));
        jpResultado.add(new JLabel(""));
        jpResultado.add(new JLabel(""));
        jpResultado.add(new JLabel(""));
        jpResultado.add(jlResultado);
        jpResultado.add(jbFechar);
        jpResultado.add(jbLimpar);
        jpResultado.add(jbCalcular);
        jpResultado.add(jtfResultado);

        jpResultado.setLayout(new GridLayout(2, 5));

        jbFechar.addActionListener(this);
        jbLimpar.addActionListener(this);
        jbCalcular.addActionListener(this);

        return jpResultado;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == jbFechar) {
                fecharAplicacao();
            } else if (e.getSource() == jbLimpar) {
                limpar();
            } else if (e.getSource() == jbCalcular) {
                calcular();
            }
        } catch (Exception ex) {
            System.out.println(String.format("Erro ao capturar o evento acionado. Erro: %s.", ex.getMessage()));
        }
    }

    private void limpar() {
        jcbPrimeiroAnel.setSelectedIndex(-1);
        jcbSegundoAnel.setSelectedIndex(-1);
        jcbTerceiroAnel.setSelectedIndex(-1);
        jcbQuartoAnel.setSelectedIndex(-1);
        jtfResultado.setText("");
    }

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
    }

    private void calcular() {
        if (jcbPrimeiroAnel.getSelectedIndex() == -1 || jcbSegundoAnel.getSelectedIndex() == -1 || jcbTerceiroAnel.getSelectedIndex() == -1 || jcbQuartoAnel.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma opção de cada anel!", "Atenção", JOptionPane.WARNING_MESSAGE);
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
                JOptionPane.showMessageDialog(null, "Tolerância de " + modelResistor.getQuartoAnel() + "%", "Informativo", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                System.out.println(String.format("Erro ao calcular o valor do resistor. Erro: %s.", e.getMessage()));
            }
        }
    }
}

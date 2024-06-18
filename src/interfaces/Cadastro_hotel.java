/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author adriana.oramalho
 */
public class Cadastro_hotel extends javax.swing.JFrame {

        //carregar
   private void loadTableFromFile() {
    File file = new File("cadastro_hotel.csv");
    if (!file.exists()) {
        return; // Se o arquivo não existir, não faça nada
    }
    try (Scanner scanner = new Scanner(file)) {
        DefaultTableModel model = (DefaultTableModel) tbEstoque.getModel();
        model.setRowCount(0); // Limpa a tabela antes de carregar os dados
        if (scanner.hasNextLine()) {
            scanner.nextLine(); // Ignora a linha de cabeçalho
        }
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] data = line.split(";");
            if (data.length == model.getColumnCount()) {
                model.addRow(data);
            }
        }
    } catch (IOException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro ao carregar tabela: " + e.getMessage());
    }
}


    /**
     * Creates new form Estoque
     */
    public Cadastro_hotel() {
        initComponents();
        loadTableFromFile();
    }
    

    
//Salvar
private void saveTableToFile() {
File file = new File("cadastro_hotel.csv");
try (FileWriter fw = new FileWriter(file)) {
    TableModel model = tbEstoque.getModel();
    for (int i = 0; i < model.getColumnCount(); i++) {
        fw.write(model.getColumnName(i) + ";");
    }
    fw.write("\n");
    for (int i = 0; i < model.getRowCount(); i++) {
        for (int j = 0; j < model.getColumnCount(); j++) {
            fw.write(model.getValueAt(i, j).toString() + ";");
        }
        fw.write("\n");
    }
    fw.flush();
    javax.swing.JOptionPane.showMessageDialog(this, "Tabela salva com sucesso!");
} catch (IOException e) {
    javax.swing.JOptionPane.showMessageDialog(this, "Erro ao salvar tabela: " + e.getMessage());
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
        btExcluir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btInserir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txthospede = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtquarto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtandar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEstoque = new javax.swing.JTable();
        txtestadia = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtfimestadia = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtpreco = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        Cadastro = new javax.swing.JMenu();
        Hospedes = new javax.swing.JMenu();
        Registro = new javax.swing.JMenu();
        Close = new javax.swing.JMenu();
        Salvar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro hotel");
        setBackground(new java.awt.Color(102, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        btExcluir.setBackground(new java.awt.Color(204, 204, 204));
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btAlterar.setBackground(new java.awt.Color(204, 204, 204));
        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btInserir.setBackground(new java.awt.Color(204, 204, 204));
        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hospede:");

        txthospede.setBackground(new java.awt.Color(204, 204, 204));
        txthospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthospedeActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nº do quarto:");

        txtquarto.setBackground(new java.awt.Color(204, 204, 204));
        txtquarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtquartoActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nº do andar:");

        txtandar.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Inicio da Estadia:");

        tbEstoque.setAutoCreateRowSorter(true);
        tbEstoque.setBackground(new java.awt.Color(204, 204, 204));
        tbEstoque.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        tbEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hospede", "Nº do quarto", "Nº do andar", "Inicio da estadia", "Fim da estadia", "Preço Final"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbEstoque.setAutoscrolls(false);
        tbEstoque.setColumnSelectionAllowed(true);
        tbEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbEstoque.setDragEnabled(true);
        tbEstoque.setFillsViewportHeight(true);
        tbEstoque.setFocusable(false);
        tbEstoque.setGridColor(new java.awt.Color(204, 204, 204));
        tbEstoque.setShowGrid(true);
        jScrollPane1.setViewportView(tbEstoque);
        if (tbEstoque.getColumnModel().getColumnCount() > 0) {
            tbEstoque.getColumnModel().getColumn(0).setResizable(false);
            tbEstoque.getColumnModel().getColumn(1).setResizable(false);
            tbEstoque.getColumnModel().getColumn(2).setResizable(false);
            tbEstoque.getColumnModel().getColumn(3).setResizable(false);
            tbEstoque.getColumnModel().getColumn(4).setResizable(false);
            tbEstoque.getColumnModel().getColumn(5).setResizable(false);
            tbEstoque.getColumnModel().getColumn(5).setHeaderValue("Preço Final");
        }

        txtestadia.setBackground(new java.awt.Color(204, 204, 204));
        txtestadia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fim da Estadia:");

        txtfimestadia.setBackground(new java.awt.Color(204, 204, 204));
        txtfimestadia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtfimestadia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfimestadiaActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Dias");

        txtpreco.setBackground(new java.awt.Color(204, 204, 204));
        txtpreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtpreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txthospede, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(txtquarto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtandar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(txtestadia, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfimestadia, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btInserir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btAlterar)
                                .addGap(18, 18, 18)
                                .addComponent(btExcluir)
                                .addGap(687, 687, 687))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 941, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txthospede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtandar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtquarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfimestadia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(txtestadia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInserir)
                    .addComponent(btAlterar)
                    .addComponent(btExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Cadastro.setText("Cadastro hotel");
        jMenuBar1.add(Cadastro);

        Hospedes.setText("Hospedes");
        Hospedes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HospedesMouseClicked(evt);
            }
        });
        jMenuBar1.add(Hospedes);

        Registro.setText("Relatórios");
        Registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistroMouseClicked(evt);
            }
        });
        jMenuBar1.add(Registro);

        Close.setText("Close");
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });
        jMenuBar1.add(Close);

        Salvar.setText("Salvar");
        Salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalvarMouseClicked(evt);
            }
        });
        jMenuBar1.add(Salvar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txthospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthospedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthospedeActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        // TODO add your handling code here:
        DefaultTableModel Produtos = (DefaultTableModel) tbEstoque.getModel();
        double fatorMultiplicador = 250; // Substitua 2.0 pelo valor pelo qual você deseja multiplicar
Object[] dados = {
    txthospede.getText(),
    txtquarto.getText(),
    txtandar.getText(),
    txtestadia.getText(),
    txtfimestadia.getText(),
    String.valueOf(Double.parseDouble(txtpreco.getText()) * fatorMultiplicador)
};

        Produtos.addRow(dados);
        txthospede.setText("");
        txtquarto.setText("");
        txtandar.setText("");
        txtestadia.setText("");
        txtfimestadia.setText("");
        txtpreco.setText("");
    }//GEN-LAST:event_btInserirActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        // TODO add your handling code here:
        double fatorMultiplicador = 250; // Substitua 2.0 pelo valor pelo qual você deseja multiplicar
        if(tbEstoque.getSelectedRow() != -1){
           tbEstoque.setValueAt(txthospede.getText(), tbEstoque.getSelectedRow(), 0);
           tbEstoque.setValueAt(txtquarto.getText(), tbEstoque.getSelectedRow(), 1);
           tbEstoque.setValueAt(txtandar.getText(), tbEstoque.getSelectedRow(), 2);
           tbEstoque.setValueAt(txtestadia.getText(), tbEstoque.getSelectedRow(), 3);
           tbEstoque.setValueAt(txtfimestadia.getText(), tbEstoque.getSelectedRow(), 4);
           tbEstoque.setValueAt( String.valueOf(Double.parseDouble(txtpreco.getText()) * fatorMultiplicador), tbEstoque.getSelectedRow(), 5);
           txthospede.setText("");
            txtquarto.setText("");
            txtandar.setText("");
            txtestadia.setText("");
            txtfimestadia.setText("");
            txtpreco.setText("");
                               
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
        if(tbEstoque.getSelectedRow() != -1){
            DefaultTableModel Produto = (DefaultTableModel) tbEstoque.getModel();
            Produto.removeRow(tbEstoque.getSelectedRow());
            
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void txtquartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtquartoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtquartoActionPerformed

    private void txtfimestadiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfimestadiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfimestadiaActionPerformed

    private void txtprecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecoActionPerformed

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_CloseMouseClicked

    private void SalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalvarMouseClicked
        // TODO add your handling code here:
        saveTableToFile();  
    }//GEN-LAST:event_SalvarMouseClicked

    private void HospedesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HospedesMouseClicked
        // TODO add your handling code here:
         Visualização_de_Informações_dos_Hóspedes f = new Visualização_de_Informações_dos_Hóspedes();
            this.dispose();
            f.setVisible(true); 
    }//GEN-LAST:event_HospedesMouseClicked

    private void RegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroMouseClicked
        // TODO add your handling code here:
        Registro_de_Atividades_Relatórios f = new Registro_de_Atividades_Relatórios();
            this.dispose();
            f.setVisible(true); 
    }//GEN-LAST:event_RegistroMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastro_hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_hotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cadastro;
    private javax.swing.JMenu Close;
    private javax.swing.JMenu Hospedes;
    private javax.swing.JMenu Registro;
    private javax.swing.JMenu Salvar;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbEstoque;
    private javax.swing.JTextField txtandar;
    private javax.swing.JFormattedTextField txtestadia;
    private javax.swing.JFormattedTextField txtfimestadia;
    private javax.swing.JTextField txthospede;
    private javax.swing.JFormattedTextField txtpreco;
    private javax.swing.JTextField txtquarto;
    // End of variables declaration//GEN-END:variables
}

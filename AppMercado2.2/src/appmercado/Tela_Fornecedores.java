/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmercado;

import static appmercado.Conexao.con;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author c02maq1
 */
public class Tela_Fornecedores extends javax.swing.JFrame {
String id;
    /**
     * Creates new form Tela_Fornecedores
     */
    public Tela_Fornecedores() {
        initComponents();
        Conexao.Conectar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        tfcidade = new javax.swing.JTextField();
        tfendereço = new javax.swing.JTextField();
        tfcnpj = new javax.swing.JTextField();
        tfemail = new javax.swing.JTextField();
        tfnome1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        tfbairro = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        tfie = new javax.swing.JTextField();
        tfuf = new javax.swing.JFormattedTextField();
        tftelefone = new javax.swing.JFormattedTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton2 = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        gravar = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(364, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("jLabel1");

        jLabel4.setText("jLabel2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fornecedores");
        setResizable(false);

        jPanel7.setBackground(new java.awt.Color(255, 102, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(54, 260));

        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel15.setText("Nome");

        jLabel16.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel16.setText("CNPJ");

        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel17.setText("E-mail");

        jLabel18.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel18.setText("Telefone");

        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel19.setText("Endereço");

        jLabel20.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel20.setText("UF");

        jLabel21.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel21.setText("Cidade");

        tfcidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tfendereço.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tfcnpj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tfemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tfnome1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel22.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel22.setText("Bairro");

        tfbairro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel24.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel24.setText("ie");

        tfie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tfuf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            tfuf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UU")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tftelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            tftelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jToggleButton1.setBackground(new java.awt.Color(255, 153, 153));
        jToggleButton1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jToggleButton1.setText("Limpar");
        jToggleButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102), 5));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfnome1)
                            .addComponent(tfcnpj)
                            .addComponent(tfemail)
                            .addComponent(tfendereço)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel18))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tftelefone)
                                    .addComponent(tfuf))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(22, 22, 22)
                                .addComponent(tfcidade)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel24)
                                .addGap(31, 31, 31)))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfie)
                            .addComponent(tfbairro, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tfnome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tfcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(tfemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(tfendereço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(tfie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(tfcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22)
                    .addComponent(tfbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfuf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tftelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jButton2.setText("Cadastrar");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        alterar.setBackground(new java.awt.Color(255, 255, 255));
        alterar.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        alterar.setText("Alterar");
        alterar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        alterar.setEnabled(false);
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jButton4.setText("Pesquisar");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jButton5.setText("Excluir");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        gravar.setBackground(new java.awt.Color(255, 255, 255));
        gravar.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        gravar.setText("Gravar");
        gravar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        gravar.setEnabled(false);
        gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gravar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(gravar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravarActionPerformed
        // TODO add your handling code here:
        
        String sql;
        String nome, cnpj, endereco, bairro, cidade, uf, cep, telefone, email, ie;
        nome = tfnome1.getText();
        cnpj = tfcnpj.getText();
        endereco = tfendereço.getText();
        bairro = tfbairro.getText();
        cidade = tfcidade.getText();
        uf = tfuf.getText();
        telefone = tftelefone.getText();
        email = tfemail.getText();
        ie = tfie.getText();
       
        try{
           sql="update fornecedor ( nome, cnpj, endereco, bairro, cidade, uf, ie,"
                + "telefone, email, rg) values ( '"  + nome + "','" + cnpj + "','"
                + endereco + "','" + bairro + "','" + cidade
                + "','" + uf + "','" + ie +"','" + telefone + "','"+ email + "')";

            System.out.println(sql);
                   
            tfnome1.setText("");
            tfcnpj.setText("");
            tfendereço.setText("");
            tfcidade.setText("");
            tfemail.setText("");
            tfbairro.setText("");
            tfuf.setText("");
            tftelefone.setText("");
            tfie.setText("");
            
            tfnome1.requestFocus();
            gravar.setEnabled(false);
           
     }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Erro ao incluir, tente novamente" + e,"ERRO",JOptionPane.INFORMATION_MESSAGE);}
       
        
        
    }//GEN-LAST:event_gravarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        
        String sql;
        
        try{
        sql = "select * from fornecedor where nome = '" + tfnome1.getText() + "'"; //cria a instrução de pesquisa
        //a partir do nome digitado no campo tfNome
        
        Statement stm = con.createStatement(); //cria uma declaracao stm para a variavel con de conexao

        ResultSet rs = stm.executeQuery(sql); // cria uma variavel rs como resultset (resultado) da execucao da consulta sql
        rs.first();  //move o ponteiro do BD para o primeiro registro
        String[] linha;
            linha = new String[]{
                rs.getString("nome"),
                rs.getString("cnpj"),
                rs.getString("email"),
                rs.getString("endereco"),
                rs.getString("uf"),
                rs.getString("cidade"),
                rs.getString("bairro"),
                rs.getString("telefone"),
                rs.getString("ie")};
        
            tfcnpj.setText(rs.getString("cnpj")); //coloca o conteudo do campo codigo no tdCodigo
            tfemail.setText(rs.getString("email"));
            tfendereço.setText(rs.getString("endereco"));
            tfuf.setText(rs.getString("uf"));
            tfcidade.setText(rs.getString("cidade"));
            tfbairro.setText(rs.getString("bairro"));
            tftelefone.setText(rs.getString("telefone"));
            tfie.setText(rs.getString("ie"));
            id = rs.getString("id");

        
 
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao consultar, tente novamente"
                    ,"ERRO",JOptionPane.INFORMATION_MESSAGE);
            //mostra caixa de mensagem de erro com icone de informacao
        }

        jButton5.setEnabled(true); 
        alterar.setEnabled(true);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
           String sql;
        String cnpj, nome, endereco, telefone, email, cidade, uf, bairro, ie;
        cnpj = tfcnpj.getText();
        endereco = tfendereço.getText();
        telefone = tftelefone.getText();
        bairro = tfbairro.getText();
        email = tfemail.getText();
        nome = tfnome1.getText();
        cidade = tfcidade.getText();
        uf = tfuf.getText();
        ie = tfie.getText();
        
        
        try{
            sql="insert into fornecedor ( nome, endereco, telefone, cnpj, ie, cidade, bairro, uf,"
                + " email) values ('"  + nome + "','" + endereco + "','" + telefone
                + "','" + cnpj + "','" + ie + "','" + cidade + "','" + bairro 
                + "','" + uf + "','" + email + "')";
        
        
           
        
            Statement stm = con.prepareStatement(sql);
            stm.execute(sql);
            tfnome1.setText("");
            tfcnpj.setText("");
            tfie.setText("");
            tfendereço.setText("");
            tfcidade.setText("");
            tfemail.setText("");
            tfbairro.setText("");
            tfuf.setText("");
            tftelefone.setText("");
            
            tfnome1.requestFocus();
            
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Erro ao incluir, tente novamente" + e,"ERRO",JOptionPane.INFORMATION_MESSAGE);}
            
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:

        tfnome1.setText("");
            tfcnpj.setText("");
            tfie.setText("");
            tfendereço.setText("");
            tfcidade.setText("");
            tfemail.setText("");
            tfbairro.setText("");
            tfuf.setText("");
            tftelefone.setText("");
            
            tfnome1.requestFocus();
jButton5.setEnabled(false);
gravar.setEnabled(false);
alterar.setEnabled(false);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Confirma exclusão", "Excluindo...", JOptionPane.YES_NO_OPTION);
        String sql, nome;
        nome=tfnome1.getText();
       
        if (opcao==0){
        try{
            sql="delete from fornecedor where nome = '" + nome + "'";
       
            Statement stm = con.prepareStatement(sql);
            stm.execute(sql);
        }
        catch(Exception e){
           
            JOptionPane.showMessageDialog(null, "Erro ao excluir, tente novamente" + e,"ERRO",JOptionPane.INFORMATION_MESSAGE);
           
        }}
        
        tfnome1.setText("");
            tfcnpj.setText("");
            tfie.setText("");
            tfendereço.setText("");
            tfcidade.setText("");
            tfemail.setText("");
            tfbairro.setText("");
            tfuf.setText("");
            tftelefone.setText("");
            
            tfnome1.requestFocus();
            alterar.setEnabled(false);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        // TODO add your handling code here:
        gravar.setEnabled(true);
        alterar.setEnabled(false);
        jButton5.setEnabled(false);
    }//GEN-LAST:event_alterarActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Fornecedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar;
    private javax.swing.JButton gravar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField tfbairro;
    private javax.swing.JTextField tfcidade;
    private javax.swing.JTextField tfcnpj;
    private javax.swing.JTextField tfemail;
    private javax.swing.JTextField tfendereço;
    private javax.swing.JTextField tfie;
    private javax.swing.JTextField tfnome1;
    private javax.swing.JFormattedTextField tftelefone;
    private javax.swing.JFormattedTextField tfuf;
    // End of variables declaration//GEN-END:variables
}

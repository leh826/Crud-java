package view;

import DAO.UsuarioDAO;
import DTO.UEPA_dadosDTO;
import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Leticia
 */
public class UEPA_TelaDados extends javax.swing.JFrame {

    /**
     * Creates new form UEPA_TelaDados
     */
    public UEPA_TelaDados() {
        initComponents();
        //restaurarDadosCmb();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jbl_CPF = new javax.swing.JLabel();
        jbl_Telefone = new javax.swing.JLabel();
        jbl_Curso = new javax.swing.JLabel();
        jbl_Turma = new javax.swing.JLabel();
        Text_Nome = new javax.swing.JTextField();
        jbl_Nome = new javax.swing.JLabel();
        Text_Curso = new javax.swing.JTextField();
        jbl_Endereco = new javax.swing.JLabel();
        Text_Endereco = new javax.swing.JTextField();
        jbl_Matricula = new javax.swing.JLabel();
        Btn_confirmar = new javax.swing.JButton();
        Btn_listadealunos = new javax.swing.JButton();
        Text_Telefone = new javax.swing.JFormattedTextField();
        Text_Turma = new javax.swing.JFormattedTextField();
        Text_CPF = new javax.swing.JFormattedTextField();
        Text_Matricula = new javax.swing.JFormattedTextField();
        btnLimpar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jbl_CPF.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jbl_CPF.setForeground(new java.awt.Color(0, 0, 0));
        jbl_CPF.setText("CPF :");
        jPanel2.add(jbl_CPF);
        jbl_CPF.setBounds(50, 110, 50, 30);

        jbl_Telefone.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jbl_Telefone.setForeground(new java.awt.Color(0, 0, 0));
        jbl_Telefone.setText("Telefone :");
        jPanel2.add(jbl_Telefone);
        jbl_Telefone.setBounds(50, 210, 80, 30);

        jbl_Curso.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jbl_Curso.setForeground(new java.awt.Color(0, 0, 0));
        jbl_Curso.setText("Curso :");
        jPanel2.add(jbl_Curso);
        jbl_Curso.setBounds(50, 160, 50, 30);

        jbl_Turma.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jbl_Turma.setForeground(new java.awt.Color(0, 0, 0));
        jbl_Turma.setText("Turma :");
        jPanel2.add(jbl_Turma);
        jbl_Turma.setBounds(50, 270, 60, 30);

        Text_Nome.setBackground(new java.awt.Color(204, 204, 204));
        Text_Nome.setForeground(new java.awt.Color(51, 51, 51));
        Text_Nome.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Text_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_NomeActionPerformed(evt);
            }
        });
        jPanel2.add(Text_Nome);
        Text_Nome.setBounds(130, 60, 340, 30);

        jbl_Nome.setBackground(new java.awt.Color(153, 153, 153));
        jbl_Nome.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 18)); // NOI18N
        jbl_Nome.setForeground(new java.awt.Color(0, 0, 0));
        jbl_Nome.setText("Nome:");
        jbl_Nome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jbl_Nome);
        jbl_Nome.setBounds(50, 60, 50, 30);

        Text_Curso.setBackground(new java.awt.Color(204, 204, 204));
        Text_Curso.setForeground(new java.awt.Color(51, 51, 51));
        Text_Curso.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Text_Curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_CursoActionPerformed(evt);
            }
        });
        jPanel2.add(Text_Curso);
        Text_Curso.setBounds(130, 160, 340, 30);

        jbl_Endereco.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jbl_Endereco.setForeground(new java.awt.Color(0, 0, 0));
        jbl_Endereco.setText("Endereço :");
        jPanel2.add(jbl_Endereco);
        jbl_Endereco.setBounds(50, 330, 80, 30);

        Text_Endereco.setBackground(new java.awt.Color(204, 204, 204));
        Text_Endereco.setForeground(new java.awt.Color(51, 51, 51));
        Text_Endereco.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Text_Endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_EnderecoActionPerformed(evt);
            }
        });
        jPanel2.add(Text_Endereco);
        Text_Endereco.setBounds(131, 330, 330, 30);

        jbl_Matricula.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jbl_Matricula.setForeground(new java.awt.Color(0, 0, 0));
        jbl_Matricula.setText("Matrícula :");
        jPanel2.add(jbl_Matricula);
        jbl_Matricula.setBounds(50, 380, 80, 30);

        Btn_confirmar.setBackground(new java.awt.Color(0, 102, 0));
        Btn_confirmar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Btn_confirmar.setForeground(new java.awt.Color(0, 0, 0));
        Btn_confirmar.setText("Confirmar");
        Btn_confirmar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btn_confirmar.setBorderPainted(isResizable());
        Btn_confirmar.setMargin(new java.awt.Insets(3, 14, 3, 14));
        Btn_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_confirmarActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_confirmar);
        Btn_confirmar.setBounds(70, 470, 240, 40);

        Btn_listadealunos.setBackground(new java.awt.Color(61, 58, 176));
        Btn_listadealunos.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        Btn_listadealunos.setForeground(new java.awt.Color(255, 255, 255));
        Btn_listadealunos.setText("Visualizar lista de alunos");
        Btn_listadealunos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Btn_listadealunos.setBorderPainted(isResizable());
        Btn_listadealunos.setMargin(new java.awt.Insets(3, 14, 3, 14));
        Btn_listadealunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_listadealunosActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_listadealunos);
        Btn_listadealunos.setBounds(60, 590, 410, 50);

        Text_Telefone.setBackground(new java.awt.Color(204, 204, 204));
        Text_Telefone.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Text_Telefone.setForeground(new java.awt.Color(0, 0, 0));
        try {
            Text_Telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(Text_Telefone);
        Text_Telefone.setBounds(130, 210, 150, 30);

        Text_Turma.setBackground(new java.awt.Color(204, 204, 204));
        Text_Turma.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Text_Turma.setForeground(new java.awt.Color(0, 0, 0));
        try {
            Text_Turma.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(Text_Turma);
        Text_Turma.setBounds(130, 270, 150, 30);

        Text_CPF.setBackground(new java.awt.Color(204, 204, 204));
        Text_CPF.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Text_CPF.setForeground(new java.awt.Color(0, 0, 0));
        try {
            Text_CPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(Text_CPF);
        Text_CPF.setBounds(130, 110, 340, 30);

        Text_Matricula.setBackground(new java.awt.Color(204, 204, 204));
        Text_Matricula.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Text_Matricula.setForeground(new java.awt.Color(0, 0, 0));
        try {
            Text_Matricula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(Text_Matricula);
        Text_Matricula.setBounds(130, 380, 150, 30);

        btnLimpar.setBackground(new java.awt.Color(51, 51, 51));
        btnLimpar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpar);
        btnLimpar.setBounds(330, 470, 120, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundo.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(-360, 0, 930, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Text_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_NomeActionPerformed

    private void Text_CursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_CursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_CursoActionPerformed

    private void Text_EnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_EnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_EnderecoActionPerformed

    private void Btn_listadealunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_listadealunosActionPerformed
        UEPA_TelaAlunos tela3 = new UEPA_TelaAlunos();
        tela3.setVisible(true);
        dispose();
    }//GEN-LAST:event_Btn_listadealunosActionPerformed

    private void Btn_confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_confirmarActionPerformed

        if ((Text_Nome.getText().length()>0)
                &&(Text_CPF.getText().length()> 0)
                && (Text_Curso.getText().length() > 0)
                && (Text_Telefone.getText().length() > 0)
                && (Text_Turma.getText().length() > 0)
                && (Text_Endereco.getText().length() > 0)
                && (Text_Matricula.getText().length() > 0)){  
                cadastrarUsuario();
           JOptionPane.showMessageDialog(this, "Cadastrado com sucesso!");
       }
       else{
           JOptionPane.showMessageDialog(this, "Campo vazio!");
       }
    }//GEN-LAST:event_Btn_confirmarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
       limparUsuario();
    }//GEN-LAST:event_btnLimparActionPerformed

    public static void main(String args[]) {

        new UEPA_TelaDados().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_confirmar;
    private javax.swing.JButton Btn_listadealunos;
    private javax.swing.JFormattedTextField Text_CPF;
    private javax.swing.JTextField Text_Curso;
    private javax.swing.JTextField Text_Endereco;
    private javax.swing.JFormattedTextField Text_Matricula;
    private javax.swing.JTextField Text_Nome;
    private javax.swing.JFormattedTextField Text_Telefone;
    private javax.swing.JFormattedTextField Text_Turma;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jbl_CPF;
    private javax.swing.JLabel jbl_Curso;
    private javax.swing.JLabel jbl_Endereco;
    private javax.swing.JLabel jbl_Matricula;
    private javax.swing.JLabel jbl_Nome;
    private javax.swing.JLabel jbl_Telefone;
    private javax.swing.JLabel jbl_Turma;
    // End of variables declaration//GEN-END:variables
    //metodo que realiza conexão com DTO e DAO para cadastrar dados inseridos no campo
    public void cadastrarUsuario(){
        String nome, cpf, curso, turma, endereco, telefone, matricula; //criei variáveis para guardar o texto inseridos nos campos
        nome = Text_Nome.getText(); //pega texto do JTextField
        cpf = Text_Turma.getText();
        curso = Text_Curso.getText();
        turma = Text_Turma.getText();
        endereco = Text_Endereco.getText();
        telefone = Text_Telefone.getText();
        matricula = Text_Turma.getText();
        
        //Enviando para DTO
        UEPA_dadosDTO objUsuariodto = new UEPA_dadosDTO();
        objUsuariodto.setNome(nome);        
        objUsuariodto.setCpf(cpf);
        objUsuariodto.setCurso(curso);
        objUsuariodto.setTelefone(telefone);
        objUsuariodto.setTurma(turma);
        objUsuariodto.setEndereco(endereco);
        objUsuariodto.setMatricula(matricula);
        
        //conectandoDTO com o metodo cadastrar da DAO
        UsuarioDAO objUsuariodao = new UsuarioDAO();
        objUsuariodao.cadastrarAluno(objUsuariodto);
    }
    //limpar campos
        public void limparUsuario() {

        Text_Nome.setText("");
        Text_CPF.setText("");
        Text_Curso.setText("");
        Text_Telefone.setText("");
        Text_Turma.setText("");
        Text_Endereco.setText("");
        Text_Matricula.setText("");
    }
    /*public void restaurarDadosCmb(){
        try {
            UsuarioDAO objUsuariodao = new UsuarioDAO();
            ResultSet rs = objUsuariodao.listarSemestre();
            
            while(rs.next()){
                Cbm_Semestres.addItem(rs.getString(1));
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Carregar combobox" + erro);
        }
    }*/

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.tocai.view;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import br.inatel.tocai.model.Musica;
import br.inatel.tocai.controller.MusicaDAO;

/**
 * Classe para o usuario visualizar as musicas
 * @author Jhennifer
 */
public class VerMusica extends javax.swing.JFrame {

    /**
     * Creates new form VerMusica
     */
    public VerMusica() {
        initComponents();
        // lendo a tabela de musicas
        DefaultTableModel modelo = (DefaultTableModel) this.jTableMusicas.getModel();
        this.jTableMusicas.setRowSorter(new TableRowSorter(modelo));
        readJTable();
    }

     public JTable getjTableMusicas() {
        return jTableMusicas;
    }
    
    /**
     * M�todo para ler e salvar as informações das musicas na tabela
     */
    public void readJTable(){
        DefaultTableModel modelo = (DefaultTableModel) this.jTableMusicas.getModel();
        MusicaDAO musicaDAO = new MusicaDAO();
        for(Musica m: musicaDAO.buscarMusicaSemFiltro()){
            modelo.addRow(new Object[]{
                m.getNome(),
                m.getArtista(),
                m.getGenero(),
                m.getAlbum(),
                m.getDuracao()
            });           
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

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMusicas = new javax.swing.JTable();

        jCheckBox1.setText("jCheckBox1");

        setResizable(false);

        jLabel2.setIcon(new javax.swing.ImageIcon("src\\main\\resources\\images\\logo_size_lado-removebg-preview.png")); // NOI18N

        jTableMusicas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Artista", "Genero", "Album", "Duracao"
            }
        ));
        jScrollPane1.setViewportView(jTableMusicas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMusicas;
    // End of variables declaration//GEN-END:variables
}
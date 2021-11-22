package com.atp.atp53.view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.atp.atp53.dao.CategoriaDao;
import com.atp.atp53.model.Categoria;

public class CategoriaDesktopView extends JFrame{
	private CategoriaDao dao;
    private Container container;
    private JLabel lbNome,lbDescricao;
    private JTextField txtNome,txtDescricao;
    private JButton btnSalvar, btnDelete, btnUpdate;
    private JTable table;
    private DefaultTableModel tableModel;

    public CategoriaDesktopView() {
        super("Categorias");
        setLayout(null);

        inicializaComponentes();
        posicionamento();

        adicionaEventos();

        ler();
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }


    private void inicializaComponentes(){
    	dao = new CategoriaDao();
        container = getContentPane();
        lbNome =  new JLabel("Nome:");
        txtNome = new JTextField();
        lbDescricao =  new JLabel("Descrição:");
        txtDescricao = new JTextField();
        btnSalvar = new JButton("Salvar");
        btnDelete = new JButton("Deletar");
        btnUpdate = new JButton("Alterar");
        table = new JTable();
        tableModel = (DefaultTableModel)table.getModel();
        tableModel.addColumn("Id");
        tableModel.addColumn("Nome");
        tableModel.addColumn("Descrição");
    }


    private void posicionamento() {
        lbNome.setBounds(10, 10, 50, 20);
        txtNome.setBounds(70, 10, 250, 20); 
        lbDescricao.setBounds(360, 10, 80, 20);
        txtDescricao.setBounds(440, 10, 250, 20);
        btnSalvar.setBounds(10, 40, 100, 20);
        table.setBounds(10, 80, 700, 300);
        btnDelete.setBounds(10, 400, 100, 20);
        btnUpdate.setBounds(115, 400, 100, 20);

        container.add(lbNome);
        container.add(txtNome);
        container.add(lbDescricao);
        container.add(txtDescricao);
        container.add(btnSalvar);
        container.add(table);
        container.add(btnDelete);
        container.add(btnUpdate);
    }

    private void adicionaEventos() {
        btnSalvar.addActionListener( new ActionListener(){            
            @Override
            public void actionPerformed(ActionEvent e) {               
               Categoria model = new Categoria();
               model.setNome(txtNome.getText());
               model.setDescricao(txtDescricao.getText());
               salvar(model);               
            }
        });

        btnDelete.addActionListener( new ActionListener(){            
            @Override
            public void actionPerformed(ActionEvent e) {               
               int id = (int)table.getValueAt(table.getSelectedRow(), 0);
               Categoria model = new Categoria();
               model.setId(id);
               delete(model);               
            }
        });

        btnUpdate.addActionListener( new ActionListener(){            
            @Override
            public void actionPerformed(ActionEvent e) {               
               int id = (int)table.getValueAt(table.getSelectedRow(), 0);
               String nome = (String)table.getValueAt(table.getSelectedRow(), 1);
               String descricao = (String)table.getValueAt(table.getSelectedRow(), 2);
               Categoria model = new Categoria();
               model.setId(id);
               model.setNome(nome);
               model.setDescricao(descricao);
               alterar(model);       
            }

        });
    }


    // ==================== Metodos de CRUD ===================================
    private void salvar(Categoria model){
        dao.create(model);
        JOptionPane.showMessageDialog(container, "Categoria:"+model.getNome()+ " Salva com sucesso!" ); 
        ler();
    }

    private void ler(){
        tableModel.setRowCount(0);
        for (Categoria c : dao.read()) {
            tableModel.addRow(new Object[]{c.getId(), c.getNome(),c.getDescricao()});
        }
    }
    private void delete(Categoria model){
        dao.delete(model.getId());
        JOptionPane.showMessageDialog(container, "Categoria de id: "+model.getId() +" Deletada com sucesso!" );        
        ler();
    }
    private void alterar(Categoria model) {
        dao.update(model);
        JOptionPane.showMessageDialog(container, "Categoria de id: "+model.getId() +" Alterada com sucesso!" );        
        ler();
    }
}
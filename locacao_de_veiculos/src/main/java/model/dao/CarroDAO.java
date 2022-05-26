/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import connection.FabricaDeConexoes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.veiculo.Carro;

/**
 *
 * @author Znoque
 */
public class CarroDAO {
    private Connection con = null;
    
    public CarroDAO(){
        con = FabricaDeConexoes.conectar();
    }
    
    public boolean adicionar(Carro carro){
        String sql = "INSERT INTO carros (nome, fabricante, modelo, cor, placa, chassi, ano_fabricacao, alugado, valor_aluguel, qtd_portas, qtd_assentos) values (?,?,?,?,?,?,?,?,?,?,?)";    
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, carro.getNome());
            stmt.setString(2, carro.getFabricante());
            stmt.setString(3, carro.getModelo());
            stmt.setString(4, carro.getCor());
            stmt.setString(5, carro.getPlaca());
            stmt.setString(6, carro.getChassi());
            stmt.setInt(7, carro.getAnoDeFabricacao());
            stmt.setString(8, carro.getAlugado());
            stmt.setDouble(9, carro.getValorAluguel());
            stmt.setInt(10, carro.getQtd_portas());
            stmt.setInt(11, carro.getQtd_assento());
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: "+ex);             
            return false;
        }finally{
            FabricaDeConexoes.desconectar(con, stmt);
        }
    }
}

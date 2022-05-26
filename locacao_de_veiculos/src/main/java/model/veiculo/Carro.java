/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.veiculo;

/**
 *
 * @author Znoque
 */
public class Carro extends Veiculo {
   private byte qtd_portas;
    private byte qtd_assentos;
    
    public Carro(){
        
    }
    
    //MÉTODO CONSTRUTOR DE VEICULO
    public Carro(String nome, String fabricante, String modelo, String cor, String placa, String chassi, int anoDeFabricacao, double valorAluguel, byte qtd_portas, byte qtd_assentos) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.chassi = chassi;
        this.anoDeFabricacao = anoDeFabricacao;
        this.alugado = false;
        this.valorAluguel = valorAluguel;
        this.qtd_portas = qtd_portas;
        this.qtd_assentos = qtd_assentos;
    }
    
    //MÉTODO QUE RETORNA A DESCRIÇÃO DO VEICULO
    public String descricaoVeiculo() {
        if(alugado){
            return "CARRO: {Nome: " + nome + ", Fabricante: " + fabricante + ", Modelo:" + modelo + ", Cor: " + cor + ", Placa: " + placa + ", Chassi: " + chassi + ", Ano de Fabricação: " + anoDeFabricacao + ", Quantidade de Portas: " + qtd_portas + "Quantidade de Assentos: " + qtd_assentos + ", Alugado: Sim, valor do Aluguel: " + valorAluguel + '}';
        }else{
            return "CARRO: {Nome: " + nome + ", Fabricante: " + fabricante + ", Modelo:" + modelo + ", Cor: " + cor + ", Placa: " + placa + ", Chassi: " + chassi + ", Ano de Fabricação: " + anoDeFabricacao + ", Quantidade de Portas: " + qtd_portas + "Quantidade de Assentos: " + qtd_assentos + ", Alugado: Não}";
        }     
    }

    public byte getQtd_portas() {
        return qtd_portas;
    }

    public void setQtd_portas(byte qtd_portas) {
        this.qtd_portas = qtd_portas;
    }

    public byte getQtd_assento() {
        return qtd_assentos;
    }

    public void setQtd_lugares(byte qtd_assentos) {
        this.qtd_assentos = qtd_assentos;
    }
    
}
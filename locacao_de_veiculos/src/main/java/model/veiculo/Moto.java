/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.veiculo;

/**
 *
 * @author Znoque
 */
public class Moto extends Veiculo{
    private String cilindrada;

    public Moto(){
        
    }
    
    //MÉTODO CONSTRUTOR DE VEICULO
    public Moto(String nome, String fabricante, String modelo, String cor, String placa, String chassi, int anoDeFabricacao, double valorAluguel, String cilindrada) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.chassi = chassi;
        this.anoDeFabricacao = anoDeFabricacao;
        this.alugado = false;
        this.valorAluguel = valorAluguel;
        this.cilindrada = cilindrada;
    }
    
    //MÉTODO QUE RETORNA A DESCRIÇÃO DO VEICULO
    public String descricaoVeiculo() {
        if(alugado){
            return "MOTO: {Nome: " + nome + ", Fabricante: " + fabricante + ", Modelo:" + modelo + ", Cor: " + cor + ", Placa: " + placa + ", Chassi: " + chassi + ", Ano de Fabricação: " + anoDeFabricacao + ", Cilindrada: " + cilindrada + ", Alugado: Sim, valor do Aluguel: " + valorAluguel + '}';
        }else{
            return "MOTO: {Nome: " + nome + ", Fabricante: " + fabricante + ", Modelo:" + modelo + ", Cor: " + cor + ", Placa: " + placa + ", Chassi: " + chassi + ", Ano de Fabricação: " + anoDeFabricacao + ", Cilindrada: " + cilindrada + ", Alugado: Não}";
        }     
    }
    
    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }
    
}
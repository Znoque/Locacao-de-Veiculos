/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.veiculo;

/**
 *
 * @author Znoque
 */
public abstract class Veiculo {
    protected String nome;            //VARIAVEL NOME DO TIPO TEXTO
    protected String fabricante;      //VARIAVEL FABRICANTE DO TIPO TEXTO
    protected String modelo;          //VARIAVEL MODELO DO TIPO TEXTO
    protected String cor;             //VARIAVEL COR DO TIPO TEXTO
    protected String placa;           //VARIAVEL PLACA DO TIPO TEXTO
    protected String chassi;          //VARIAVEL CHASSI DO TIPO TEXTO
    protected int anoDeFabricacao;    //VARIAVEL ANO DE FABRICACAO DO TIPO INTEIRO
    protected boolean alugado;        //VARIAVEL ALUGADO DO TIPO BOLEANO(VERDADEIRO OU FALSO)
    protected double valorAluguel;    //VARIAVEL VALOR ALUGADO DO TIPO REAL           
    
    //MÉTODO QUE RETORNA O NOME DO VEICULO
    public String getNome() {
        return nome;
    }

    //MÉTODO QUE DEFINE/ALTERA O NOME DO VEICULO
    public void setNome(String nome) {
        this.nome = nome;
    }

    //MÉTODO QUE RETORNA O FABRICANTE DO VEICULO
    public String getFabricante() {
        return fabricante;
    }

    //MÉTODO QUE DEFINE/ALTERA O FABRICANTE DO VEICULO
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    //MÉTODO QUE RETORNA O MODELO VEICULO
    public String getModelo() {
        return modelo;
    }
    //MÉTODO QUE DEFINE/ALTERA O MODELO DO VEICULO
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //MÉTODO QUE RETORNA A COR DO VEICULO
    public String getCor() {
        return cor;
    }
    //MÉTODO QUE DEFINE/ALTERA A COR DO VEICULO
    public void setCor(String cor) {
        this.cor = cor;
    }

    //MÉTODO QUE RETORNA A PLACA DO VEICULO
    public String getPlaca() {
        return placa;
    }

    //MÉTODO QUE DEFINE/ALTERA A PLACA DO VEICULO
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    //MÉTODO QUE RETORNA O CHASSI DO VEICULO
    public String getChassi() {
        return chassi;
    }

    //MÉTODO QUE DEFINE/ALTERA O CHASSI DO VEICULO
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    //MÉTODO QUE RETORNA O ANO DE FABRICAÇÃO DO VEICULO
    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    //MÉTODO QUE DEFINE/ALTERA O ANO DE FABRICACAO DO VEICULO
    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    //MÉTODO QUE RETORNA A SITUAÇÃO(ALUGADO) DO VEICULO
    public boolean isAlugado() {
        return alugado;
    }
    
    //MÉTODO QUE DEFINE/ALTERA A SITUAÇÃO(ALUGADO) DO VEICULO
    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    //MÉTODO QUE RETORNA VALOR DO ALUGUEL DO VEICULO
    public double getValorAluguel() {
        return valorAluguel;
    }

    //MÉTODO QUE DEFINE/ALTERA O VALOR DO ALUGUEL DO VEICULO
    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }
}
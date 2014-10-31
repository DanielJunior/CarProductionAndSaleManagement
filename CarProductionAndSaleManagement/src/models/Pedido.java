/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author danieljr
 */
public class Pedido {

    private Date data;
    private double valor;
    private Modelo modelo;
    private Funcionario responsavel;
    private Cliente comprador;
    private Fabrica fabrica;

    public Pedido(Date data, double valor, Modelo modelo, Funcionario responsavel, Cliente comprador, Fabrica fabrica) {
        this.data = data;
        this.valor = valor;
        this.modelo = modelo;
        this.responsavel = responsavel;
        this.comprador = comprador;
        this.fabrica = fabrica;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Funcionario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Funcionario responsavel) {
        this.responsavel = responsavel;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public Fabrica getFabrica() {
        return fabrica;
    }

    public void setFabrica(Fabrica fabrica) {
        this.fabrica = fabrica;
    }

}

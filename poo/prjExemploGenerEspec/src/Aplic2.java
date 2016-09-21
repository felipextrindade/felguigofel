/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felipe
 */
import fatec.poo.model.*;
import java.text.DecimalFormat;

public class Aplic2 {

    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("#,##0.00");

        Funcionario Cadastro[] = new Funcionario[3];

        Cadastro[0] = new FuncionarioHorista(1010, "Carlos Silva", "14/11/1985", 15.80);
        Cadastro[1] = new FuncionarioMensalista(2020, "Ana Beatriz", "21/11/1990", 2.5);
        Cadastro[2] = new FuncionarioComissionado(3030, "Pedro Souza", "30/04/1997", 3);

        System.out.println("Nome: " + Cadastro[0].getNome());
        System.out.println("Nome: " + Cadastro[1].getNome());
        System.out.println("Nome: " + Cadastro[2].getNome());

        for (int i = 0; i < Cadastro.length; i++) {

            System.out.println("\nFuncionario: " + Cadastro[i].getNome());
            System.out.println("Registro: " + Cadastro[i].getRegistro());
            System.out.println("Data de Adimissao: " + Cadastro[i].getDtAdimissao());

            if (Cadastro[i] instanceof FuncionarioHorista) {
                Cadastro[i].setCargo("Programador");
                ((FuncionarioHorista) Cadastro[i]).apontarHoras(90);
                System.out.println("Cargo: " + Cadastro[i].getCargo());
                System.out.println("Salario Bruto: " + formato.format(((FuncionarioHorista) Cadastro[i]).calcSalBruto()));
                System.out.println("Desconto: " + formato.format(Cadastro[i].calcDesconto()));
                System.out.println("Gratificacao: " + formato.format(((FuncionarioHorista) Cadastro[i]).calcGratificacao()));
                System.out.println("Salario Liquido: " + formato.format(((FuncionarioHorista) Cadastro[i]).calcSalLiquido()));
            } else if (Cadastro[i] instanceof FuncionarioMensalista) {
                Cadastro[i].setCargo("Analista");
                ((FuncionarioMensalista) Cadastro[i]).apontarValSalMin(760);
                System.out.println("Cargo: " + Cadastro[i].getCargo());
                System.out.println("Salario Bruto: " + formato.format(((FuncionarioMensalista) Cadastro[i]).calcSalBruto()));
                System.out.println("Desconto: " + formato.format(Cadastro[i].calcDesconto()));
                System.out.println("Salario Liquido: " + formato.format(((FuncionarioMensalista) Cadastro[i]).calcSalLiquido()));
            } else if (Cadastro[i] instanceof FuncionarioComissionado) {
                Cadastro[i].setCargo("Auxiliar");
                ((FuncionarioComissionado) Cadastro[i]).setSalBase(980);
                ((FuncionarioComissionado) Cadastro[i]).addVendas(5001);
                System.out.println("Cargo: " + Cadastro[i].getCargo());
                System.out.println("Salario Bruto: " + formato.format(((FuncionarioComissionado) Cadastro[i]).calcSalBruto()));
                System.out.println("Salario Base: " + formato.format(((FuncionarioComissionado) Cadastro[i]).getSalBase()));
                System.out.println("Taxa de Comissao: " + ((FuncionarioComissionado) Cadastro[i]).getTaxaComissao() + "%");
                System.out.println("Desconto: " + formato.format(Cadastro[i].calcDesconto()));
                System.out.println("Total de Vendas: " + formato.format(((FuncionarioComissionado) Cadastro[i]).getTotalVendas()));
                System.out.println("Gratificacao: " + formato.format(((FuncionarioComissionado) Cadastro[i]).calcGratificacao()));
                System.out.println("Porcentagem: " + ((FuncionarioComissionado) Cadastro[i]).calcPorcentGrat() + "%");
                System.out.println("Salario Liquido: " + formato.format(((FuncionarioComissionado) Cadastro[i]).calcSalLiq()));
            }

        }
    }

}

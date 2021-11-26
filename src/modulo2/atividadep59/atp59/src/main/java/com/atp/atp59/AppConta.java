package com.atp.atp59;

import com.atp.atp59.dao.ContaDao;
import com.atp.atp59.model.Conta;

public class AppConta {
    public static void main(String[] args) {
        ContaDao dao = new ContaDao();

        Conta conta = new Conta();
        conta.setAgencia("0021");
        conta.setNumero_conta("0235-1");

        dao.create(conta);

        Conta contaUpdate = new Conta();
        contaUpdate.setId(1);
        contaUpdate.setAgencia("1020");
        contaUpdate.setNumero_conta("00013-1");
        dao.update(contaUpdate);

        dao.delete(3);

        for (Conta c : dao.read()) {
            System.out.printf("ID: %d - AGENCIA: %s - CONTA: %s\n",c.getId(),c.getAgencia(),c.getNumero_conta());
        }
    }
}

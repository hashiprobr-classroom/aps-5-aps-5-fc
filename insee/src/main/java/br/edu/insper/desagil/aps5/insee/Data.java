package br.edu.insper.desagil.aps5.insee;

import java.util.HashMap;
import java.util.Map;

public class Data extends Referencia{
    private int ano = 1970;
    private int mes = 1;
    private int dia = 1;
    private Map<Integer, Integer> limites = new HashMap<>();

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public Map<Integer, Integer> getLimites() {
        return limites;
    }

    Data() {
        limites.put(1, 31);
        limites.put(2, 28);
        limites.put(3, 31);
        limites.put(4, 30);
        limites.put(5, 31);
        limites.put(6, 30);
        limites.put(7, 31);
        limites.put(8, 31);
        limites.put(9, 30);
        limites.put(10, 31);
        limites.put(11, 30);
        limites.put(12, 31);
    }

    public void atualiza(int ano,int mes,int dia){
        if (ano<1970) {
            this.ano = 1970;
        }
        if (mes < 1) {
            this.mes = 1;
        } else if (mes > 12) {
            this.mes = 12;
        } else this.mes = mes;
        if (dia < 1){
            this.dia = 1;
        } else if (dia > limites.get(this.getMes())) {
            this.dia = limites.get(this.getMes());
        } else this.dia = dia;
    }

    @Override

    public int comoInteiro(){
        int dias = 0;

        dias += (this.getAno() - 1970)*365;

        int i = 1;

        while (i < this.getMes()) {
            dias += limites.get(i);
            i += 1;
        }

        dias += this.getDia() - 1;

        return dias;
    }
}

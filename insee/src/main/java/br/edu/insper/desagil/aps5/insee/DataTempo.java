package br.edu.insper.desagil.aps5.insee;

public class DataTempo extends Referencia{
    private Data data = new Data();
    private Tempo tempo = new Tempo();

    public Data getData() {
        return data;
    }

    public Tempo getTempo() {
        return tempo;
    }

    @Override

    public int comoInteiro() {
        return this.tempo.comoInteiro() + this.data.comoInteiro()*24*60;
    }
}

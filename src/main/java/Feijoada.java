public class Feijoada implements Prato {

    public float valor;

    public Feijoada() {

    }

    public Feijoada (Float valor) {
        this.valor = valor;
    }

    @Override
    public float getValorPedido() {
        return valor;
    }

    @Override
    public String getNomePedido() {
        return "Feijoada";
    }
}

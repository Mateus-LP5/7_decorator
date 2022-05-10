public class Refrigerante extends PratoDecorator {

    public Refrigerante (Prato prato) {
        super(prato);
    }

    @Override
    public float getValor() {
        return 8.0f;
    }

    @Override
    public String getPedido() {
        return "Refrigerante";
    }

}

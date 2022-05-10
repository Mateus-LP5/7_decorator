public class Espetinho extends PratoDecorator{

    public Espetinho (Prato prato) {
        super(prato);
    }

    @Override
    public float getValor() {
        return 15.0f;
    }

    @Override
    public String getPedido() {
        return "Espetinho";
    }
}

public class Sobremesa extends PratoDecorator {

    public Sobremesa (Prato prato) {
        super(prato);
    }

    @Override
    public float getValor() {
        return 10.0f;
    }

    @Override
    public String getPedido() {
        return "Sobremesa";
    }

}

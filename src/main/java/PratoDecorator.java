public abstract class PratoDecorator implements  Prato {

    private Prato prato;
    private String pedido;

    public PratoDecorator (Prato prato) {
        this.prato = prato;
    }

    public Prato getPrato() {
        return this.prato;
    }

    public void setPrato (Prato prato) {
        this.prato = prato;
    }

    public abstract float getValor();

    public float getValorPedido(){
        return this.prato.getValorPedido() + this.getValor();
    }

    public abstract String getPedido();

    public String getNomePedido() {
        return this.prato.getNomePedido() + " + " + this.getPedido();
    }

    public void setPedido (String pedido){
        this.pedido = pedido;
    }

}

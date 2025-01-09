package lsp.correto.formas;

//sei que dá pra fazer menor, usando somente "lado", mas preferi usar assim, para manter a comparação entre as classes.
public class Quadrado implements Forma{
    private int altura;
    private int largura;

    public Quadrado (int lado){
        this.altura = lado;
        this.largura = lado;
    }

    public void setAltura(int lado) {
        this.altura = lado;
    }

    public void setLargura(int lado) {
        this.largura = lado;
    }

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }

    @Override
    public int getArea(){
        return altura * largura;
    }
}

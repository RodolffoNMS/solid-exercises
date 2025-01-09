package lsp.correto.formas;

public class Retangulo implements Forma {

    private int altura;
    private int largura;

    public Retangulo(int largura, int altura){
        this.altura = altura;
        this.largura = largura;
    }

    public void  setAltura(int altura){
        this.altura = altura;
    }

    public void setLargura(int altura){
        this.largura = largura;
    }

    public int getAltura(int altura){
        return  altura;
    }

    public int getLargura(int largura){
        return  largura;
    }

    @Override
    public int getArea() {
        return largura * altura;
    }
}

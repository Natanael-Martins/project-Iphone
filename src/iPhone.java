package src;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    public void tocar() {
        System.out.println("Tocando música...");
    }

    public void pausar() {
        System.out.println("Pausando música...");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

    public void ligar() {
        System.out.println("Ligando o telefone...");
    }

    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página da internet...");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    
    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone(); 
        meuiPhone.tocar();
        meuiPhone.ligar();
        meuiPhone.exibirPagina();
    }
}
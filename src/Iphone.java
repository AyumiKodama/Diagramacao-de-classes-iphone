
public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico{


        public void tocarMusica() {
            System.out.println("REPRODUZINDO MUSICA");
        }
    
    
        public void selecionarMusica() {
            System.out.println("SELECIONANDO MÚSICA");
        }
    
    
        public void pausar() {
            System.out.println("PAUSANDO MÚSICA");
        }
    
    
        
        public void ligar() {
            System.out.println("LINGANDO");
        }
        
        public void atender() {
            System.out.println("ATENDENDO");
        }
    
    
        
        public void iniciarCorreioVoz() {
            System.out.println("INICIANDO CORREIO DE VOZ");
        }
    
    
        
        public void exibirPagina(String urStringl) {
            System.out.println("EXIBINDO PÁGINA");
        }
    
    
        
        public void adicionarNovaAba() {
            System.out.println("ADICIONANDO NOVA ABA");
            
        }
    
    
        
        public void atualizarPagina() {
            System.out.println("ATUALIZANDO PÁGINA");
        }
        
        public static void main(String[] args) {
            Iphone meuIphone = new Iphone();
            System.out.println("Aparelho telêfonico:");
            meuIphone.ligar();
            meuIphone.atender();
            meuIphone.iniciarCorreioVoz();

            System.out.println("Reprodutor Musical:");
            meuIphone.selecionarMusica();
            meuIphone.tocarMusica();
            meuIphone.pausar();

            System.out.println("Navegador internet:");
            meuIphone.exibirPagina(null);
            meuIphone.adicionarNovaAba();
            meuIphone.atualizarPagina();
        }
    }
    


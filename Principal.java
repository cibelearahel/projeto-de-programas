package JogoAV1;

public class Principal {
	
	public static void main(String[] args) {
		int[][] espaco = new int[10][10];
		int[][] navee = new int[1][2];
		int[][] jogador = new int[1][2];
		int[] tiro = new int[2];
		int vidas = 3;
	    int hp = 100;
	    int tentativas=1;
	    int[] mov = new int[2];

	    
	    Jogador.iniciaJogador(jogador);
	    
	    do{
	    	System.out.println("VIDAS:"+ vidas + "\t\t\t\tHP:"+ hp + "\t\t\t\t\tROUND:"+ tentativas);
	    	System.out.println();
	    	
	    	Interface.inicializaEspaco(espaco);
            Interface.mostraEspaco(espaco, navee, jogador);
            
            Inimigo.iniciaInimigo(navee);
            Jogador.movimentar(mov, jogador);
            Jogador.darTiro(tiro);
            tentativas++;
            Inimigo.acertou(tiro,navee);
            Jogador.colidiu(navee,jogador);
            
            
            System.out.println();
            System.out.println();

        }while(vidas!=0 || hp!=0);
	    
	    if(vidas==0) {
	    	System.out.println("\n\n\nJogo terminado. Você perdeu!!! ");
	    }
	    if(hp==0) {
	    	System.out.println("\n\n\nVocê derrotou  a nave inimiga, parabéns!!! ");
	    }

	}
	
    }
	


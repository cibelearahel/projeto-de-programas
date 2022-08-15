package JogoAV1;

import java.util.Scanner;

public class Jogador {
	
	public static void iniciaJogador(int[][] jogador){
	    jogador[0][0]=9;
	    jogador[0][1]=4;
	   
    }
	
	public static void movimentar(int[] mov, int[][]jogador){
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.println();
        
        System.out.print("Mover para: ");
        mov[0] = entrada.nextInt();
        
        if(mov[0]==8){
        	jogador[0][0]--;
            
        }else if(mov[0]==2) {
        	jogador[0][0]++;
        }else if(mov[0]==4) {
        	jogador[0][1]--;
        }else if(mov[0]==6) {
        	jogador[0][1]++;
        }
    }
	
	public static void tratamentoDasBordas(int [][]jogador, int [][]salvar) {
		
		if (jogador [0][1] == 10|| jogador[0][0] == 10) {
			System.out.println("Cuidado!Vc quase saiu do tabuleiro!!");
			jogador[0][0] = salvar[0][0];
			jogador[0][1] = salvar[0][1];
		}
	}
	
	public static void obterPosicaoDoJogador(int [][]jogador, int[][]salvar) {
		salvar [0][1] = jogador [0][1];
		salvar [0][0] = jogador [0][0];
		
	}
	
	public static void darTiro(int[] tiro){
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.println("Digite as coordenadas do tiro!!!");
        
        System.out.print("Linha: ");
        tiro[0] = entrada.nextInt();
        tiro[0]--;
        
        System.out.print("Coluna: ");
        tiro[1] = entrada.nextInt();
        tiro[1]--;
        
    }
	
	public static void colidiu(int[][] navee, int[][] jogador){
		int jog = 0;
		int nave =0;
		int vidas =3;
            if(navee[nave][0]==jogador[jog][0] && navee[nave][1]==jogador[jog][1]){
                System.out.printf("Você colidiu com o inimigo (%d,%d)\n",navee[nave][0]+1,navee[nave][1]+1);
                vidas-=1;
                System.out.println(vidas);
            }
    }
}

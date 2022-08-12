package JogoAV1;
import java.util.Random;

public class Inimigo {
	
	public static void iniciaInimigo(int[][] navee){
        Random sorteio = new Random();
        int nave =0;
	    navee[nave][0]=sorteio.nextInt(10);
	    navee[nave][1]=sorteio.nextInt(10);
	   
    }
	public static boolean acertou(int[] tiro, int[][] navee){
		int hp = 100;
		int nave =0;
            if( tiro[0]==navee[nave][0] || tiro[1]==navee[nave][1]){
                System.out.printf("Você acertou o tiro!!! (%d,%d)\n",tiro[0]+1,tiro[1]+1);
                hp-=10;
                System.out.println(hp);
                return true;
            }
        return false;
    }
}

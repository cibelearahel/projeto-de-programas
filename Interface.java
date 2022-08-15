package JogoAV1;

public class Interface {
	
	public static void nomeJogo() {
		System.out.println("  _________   ____    __   ___      __    __  ____ ____  \r\n"
	    		+ " / ___/    \\ /    |  /  ] /  _]    |  |__|  |/    |    \\ \r\n"
	    		+ "(   \\_|  o  )  o  | /  / /  [_     |  |  |  |  o  |  D  )\r\n"
	    		+ " \\__  |   _/|     |/  / |    _]    |  |  |  |     |    / \r\n"
	    		+ " /  \\ |  |  |  _  /   \\_|   [_     |  `  '  |  _  |    \\ \r\n"
	    		+ " \\    |  |  |  |  \\     |     |     \\      /|  |  |  .  \\\r\n"
	    		+ "  \\___|__|  |__|__|\\____|_____|      \\_/\\_/ |__|__|__|\\_|");
	    System.out.println();
	    System.out.println();
	}
	
	public static void inicializaEspaco(int[][] espaco){
        for(int linha=0 ; linha < 10 ; linha++ )
            for(int coluna=0 ; coluna < 10 ; coluna++ )
                espaco[linha][coluna]=-1;
    }
	
	public static void mostraEspaco(int[][] espaco, int[][] navee, int[][] jogador){
        System.out.println("\t1 \t2 \t3 \t4 \t5 \t6 \t7 \t8 \t9 \t10");
        System.out.println();
        espaco[navee[0][0]][navee[0][1]] = 1;
        espaco[jogador[0][0]][jogador[0][1]] = 2;
        
        for(int linha=0 ; linha < 10 ; linha++ ){
            System.out.print((linha+1)+"");
            for(int coluna=0 ; coluna < 10 ; coluna++ ){
                if(espaco[linha][coluna]==-1){
                    System.out.print("\t"+"_|");
                }else if(espaco[linha][coluna]==1){
                    System.out.print("\t"+"⩤𐅡⩥");
                }else if(espaco[linha][coluna]==2){
                    System.out.print("\t"+"◄○►");
                }
                
            }
            System.out.println();
        }
	}
}
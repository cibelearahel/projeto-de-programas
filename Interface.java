package JogoAV1;

public class Interface {
	
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

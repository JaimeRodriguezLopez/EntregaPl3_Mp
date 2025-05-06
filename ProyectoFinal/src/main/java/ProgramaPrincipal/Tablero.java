package ProgramaPrincipal;

public class Tablero {
    private NodoTablero[][] nodoTablero;
    public Tablero(int base, int altura) {
        nodoTablero = new NodoTablero[base][altura];

        for (int x = 0; x < base; x++) {
            for (int y = 0; y < altura; y++) {
                nodoTablero[x][y] = new NodoTablero(x, y);
            }
        }

        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                if(i==0 && j==0) {
                    nodoTablero[i][j].setNorte(nodoTablero[i+1][j]);
                    nodoTablero[i][j].setEste(nodoTablero[i][j+1]);
                } else if (i == 0 && j != base-1) {
                    nodoTablero[i][j].setNorte(nodoTablero[i+1][j]);
                    nodoTablero[i][j].setEste(nodoTablero[i][j+1]);
                    nodoTablero[i][j].setOeste(nodoTablero[i][j-1]);
                } else if (i == 0 && j == base-1 ) {
                    nodoTablero[i][j].setNorte(nodoTablero[i+1][j]);
                    nodoTablero[i][j].setOeste(nodoTablero[i][j-1]);
                } else if(i == altura-1 && j == 0){
                    nodoTablero[i][j].setSur(nodoTablero[i-1][j]);
                    nodoTablero[i][j].setEste(nodoTablero[i][j+1]);
                } else if (i == altura-1 && j == base-1) {
                    nodoTablero[i][j].setSur(nodoTablero[i-1][j]);
                    nodoTablero[i][j].setOeste(nodoTablero[i][j-1]);
                } else if(i == altura-1 && j != 0){
                    nodoTablero[i][j].setSur(nodoTablero[i-1][j]);
                    nodoTablero[i][j].setOeste(nodoTablero[i][j-1]);
                    nodoTablero[i][j].setEste(nodoTablero[i][j+1]);
                } else if(j == base-1){
                    nodoTablero[i][j].setSur(nodoTablero[i-1][j]);
                    nodoTablero[i][j].setOeste(nodoTablero[i][j-1]);
                    nodoTablero[i][j].setNorte(nodoTablero[i+1][j]);
                } else if(j == 0){
                    nodoTablero[i][j].setSur(nodoTablero[i-1][j]);
                    nodoTablero[i][j].setEste(nodoTablero[i][j+1]);
                    nodoTablero[i][j].setNorte(nodoTablero[i+1][j]);
                } else {
                    nodoTablero[i][j].setSur(nodoTablero[i-1][j]);
                    nodoTablero[i][j].setOeste(nodoTablero[i][j-1]);
                    nodoTablero[i][j].setNorte(nodoTablero[i+1][j]);
                    nodoTablero[i][j].setEste(nodoTablero[i][j+1]);
                }
            }
        }
    }
    public NodoTablero getNodoTablero(int i, int j) {
        return nodoTablero[i][j];
    }
}

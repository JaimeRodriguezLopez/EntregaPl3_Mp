package ProgramaPrincipal;

public abstract class Unidad {
    protected int coordX;
    protected int coordY;
    protected String nombre;
    protected int hp;
    protected int maxHp;
    protected int ataque;
    protected int defensa;
    protected int RgMovimiento;
    protected int RgAtaque;
    protected boolean vivo;
    protected String bando;//Aqui ponemos de que lado es para la gestion de la partida
    protected int id;

    public Unidad(String nombre, int hp, int ataque, int def, int RgMovimiento, int RgAtaque, String bando,int id) {
        this.nombre = nombre;
        this.hp = hp;
        this.ataque = ataque;
        this.defensa = def;
        this.RgMovimiento = RgMovimiento;
        this.vivo = true;
        this.bando = bando;
        this.maxHp = hp;
        this.RgAtaque = RgAtaque;
        this.id = id;
    }
}

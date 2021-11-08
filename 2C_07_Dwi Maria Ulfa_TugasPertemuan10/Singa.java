
public class Singa extends Binatang implements IHerbivora {
    private String suara;
    private String warnaBulu;
    
    public Singa(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama,jmlKaki);
        this.suara=suara;
        this.warnaBulu=warnaBulu;
    }
    public void displayMakan(){
        System.out.println("singa makan ulpa");
    }
    public void displayBinatang(){
        System.out.println("buas");

    }
    public void displayData(){
        System.out.println("suara: "+suara);
        System.out.println("warna Bulu: "+warnaBulu);

    }

}

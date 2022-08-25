public class Dranza  extends  Beyblade{
    private String kutsalCanavar;

    public Dranza(String beybladeci, int donus_hizi, int saldiri_gucu,String kutsalCanavar) {
        super(beybladeci, donus_hizi, saldiri_gucu);
        this.kutsalCanavar=kutsalCanavar;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci()+" " + kutsalCanavar + " kutsal canavari ortaya cikartiyor.");
    }

    @Override
    public void bilgileri_goster() {
        super.bilgileri_goster();
        System.out.println("Kutsal Canavarin Adi = " + kutsalCanavar);
    }
}




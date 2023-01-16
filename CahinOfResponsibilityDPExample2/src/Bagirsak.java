public class Bagirsak implements Sindirim{

    private Sindirim sonrakiniSindir;

    public void setSonrakiniSindir(Sindirim sindir) {
        this.sonrakiniSindir = sindir;
    }

    @Override
    public void sindir(String besin) {
        System.out.println("Bagirsak besini sindiriyor..." + besin);
        if(besin != null){
            sonrakiniSindir.sindir(besin);
        }
    }
}



public class Main {
    public static void main(String[] args) {
        Agiz agiz = new Agiz();
        Mide mide = new Mide();
        Bagirsak bagirsak = new Bagirsak();
        agiz.setSonrakiniSindir(mide);
        mide.setSonrakiniSindir(bagirsak);

        agiz.sindir("Hamburger");


    }
}
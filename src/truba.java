public class truba implements instrument{
    int diametr;

    public truba (int diametr){
        this.diametr = diametr;
    }
    @Override
    public void play() {
        System.out.println("Играет труба с диаметром " + diametr + ".");
    }
}
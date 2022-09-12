public class guitar implements instrument{
    int kolStrun;
    public guitar(int kolStrun){
        this.kolStrun = kolStrun;
    }
    @Override
    public void play() {
        System.out.println("Играет " + kolStrun + "-струнная гитара.");
    }
}

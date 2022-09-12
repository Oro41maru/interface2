public class baraban implements instrument{
    int razmer;

    public baraban(int razmer){
       this.razmer = razmer;
    }
    @Override
    public void play() {
        System.out.println("Играет барабан с размером " + razmer);
    }
}

package in.crazyvibes.pure_dependency_injection_example;

public class SIMCard {
    private ServiceProvider serviceProvider;

    public SIMCard(ServiceProvider serviceProvider) {
        this.serviceProvider=serviceProvider;
    }
}

public class Dog implements Pet{

    private String breed;
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String makeSound() {
        return "Arf, Arf!";
    }

    @Override
    public String play() {
        return "Playing fetch";
    }
}

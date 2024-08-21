import java.util.Scanner;

public class Clinic {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean check = false;

    while (!check){
        System.out.println("[1] Dog");
        System.out.println("[2] Cat");
        System.out.println("[3] Exit");
        System.out.println("Choose your pet number: ");
        Integer choice = scan.nextInt();

        PetRecord petRecord = new PetRecord();
        Pet pet;
        switch(choice){
            case 1: pet = new Dog();
                petRecord.setPetId("D01");
                petRecord.setPetName("Bantay");
                petRecord.setPet(pet);
                ((Dog)pet).setBreed("German Shepperd");
                System.out.println("Pet id is " + petRecord.getPetId());
                System.out.println("Pet name is " + petRecord.getPetName());
                System.out.println("Pet kind: " + petRecord.getPet().getClass().getSimpleName());
                System.out.println("Breed: " + ((Dog)pet).getBreed());
                System.out.println("Communication sound: "+ petRecord.getPet().makeSound());
                System.out.println("Play mode: " + petRecord.getPet().play());
                System.out.println();
                break;
            case 2: pet = new Cat();
                petRecord.setPetId("C01");
                petRecord.setPetName("Muning");
                petRecord.setPet(pet);
                ((Cat)pet).setNoOfLives(9);
                System.out.println("Pet id is " + petRecord.getPetId());
                System.out.println("Pet name is " + petRecord.getPetName());
                System.out.println("Pet kind: " + petRecord.getPet().getClass().getSimpleName());
                System.out.println("Communication sound: "+ petRecord.getPet().makeSound());
                System.out.println("Play mode: " + petRecord.getPet().play());
                System.out.println("Number of Lives: " + ((Cat)pet).getNoOfLives());
                System.out.println();
                break;
            case 3: check = true;
                System.out.println("French Anthony D. Montajes - 3 BSCS 1");
                System.out.println();
        }

    }

    }
}

public class Main {
    public static void main(String[] args)
    {
        Accessories accessories = new Accessories();
        accessories.setNamecpu("Процесор AMD Ryzen 7 5800X 3.8 GHz");
        accessories.setNamegpu("Palit PCI-Ex GeForce RTX 4090 GameRock 24GB GDDR6X");
        accessories.setNameram("Оперативна пам'ять Kingston FURY DDR5-6000 32768MB PC5-48000");
        System.out.println("Name CPU - " + accessories.getNamecpu()+"Name GPU - "+ accessories.getNamegpu()+ "Name RAM - "+ accessories.getNameram());
    }
}
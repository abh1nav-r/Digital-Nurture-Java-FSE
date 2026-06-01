interface Playable {

    // Method declaration
    void play();
}

// Guitar class implementing interface
class Guitar implements Playable {

    public void play() {
        System.out.println("Guitar is playing");
    }
}

// Piano class implementing interface
class Piano implements Playable {

    public void play() {
        System.out.println("Piano is playing");
    }
}

public class Interface_implementation {

    public static void main(String[] args) {

        // Creating objects
        Guitar g = new Guitar();
        Piano p = new Piano();

        // Calling play methods
        g.play();
        p.play();
    }
}
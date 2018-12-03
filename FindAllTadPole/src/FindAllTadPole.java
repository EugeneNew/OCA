import java.util.ArrayList;
import java.util.List;

public class FindAllTadPole {
    public static void main(String[] args) {
        List<Tadpole> tadpoles = new ArrayList<Tadpole>();
        for (Amphibian amphibian : tadpoles) {
            CanSwim tadpole = amphibian;
        }
    }
}
import java.nio.files.Files;

class readalllinesTest {
    public static void main(String[] args) {
        List<String> lines = Files.readAllLines(Paths.get(filename), StandardCharsets.UTF_8);
    }
}
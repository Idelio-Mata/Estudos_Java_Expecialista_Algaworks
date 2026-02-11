import java.nio.file.*;

public class ExtrairFonte {
    public static void main(String[] args) throws Exception {
        Path origem = Paths.get("SequenciaDeEscape.java");
        Path destino = Paths.get("SequenciaDeEscape.txt");

        Files.copy(origem, destino, StandardCopyOption.REPLACE_EXISTING);

        System.out.println("Código copiado com sucesso.");
    }
}

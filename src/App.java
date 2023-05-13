import java.io.FileInputStream;
import java.util.Properties;

public class App {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/app.properties"));
        String OPENAI_API_KEY = properties.getProperty("OPENAI_API_KEY");
        System.out.println(OPENAI_API_KEY);

        ChatGPTClient client = new ChatGPTClient();

        String pergunta = client.criarPergunta(
            OPENAI_API_KEY,
            "Python",
            "Alternativa",
            "Muito dificil",
            null
        );
        System.out.println(pergunta);
    }
}

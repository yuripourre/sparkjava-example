
import static spark.Spark.*;

/**
 * A simple http server using SparkJava
 *
 * Access the server on: http://localhost:4567/
 *
 * Reference:
 * SparkJava - https://github.com/perwendel/spark
 */
public class Web {
    public static void main(String[] args) {
        get("/", (req, res) -> "Hello World");
    }
}


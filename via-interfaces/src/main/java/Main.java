import io.swagger.v3.core.util.Yaml;
import io.swagger.v3.jaxrs2.integration.JaxrsOpenApiContextBuilder;
import io.swagger.v3.oas.models.OpenAPI;

public final class Main {

    public static void main(String[] args) throws Exception {
        OpenAPI oas = new JaxrsOpenApiContextBuilder<>().buildContext(true).read();
        System.out.println(Yaml.mapper().writeValueAsString(oas));
    }

}

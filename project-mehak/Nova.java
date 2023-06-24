import org.apache.camel.Exchange;
import org.apache.camel.component.bean.Named;
import org.apache.camel.component.bean.BindToRegistry;

@Named("novaBean")
@BindToRegistry(novaBean)
public class Nova {

    /**
     * Get the name from body and store it in exchange
     * @param exchange
     */
    public void getNameFromBody(Exchange exchange) {
        String name = exchange.getIn().getBody(String.class);
        exchange.setProperty("name", name);
    }

}
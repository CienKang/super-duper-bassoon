import org.apache.camel.Exchange;
import org.apache.camel.component.bean.Named;
import org.apache.camel.component.bean.BindToRegistry;

@Named("novaBean")
@BindToRegistry("novaBean")
public class Authentication {
    
    public void getNameFromBody(Exchange exchange) {
    	// Get username from body and store it in exchange Property
        String username = exchange.getIn().getBody(String.class);
        exchange.setProperty("username", username);
    }

}
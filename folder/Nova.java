import org.apache.camel.Exchange;
import org.apache.camel.component.bean.Named;
import org.apache.camel.component.bean.BindToRegistry;

/**
 * This class is used to get username from body and store it 
 */
@Named("novaBean")
@BindToRegistry(novaBean)
public class Nova {
    
    /**
     * This method is used to get username from body
     * @param exchange
     */
    public void getUsernameFromBody(Exchange exchange) {
        String username = (String) exchange.getIn().getBody();
        exchange.setProperty("username", username);
    }
}
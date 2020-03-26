import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;

public class TriggerLambda implements RequestHandler<Map, String> {

    @Override
    public String handleRequest(Map s, Context context) {
        context.getLogger().log("Input: " +"Executed the lambda");
        return "The Lambda function is executed";
    }


}



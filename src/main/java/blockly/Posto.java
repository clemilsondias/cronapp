package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Posto {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Posto
public static Var obterDadosCEP() throws Exception {
 return new Callable<Var>() {

   private Var url = Var.VAR_NULL;

   public Var call() throws Exception {

    url =
    Var.valueOf(
    Var.valueOf("https://viacep.com.br/ws/").toString() +
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Posto.active.cep")).toString() +
    Var.valueOf("/json/").toString());
    return Var.VAR_NULL;
   }
 }.call();
}

}


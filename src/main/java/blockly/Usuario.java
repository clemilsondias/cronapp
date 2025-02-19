package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity(post = "Public", get = "Public", execute = "Public", delete = "Public", put = "Public")
public class Usuario {

public static final int TIMEOUT = 300;

/**
 *
 * @param nome
 * @param email
 * @param senha
 * @param confirmaSenha
 * @return Var
 */
// Usuario
public static Var cadastrar(Var nome, Var email, Var senha, Var confirmaSenha) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {

    if (
    Var.valueOf(senha.equals(confirmaSenha)).getObjectAsBoolean()) {

        cronapi.database.Operations.insert(Var.valueOf("app.entity.User"),Var.valueOf("password",
        cronapi.util.Operations.encryptPassword(senha)),Var.valueOf("normalizedUserName",email),Var.valueOf("name",nome),Var.valueOf("normalizedEmail",email),Var.valueOf("userName",email),Var.valueOf("email",email));

        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
        Var.valueOf("Cadastro efetuado com sucesso!!"));

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.hideIonicModal"),
        Var.valueOf("modal-cadastro"));
    } else {

        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
        Var.valueOf("Senha e confirmação não conferem."));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var obterIdUsuarioLogado() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
cronapi.database.Operations.getField(
cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u.id from User u where u.userName = :userName"),Var.valueOf("userName",
cronapi.util.Operations.getCurrentUserName())),
Var.valueOf("this[0]"));
   }
 }.call();
}

}


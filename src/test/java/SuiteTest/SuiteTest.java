package SuiteTest;

import core.BaseTest;
import modulos.Login.LoginTest;
import modulos.Registro.RegistroTest;
import modulos.Usuario.UsuarioTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(org.junit.runners.Suite.class)
@SuiteClasses({
    LoginTest.class,
    RegistroTest.class,
    UsuarioTest.class
})
public class SuiteTest extends BaseTest {
    //Poderia colocar um Before repetitivo das classes de teste aqui e retirar das classes.
    //Um exemplo disso seria um fluxo que necessita de autenticação para ser realizado.
}

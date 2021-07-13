package co.com.choucair.certification.proyectobase.tasks;


import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Login implements Task {
    private String strUser;
    private String strpassword;

    public Login(String strUser, String strpassword) {
        this.strUser = strUser;
        this.strpassword = strpassword;
    }



    public static Login onThePage(String strUser, String strpassword) {
        return Tasks.instrumented(Login.class,strUser,strpassword);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Enter.theValue(strUser).into(ChoucairLoginPage.INPUT_USER),
                Enter.theValue(strpassword).into(ChoucairLoginPage.INPUT_PASSWORD),
                        Click.on(ChoucairLoginPage.LOGIN_BUTTON));

    }
}

